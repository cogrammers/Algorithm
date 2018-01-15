def merge_sort(arr)
  return if (arr.nil? || arr.empty?)
  sort(arr);
end

def sort(arr, first = 0, last = arr.length - 1, temp = Array.new(arr.length, 0))
  return if first >= last
  mid = (first + last) / 2
  sort(arr, first, mid, temp)
  sort(arr, mid + 1, last, temp)
  merge(arr, first, mid, last, temp)
end

def merge(arr, first, mid, last, temp)
  left = first
  right = mid + 1
  index = first
  while left <= mid && right <= last
    if arr[left] < arr[right]
      temp[index] = arr[left]
      index += 1
      left += 1
    else
      temp[index] = arr[right]
      index += 1
      right += 1
    end
  end
  while left <= mid
    temp[index] = arr[left]
    index += 1
    left += 1
  end
  while right <= last
    temp[index] = arr[right]
    index += 1
    right += 1
  end
  arr = temp
end

arr = [5, 4, 3, 2, 1]
p merge_sort(arr)
merge_sort(arr)
