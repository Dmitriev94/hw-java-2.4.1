package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] salesData) {
        long sum = 0;
        for (long monthSalesSum : salesData) {


            sum = sum + monthSalesSum;
        }
        return sum;
    }

    public long calculateAverage(long[] salesData) {
        long sum = calculateSum(salesData);

        return sum / salesData.length;

    }

    public long findMax(long[] salesData) {
        long currentMax = salesData[0];
        for (long monthSales : salesData) {
            if (currentMax < monthSales) {
                currentMax = monthSales;
            }
        }
        return currentMax;
    }

    public long findMonthWithMax(long[] salesData) {
        long max = findMax(salesData);

        int numberOfMonth = 0;
        int numberOfMonthWithMax = 0;

        for (long monthSales : salesData) {
            numberOfMonth = numberOfMonth + 1;
            if (monthSales == max) {
                numberOfMonthWithMax = numberOfMonth;
            }


        }
        return numberOfMonthWithMax;
    }


    public long findMin(long[] salesData) {

        long currentMin = salesData[0];
        for (long monthSales : salesData) {
            if (currentMin > monthSales) {
                currentMin = monthSales;
            }

        }
        return currentMin;
    }

    public long findMonthWithMin(long[] salesData) {
        long min = findMin(salesData);

        long numberOfMonth = 0;
        long numberOfMonthWithMin = 0;

        for (long monthSales : salesData) {
            numberOfMonth = numberOfMonth + 1;
            if (monthSales == min) {
                numberOfMonthWithMin = numberOfMonth;
            }
        }
        return numberOfMonthWithMin;
    }

    public long amountOfMonthsBelowAverage(long[] salesData) {
        long average = calculateAverage(salesData);

        long countOfMonths = 0;

        for (long monthSales : salesData) {
            if (monthSales < average) {
                countOfMonths = countOfMonths + 1;
            }

        }
        return countOfMonths;
    }

    public long amountOfMonthsAboveAverage(long[] salesData) {
        long average = calculateAverage(salesData);

        int countOfMonths = 0;
        for (long monthSales : salesData) {
            if (average > monthSales) {
                countOfMonths += 1;

            }

        }
        return countOfMonths;
    }

}


