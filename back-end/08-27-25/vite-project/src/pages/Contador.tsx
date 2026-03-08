import { useState } from "react"

function Contador(){
  const[valor, setValor] = useState(0);

  function handleClick(){
    setValor(valor + 1);
  }

  return(
    <div>
      <h2>Componente Contador</h2>
      <p>O valor atual é: {valor}</p>
      <button onClick={handleClick}>Adicionar 1</button>
    </div>
  )
}
export default Contador