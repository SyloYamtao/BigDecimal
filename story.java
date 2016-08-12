public class Demo06 {
	public static void main(String[] args) {
		//������������
		BigDecimal amount = new BigDecimal(Math.pow(2, 64) - 1);
		//һ�ֵĴ��׵�������һ����52000����һ��1000����
		BigDecimal countPerTon = new BigDecimal(52000 * 1000);
		// ������������һ�����ٶֵĴ���
		BigDecimal totalWight = amount.divideToIntegralValue(countPerTon);
		// �й�����������Ϊ130420000��/�꣬��Ҫ����������
		BigDecimal chinaAnnualProduction = new BigDecimal(130420000);
		BigDecimal yearCost = totalWight.divideToIntegralValue(chinaAnnualProduction);
		System.out.println(yearCost.longValue());
	}
}