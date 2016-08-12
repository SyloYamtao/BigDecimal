public class Demo06 {
	public static void main(String[] args) {
		//棋盘米粒总数
		BigDecimal amount = new BigDecimal(Math.pow(2, 64) - 1);
		//一吨的大米的粒数，一公斤52000粒，一吨1000公斤
		BigDecimal countPerTon = new BigDecimal(52000 * 1000);
		// 棋盘米粒总数一共多少吨的大米
		BigDecimal totalWight = amount.divideToIntegralValue(countPerTon);
		// 中国大米生产量为130420000吨/年，需要生产多少年
		BigDecimal chinaAnnualProduction = new BigDecimal(130420000);
		BigDecimal yearCost = totalWight.divideToIntegralValue(chinaAnnualProduction);
		System.out.println(yearCost.longValue());
	}
}