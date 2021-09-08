import './App.css';
import DataTable from './components/DataTable';
import Footer from './components/Footer';
import NavBar from './components/NavBar';
import BarCharts from './components/BarCharts';

function App() {
  return (
    <>
    <NavBar />
    <div className="container">
      <h1 className="text-primary py-3">DashBoard de venda</h1>
<div className="row px-3">
  <div className="col-sm-6">
    <h5>Taxa de sucesso(%)</h5>
    <BarCharts />
  </div>

  <div className="col-sm-6">
    <h5>Todas as vendas</h5>
    <BarCharts />
  </div>

</div>

      <DataTable />
    </div>
    <Footer />
    </>
  );
}

export default App;
