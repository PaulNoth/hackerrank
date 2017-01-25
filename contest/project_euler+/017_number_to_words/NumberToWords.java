import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NumberToWords
{
	private static final String ZERO = "Zero";

	private static final String ONE = "One";

	private static final String TWO = "Two";

	private static final String THREE = "Three";

	private static final String FOUR = "Four";

	private static final String FIVE = "Five";

	private static final String SIX = "Six";

	private static final String SEVEN = "Seven";

	private static final String EIGHT = "Eight";

	private static final String NINE = "Nine";

	private static final String TEN = "Ten";

	private static final String ELEVEN = "Eleven";

	private static final String TWELVE = "Twelve";

	private static final String THIRTEEN = "Thirteen";

	private static final String FOURTEEN = "Fourteen";

	private static final String FIFTEEN = "Fifteen";

	private static final String SIXTEEN = "Sixteen";

	private static final String SEVENTEEN = "Seventeen";

	private static final String EIGHTEEN = "Eighteen";

	private static final String NINETEEN = "Nineteen";

	private static final String TWENTY = "Twenty";

	private static final String THIRTY = "Thirty";

	private static final String FORTY = "Forty";

	private static final String FIFTY = "Fifty";

	private static final String SIXTY = "Sixty";

	private static final String SEVENTY = "Seventy";

	private static final String EIGHTY = "Eighty";

	private static final String NINETY = "Ninety";

	private static final String HUNDRED = "Hundred";

	private static final String THOUSAND = "Thousand";

	private static final String MILLION = "Million";

	private static final String BILLION = "Billion";

	private static final String TRILLION = "Trillion";

	private static final Map<Long, String> NUMBER_WORDS = new HashMap<>();

	static
	{
		NUMBER_WORDS.put(0L, ZERO);
		NUMBER_WORDS.put(1L, ONE);
		NUMBER_WORDS.put(2L, TWO);
		NUMBER_WORDS.put(3L, THREE);
		NUMBER_WORDS.put(4L, FOUR);
		NUMBER_WORDS.put(5L, FIVE);
		NUMBER_WORDS.put(6L, SIX);
		NUMBER_WORDS.put(7L, SEVEN);
		NUMBER_WORDS.put(8L, EIGHT);
		NUMBER_WORDS.put(9L, NINE);
		NUMBER_WORDS.put(10L, TEN);
		NUMBER_WORDS.put(11L, ELEVEN);
		NUMBER_WORDS.put(12L, TWELVE);
		NUMBER_WORDS.put(13L, THIRTEEN);
		NUMBER_WORDS.put(14L, FOURTEEN);
		NUMBER_WORDS.put(15L, FIFTEEN);
		NUMBER_WORDS.put(16L, SIXTEEN);
		NUMBER_WORDS.put(17L, SEVENTEEN);
		NUMBER_WORDS.put(18L, EIGHTEEN);
		NUMBER_WORDS.put(19L, NINETEEN);
		NUMBER_WORDS.put(20L, TWENTY);
		NUMBER_WORDS.put(30L, THIRTY);
		NUMBER_WORDS.put(40L, FORTY);
		NUMBER_WORDS.put(50L, FIFTY);
		NUMBER_WORDS.put(60L, SIXTY);
		NUMBER_WORDS.put(70L, SEVENTY);
		NUMBER_WORDS.put(80L, EIGHTY);
		NUMBER_WORDS.put(90L, NINETY);
		NUMBER_WORDS.put(100L, HUNDRED);
		NUMBER_WORDS.put(1_000L, THOUSAND);
		NUMBER_WORDS.put(1_000_000L, MILLION);
		NUMBER_WORDS.put(1_000_000_000L, BILLION);
		NUMBER_WORDS.put(1_000_000_000_000L, TRILLION);
	}

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int tests = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < tests; i++)
		{
			long l = Long.parseLong(scanner.nextLine());
			List<Integer> numbers = new ArrayList<>();
			int divisor = 10;

			while (l > 0)
			{
				int remainder = (int) (l % divisor);
				numbers.add(remainder);
				l /= divisor;
			}

			StringBuilder result = new StringBuilder();
			if (numbers.size() == 0)
			{
				result.append(ZERO);
			}

			for (int index = 0; index < numbers.size();)
			{
				long power = (long) Math.pow(10, index);
				if (power >= 1_000_000_000_000L)
				{
					long number = numbers.get(index++);
					if (number > 0)
					{
						StringBuilder temp = new StringBuilder();
						String wordNumber = NUMBER_WORDS.get(number);
						temp.append(wordNumber);
						temp.append(" ");

						String wordPower = NUMBER_WORDS.get(power);
						temp.append(wordPower);
						temp.append(" ");

						result.insert(0, temp);
					}
				}
				else if (power >= 1_000_000_000)
				{
					long number1 = 0;
					long number2 = 0;
					long number3 = 0;
					if (index < numbers.size())
					{
						number3 = numbers.get(index++);
					}
					if (index < numbers.size())
					{
						number2 = numbers.get(index++);
					}
					if (index < numbers.size())
					{
						number1 = numbers.get(index++);
					}
					if (number1 > 0 || number2 > 0 || number3 > 0)
					{
						StringBuilder temp = new StringBuilder();
						if (number1 > 0)
						{
							String wordNumber = NUMBER_WORDS.get(number1);
							temp.append(wordNumber);
							temp.append(" ");
							temp.append(HUNDRED);
							temp.append(" ");
						}
						if (number2 > 1)
						{
							number2 *= 10;
							String wordNumber = NUMBER_WORDS.get(number2);
							temp.append(wordNumber);
							temp.append(" ");

							if (number3 > 0)
							{
								wordNumber = NUMBER_WORDS.get(number3);
								temp.append(wordNumber);
								temp.append(" ");
							}
						}
						else
						{
							String concat = String.valueOf(number2)
									+ String.valueOf(number3);
							long n = Long.parseLong(concat);
							String wordNumber = NUMBER_WORDS.get(n);
							temp.append(wordNumber);
							temp.append(" ");
						}

						String billion = NUMBER_WORDS.get(1_000_000_000L);
						temp.append(billion);
						temp.append(" ");

						result.insert(0, temp);
					}
				}
				else if (power >= 1_000_000)
				{
					long number1 = 0;
					long number2 = 0;
					long number3 = 0;
					if (index < numbers.size())
					{
						number3 = numbers.get(index++);
					}
					if (index < numbers.size())
					{
						number2 = numbers.get(index++);
					}
					if (index < numbers.size())
					{
						number1 = numbers.get(index++);
					}

					if (number1 > 0 || number2 > 0 || number3 > 0)
					{
						StringBuilder temp = new StringBuilder();
						if (number1 > 0)
						{
							String wordNumber = NUMBER_WORDS.get(number1);
							temp.append(wordNumber);
							temp.append(" ");

							temp.append(HUNDRED);
							temp.append(" ");
						}
						if (number2 > 1)
						{
							number2 *= 10;
							String wordNumber = NUMBER_WORDS.get(number2);
							temp.append(wordNumber);
							temp.append(" ");

							if (number3 > 0)
							{
								wordNumber = NUMBER_WORDS.get(number3);
								temp.append(wordNumber);
								temp.append(" ");
							}
						}
						else
						{
							String concat = String.valueOf(number2)
									+ String.valueOf(number3);
							long n = Long.parseLong(concat);
							String wordNumber = NUMBER_WORDS.get(n);
							temp.append(wordNumber);
							temp.append(" ");
						}

						String million = NUMBER_WORDS.get(1_000_000L);
						temp.append(million);
						temp.append(" ");

						result.insert(0, temp);
					}
				}
				else if (power >= 1_000)
				{
					long number1 = 0;
					long number2 = 0;
					long number3 = 0;
					if (index < numbers.size())
					{
						number3 = numbers.get(index++);
					}
					if (index < numbers.size())
					{
						number2 = numbers.get(index++);
					}
					if (index < numbers.size())
					{
						number1 = numbers.get(index++);
					}

					if (number1 > 0 || number2 > 0 || number3 > 0)
					{
						StringBuilder temp = new StringBuilder();
						if (number1 > 0)
						{
							String wordNumber = NUMBER_WORDS.get(number1);
							temp.append(wordNumber);
							temp.append(" ");

							temp.append(HUNDRED);
							temp.append(" ");
						}
						if (number2 > 1)
						{
							number2 *= 10;
							String wordNumber = NUMBER_WORDS.get(number2);
							temp.append(wordNumber);
							temp.append(" ");

							if (number3 > 0)
							{
								wordNumber = NUMBER_WORDS.get(number3);
								temp.append(wordNumber);
								temp.append(" ");
							}
						}
						else
						{
							String concat = String.valueOf(number2)
									+ String.valueOf(number3);
							long n = Long.parseLong(concat);
							String wordNumber = NUMBER_WORDS.get(n);
							temp.append(wordNumber);
							temp.append(" ");
						}

						String thousand = NUMBER_WORDS.get(1_000L);
						temp.append(thousand);
						temp.append(" ");

						result.insert(0, temp);
					}
				}
				else
				{
					long number1 = 0;
					long number2 = 0;
					long number3 = 0;
					if (index < numbers.size())
					{
						number3 = numbers.get(index++);
					}
					if (index < numbers.size())
					{
						number2 = numbers.get(index++);
					}
					if (index < numbers.size())
					{
						number1 = numbers.get(index++);
					}

					if (number1 > 0 || number2 > 0 || number3 > 0)
					{
						StringBuilder temp = new StringBuilder();
						if (number1 > 0)
						{
							String wordNumber = NUMBER_WORDS.get(number1);
							temp.append(wordNumber);
							temp.append(" ");

							temp.append(HUNDRED);
							temp.append(" ");
						}
						if (number2 > 1)
						{
							number2 *= 10;
							String wordNumber = NUMBER_WORDS.get(number2);
							temp.append(wordNumber);
							temp.append(" ");

							if (number3 > 0)
							{
								wordNumber = NUMBER_WORDS.get(number3);
								temp.append(wordNumber);
								temp.append(" ");
							}
						}
						else
						{
							String concat = String.valueOf(number2)
									+ String.valueOf(number3);
							long n = Long.parseLong(concat);
							if (n > 0)
							{
								String wordNumber = NUMBER_WORDS.get(n);
								temp.append(wordNumber);
								temp.append(" ");
							}
						}

						result.insert(0, temp);
					}
				}
			}
			System.out.println(result.toString().trim());
		}
		scanner.close();
	}
}
