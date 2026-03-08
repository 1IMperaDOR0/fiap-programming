import { useState } from 'react';

type CounterProps = {
    initialValue?: number;
}

export default function Counter({initialValue = 5}: CounterProps) {
    const [counter, setCounter] = useState(initialValue);

    return (
        <div className='flex flex-col items-center gap-2 mb-10'>
            <h1>Counter</h1>
            <div className='flex gap-2 items-center bg-gray-100 rounded-2xl'>
                <button onClick={() => setCounter(counter + 1)} className="bg-green-500 text-white font-bold px-4 py-2 rounded-l-2xl text-xl">+</button>
                <p className='flex gap-2'>Clicks: <p className={counter > 10 ? `text-red-500` : ``}>{counter}</p></p>
                <button onClick={() => counter > 0 ? setCounter(counter - 1) : setCounter(0)} className="bg-red-500 text-white font-bold px-4 py-2 rounded-r-xl text-xl">-</button>
            </div>
            <span>{counter > 10 ? "Limite atingido" : ""}</span>
        </div>
    )
}