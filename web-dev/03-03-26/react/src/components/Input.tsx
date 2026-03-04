import { useState } from "react"

export default function Input() {
    const [value, setValue] = useState('')
    
    return (
        <div className="flex flex-col gap-2 mb-10 items-center">
            <h1>Input</h1>
            <input 
                type="text" 
                value={value}
                onChange={(e) => setValue(e.target.value)} 
                className={`border border-gray-300 rounded-md p-2 w-100 ${value.length > 20 ? "border-red-500 focus:outline-red-600 focus:outline-2" : ""}`}
            />
            <p className={value.length > 20 ? "text-red-500" : ""}>Você está digitando: {value.length > 20 ? "Valor máximo atingido" : value}</p>
        </div>
    )
}