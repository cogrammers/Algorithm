def quick_sort(arraylist)
  return if arraylist.nil? || arraylist.empty?
  quick_helper(arraylist, 0, arraylist.length - 1)
end

def quick_helper(arraylist, first, last)
  return if first >= last
  left = first; right = last
  pivot = (first + last) / 2
  while (left < right)
    while left <= right && arraylist[left] <= arraylist[pivot]
      left += 1
    end
    while left <= right && arraylist[right] >= arraylist[pivot]
      right -= 1
    end
    if left <= right
      arraylist[left], arraylist[right] = arraylist[right], arraylist[left]
      left += 1; right -= 1
    end
  end
  quick_helper(arraylist, first, right)
  quick_helper(arraylist, left, last)
end

puts arr = [5, 4, 3, 2, 1]
quick_sort(arr)
puts arr
