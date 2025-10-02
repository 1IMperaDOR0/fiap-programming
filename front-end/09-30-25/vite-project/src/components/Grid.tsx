export default function GridExemplo() {
  return (
    <div className="grid grid-cols-3 gap-4 p-4">
      {[...Array(6)].map((_, i) => (
        <div key={i} className="bg-purple-300 h-20 flex items-center justify-center">
          {i + 1}
        </div>
      ))}
    </div>
  );
}