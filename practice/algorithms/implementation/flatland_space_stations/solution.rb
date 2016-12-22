(cities, stationCount) = gets.strip.split.map(&:to_i)
stations = gets.strip.split.map(&:to_i).sort

max = 0
for i in (0...(stations.length - 1)) do
  cities_inside = stations[i + 1] - stations[i] - 1;
  d = (cities_inside / 2.0).ceil.to_i;
  max = d if(d > max)
end

max = stations[0] if(stations[0] - 0 > max)
max = cities - 1 - stations[stationCount - 1] if(cities - 1 - stations[stationCount - 1] > max)

puts max;