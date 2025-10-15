import { Link } from 'react-router-dom'

function Navbar() {
    return(
        <>
            <div className="w-full flex justify-center py-4 bg-indigo-900 text-white">
                <div className="w-full conteiner flex justify-between text-lg mx-8">
                    <Link to='/home' className="text-2xl font-bold">Blog Pessoal</Link>
                    <div className="flex gap-5">
                        <p>Postagens</p>
                        <p>Temas</p>
                        <p>Cadastrar</p>
                        <p>Perfil</p>
                        <p>Sair</p>
                    </div>
                </div>
            </div>
        </>
    )
}

export default Navbar;