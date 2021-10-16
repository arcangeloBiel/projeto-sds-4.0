import axios from "axios";
import { useEffect, useState } from "react";
import Chart from "react-apexcharts";
import { SaleSuccess } from "../../types/sale";
import { round } from "../../utils/format";
import { BASE_URL } from "../../utils/request";

type SiriesData = {
  name: string;
  data: number[];
};

type ChartData = {
  labels: {
    categories: string[];
  };

  series: SiriesData[];
};

const BarCharts = () => {
  const [chartData, setChartData] = useState<ChartData>({
    labels: {
      categories: [],
    },
    series: [
      {
        name: "",
        data: [],
      },
    ],
  });

  useEffect(() => {
    axios.get(`${BASE_URL}/sales/success-by-seller`).then((response) => {
      const data = response.data as SaleSuccess[];
      const myLabels = data.map((x) => x.sallerName);
      const mySeries = data.map((x) => round((100.0 * x.deals) / x.visited, 1));
      setChartData({
        labels: {
          categories: myLabels,
        },
        series: [
          {
            name: "% Success",
            data: mySeries,
          },
        ],
      });
      console.log(chartData);
    });
  });

  const options = {
    plotOptions: {
      bar: {
        horizontal: true,
      },
    },
  };

  return (
    <div>
      <Chart
        options={{ ...options, xaxis: chartData.labels }}
        series={chartData.series}
        type="bar"
        height="240"
      />
    </div>
  );
};
export default BarCharts;
