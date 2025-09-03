function Home() {
  return (
    <>
      <div className="bg-indigo-900 flex justify-center">
        <div className="container grid grid-cols-2 text-white">
          <div className="flex flex-col gap-4 items-center justify-center py-4">
            <h2 className="text-5xl font-bold">Sejam bem vindos!!</h2>
            <p className="text-xl">Explore aqui seus pensamentos e opniões.</p>
            <div className="flex justify-around gap-4">
              <div className="rounded text-white border-white border-solid border-2 py-2 px-4">
                Nova postagem
              </div>
            </div>
          </div>
          <div className="flex justify-center">
            <img
              src="https://i.imgur.com/VpwApCU.png"
              alt="Palmeiras"
              className="w-2/3"
            />
          </div>
        </div>
      </div>
    </>
  );
}

export default Home;
