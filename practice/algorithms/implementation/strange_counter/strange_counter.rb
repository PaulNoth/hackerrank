def cycle_end(time, start, step)
  return start if(start > time)
  cycle_end(time, start + step, step * 2)
end

t = gets.to_i
cycle_end_time = cycle_end(t, 0, 3)
time_diff = cycle_end_time - t
final_value = time_diff + 1
puts final_value