def get_max_profit(stock_prices_yesterday)
  if stock_prices_yesterday.length < 2
    raise ArgumentError, 'Getting a profit requires at least 2 prices'
  end

  min_price = stock_prices_yesterday[0]
  max_profit = stock_prices_yesterday[1] - stock_prices_yesterday[0]

  stock_prices_yesterday.each_with_index do |current_price, index|
    next if index.zero?
    potential_profit = current_price - min_price
    max_profit = [max_profit, potential_profit].max
    min_price  = [min_price, current_price].min
  end

  max_profit
end
