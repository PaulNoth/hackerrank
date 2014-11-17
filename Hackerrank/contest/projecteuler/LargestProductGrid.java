package projecteuler;
import java.util.Scanner;

/**
 * 
 * <b>Project Euler #11: Largest product in a grid</b>
 * 
 * <p>
 * In the 20×20 grid below
 * <p>
 * <table>
 * <tr>
 * <td>89</td>
 * <td>90</td>
 * <td>95</td>
 * <td>97</td>
 * <td>38</td>
 * <td>15</td>
 * <td>00</td>
 * <td>40</td>
 * <td>00</td>
 * <td>75</td>
 * <td>04</td>
 * <td>05</td>
 * <td>07</td>
 * <td>78</td>
 * <td>52</td>
 * <td>12</td>
 * <td>50</td>
 * <td>77</td>
 * <td>91</td>
 * <td>08</td>
 * </tr>
 * <tr>
 * <td>49</td>
 * <td>49</td>
 * <td>99</td>
 * <td>40</td>
 * <td>17</td>
 * <td>81</td>
 * <td>18</td>
 * <td>57</td>
 * <td>60</td>
 * <td>87</td>
 * <td>17</td>
 * <td>40</td>
 * <td>98</td>
 * <td>43</td>
 * <td>69</td>
 * <td>48</td>
 * <td>04</td>
 * <td>56</td>
 * <td>62</td>
 * <td>00</td>
 * </tr>
 * <tr>
 * <td>81</td>
 * <td>49</td>
 * <td>31</td>
 * <td>73</td>
 * <td>55</td>
 * <td>79</td>
 * <td>14</td>
 * <td>29</td>
 * <td>93</td>
 * <td>71</td>
 * <td>40</td>
 * <td>67</td>
 * <td>53</td>
 * <td>88</td>
 * <td>30</td>
 * <td>03</td>
 * <td>49</td>
 * <td>13</td>
 * <td>36</td>
 * <td>65</td>
 * </tr>
 * <tr>
 * <td>52</td>
 * <td>70</td>
 * <td>95</td>
 * <td>23</td>
 * <td>04</td>
 * <td>60</td>
 * <td>11</td>
 * <td>42</td>
 * <td>69</td>
 * <td>24</td>
 * <td>68</td>
 * <td>56</td>
 * <td>01</td>
 * <td>32</td>
 * <td>56</td>
 * <td>71</td>
 * <td>37</td>
 * <td>02</td>
 * <td>36</td>
 * <td>91</td>
 * </tr>
 * <tr>
 * <td>22</td>
 * <td>31</td>
 * <td>16</td>
 * <td>71</td>
 * <td>51</td>
 * <td>67</td>
 * <td>63</td>
 * <td>89</td>
 * <td>41</td>
 * <td>92</td>
 * <td>36</td>
 * <td>54</td>
 * <td>22</td>
 * <td>40</td>
 * <td>40</td>
 * <td>28</td>
 * <td>66</td>
 * <td>33</td>
 * <td>13</td>
 * <td>80</td>
 * </tr>
 * <tr>
 * <td>24</td>
 * <td>47</td>
 * <td>32</td>
 * <td>60</td>
 * <td>99</td>
 * <td>03</td>
 * <td>45</td>
 * <td>02</td>
 * <td>44</td>
 * <td>75</td>
 * <td>33</td>
 * <td>53</td>
 * <td>78</td>
 * <td>36</td>
 * <td>84</td>
 * <td>20</td>
 * <td>35</td>
 * <td>17</td>
 * <td>12</td>
 * <td>50</td>
 * </tr>
 * <tr>
 * <td>32</td>
 * <td>98</td>
 * <td>81</td>
 * <td>28</td>
 * <td>64</td>
 * <td>23</td>
 * <td>67</td>
 * <td>10</td>
 * <td>26</td>
 * <td>38</td>
 * <td>40</td>
 * <td>67</td>
 * <td>59</td>
 * <td>54</td>
 * <td>70</td>
 * <td>66</td>
 * <td>18</td>
 * <td>38</td>
 * <td>64</td>
 * <td>70</td>
 * </tr>
 * <tr>
 * <td>67</td>
 * <td>26</td>
 * <td>20</td>
 * <td>68</td>
 * <td>02</td>
 * <td>62</td>
 * <td>12</td>
 * <td>20</td>
 * <td>95</td>
 * <td>63</td>
 * <td>94</td>
 * <td>39</td>
 * <td>63</td>
 * <td>08</td>
 * <td>40</td>
 * <td>91</td>
 * <td>66</td>
 * <td>49</td>
 * <td>94</td>
 * <td>21</td>
 * </tr>
 * <tr>
 * <td>24</td>
 * <td>55</td>
 * <td>58</td>
 * <td>05</td>
 * <td>66</td>
 * <td>73</td>
 * <td>99</td>
 * <td>26</td>
 * <td>97</td>
 * <td>17</td>
 * <td>78</td>
 * <td>78</td>
 * <td>96</td>
 * <td>83</td>
 * <td>14</td>
 * <td>88</td>
 * <td>34</td>
 * <td>89</td>
 * <td>63</td>
 * <td>72</td>
 * </tr>
 * <tr>
 * <td>21</td>
 * <td>36</td>
 * <td>23</td>
 * <td>09</td>
 * <td>75</td>
 * <td>00</td>
 * <td>76</td>
 * <td>44</td>
 * <td>20</td>
 * <td>45</td>
 * <td>35</td>
 * <td>14</td>
 * <td>00</td>
 * <td>61</td>
 * <td>33</td>
 * <td>97</td>
 * <td>34</td>
 * <td>31</td>
 * <td>33</td>
 * <td>95</td>
 * </tr>
 * <tr>
 * <td>78</td>
 * <td>17</td>
 * <td>53</td>
 * <td>28</td>
 * <td>22</td>
 * <td>75</td>
 * <td>31</td>
 * <td>67</td>
 * <td>15</td>
 * <td>94</td>
 * <td>03</td>
 * <td>80</td>
 * <td>04</td>
 * <td>62</td>
 * <td>16</td>
 * <td>14</td>
 * <td>09</td>
 * <td>53</td>
 * <td>56</td>
 * <td>92</td>
 * </tr>
 * <tr>
 * <td>16</td>
 * <td>39</td>
 * <td>05</td>
 * <td>42</td>
 * <td>96</td>
 * <td>35</td>
 * <td>31</td>
 * <td>47</td>
 * <td>55</td>
 * <td>58</td>
 * <td>88</td>
 * <td>24</td>
 * <td>00</td>
 * <td>17</td>
 * <td>54</td>
 * <td>24</td>
 * <td>36</td>
 * <td>29</td>
 * <td>85</td>
 * <td>57</td>
 * </tr>
 * <tr>
 * <td>86</td>
 * <td>56</td>
 * <td>00</td>
 * <td>48</td>
 * <td>35</td>
 * <td>71</td>
 * <td>89</td>
 * <td>07</td>
 * <td>05</td>
 * <td>44</td>
 * <td>44</td>
 * <td>37</td>
 * <td>44</td>
 * <td>60</td>
 * <td>21</td>
 * <td>58</td>
 * <td>51</td>
 * <td>54</td>
 * <td>17</td>
 * <td>58</td>
 * </tr>
 * <tr>
 * <td>19</td>
 * <td>80</td>
 * <td>81</td>
 * <td>68</td>
 * <td>05</td>
 * <td>94</td>
 * <td>47</td>
 * <td>69</td>
 * <td>28</td>
 * <td>73</td>
 * <td>92</td>
 * <td>13</td>
 * <td>86</td>
 * <td>52</td>
 * <td>17</td>
 * <td>77</td>
 * <td>04</td>
 * <td>89</td>
 * <td>55</td>
 * <td>40</td>
 * </tr>
 * <tr>
 * <td>04</td>
 * <td>52</td>
 * <td>08</td>
 * <td>83</td>
 * <td>97</td>
 * <td>35</td>
 * <td>99</td>
 * <td>16</td>
 * <td>07</td>
 * <td>97</td>
 * <td>57</td>
 * <td>32</td>
 * <td>16</td>
 * <td>26</td>
 * <td>26</td>
 * <td>79</td>
 * <td>33</td>
 * <td>27</td>
 * <td>98</td>
 * <td>66</td>
 * </tr>
 * <tr>
 * <td>88</td>
 * <td>36</td>
 * <td>68</td>
 * <td>87</td>
 * <td>57</td>
 * <td>62</td>
 * <td>20</td>
 * <td>72</td>
 * <td>03</td>
 * <td>46</td>
 * <td>33</td>
 * <td>67</td>
 * <td>46</td>
 * <td>55</td>
 * <td>12</td>
 * <td>32</td>
 * <td>63</td>
 * <td>93</td>
 * <td>53</td>
 * <td>69</td>
 * </tr>
 * <tr>
 * <td>04</td>
 * <td>42</td>
 * <td>16</td>
 * <td>73</td>
 * <td>38</td>
 * <td>25</td>
 * <td>39</td>
 * <td>11</td>
 * <td>24</td>
 * <td>94</td>
 * <td>72</td>
 * <td>18</td>
 * <td>08</td>
 * <td>46</td>
 * <td>29</td>
 * <td>32</td>
 * <td>40</td>
 * <td>62</td>
 * <td>76</td>
 * <td>36</td>
 * </tr>
 * <tr>
 * <td>20</td>
 * <td>69</td>
 * <td>36</td>
 * <td>41</td>
 * <td>72</td>
 * <td>30</td>
 * <td>23</td>
 * <td>88</td>
 * <td>34</td>
 * <td>62</td>
 * <td>99</td>
 * <td>69</td>
 * <td>82</td>
 * <td>67</td>
 * <td>59</td>
 * <td>85</td>
 * <td>74</td>
 * <td>04</td>
 * <td>36</td>
 * <td>16</td>
 * </tr>
 * <tr>
 * <td>20</td>
 * <td>73</td>
 * <td>35</td>
 * <td>29</td>
 * <td>78</td>
 * <td>31</td>
 * <td>90</td>
 * <td>01</td>
 * <td>74</td>
 * <td>31</td>
 * <td>49</td>
 * <td>71</td>
 * <td>48</td>
 * <td>86</td>
 * <td>81</td>
 * <td>16</td>
 * <td>23</td>
 * <td>57</td>
 * <td>05</td>
 * <td>54</td>
 * </tr>
 * <tr>
 * <td>01</td>
 * <td>70</td>
 * <td>54</td>
 * <td>71</td>
 * <td>83</td>
 * <td>51</td>
 * <td>54</td>
 * <td>69</td>
 * <td>16</td>
 * <td>92</td>
 * <td>33</td>
 * <td>48</td>
 * <td>61</td>
 * <td>43</td>
 * <td>52</td>
 * <td>01</td>
 * <td>89</td>
 * <td>19</td>
 * <td>67</td>
 * <td>48</td>
 * </tr>
 * </table>
 * <p>
 * What is the greatest product of four adjacent numbers in the same direction
 * (up, down, left, right, or diagonally) in the 20×20 grid?
 * </p>
 * <p>
 * Input Format<br>
 * Input consists of 20 lines each containing 20 integers.
 * </p>
 * <p>
 * Output Format<br>
 * Print the required answer.
 * </p>
 * <p>
 * Constraints<br>
 * 0 ≤ Each integer in the grid ≤ 100
 * </p>
 * 
 * @author Pidanic
 *
 */
public class LargestProductGrid
{
	private static final int N = 20;

	private static final int ADJACENT = 4;

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[][] visited = new int[N][N];
		int[][] matrix = new int[N][N];
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < N; j++)
			{
				matrix[i][j] = scanner.nextInt();
			}
		}
		System.out.println(max(matrix, visited));

		scanner.close();
	}

	private static long max(int[][] matrix, int[][] visited)
	{
		long max = 0;
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < N; j++)
			{
				long product = productToRight(matrix, i, j);
				if (product > max)
				{
					max = product;
				}

				product = productToDown(matrix, i, j);
				if (product > max)
				{
					max = product;
				}

				product = productToDiagRight(matrix, i, j);
				if (product > max)
				{
					max = product;
				}

				product = productToDiagLeft(matrix, i, j);
				if (product > max)
				{
					max = product;
				}
			}
		}

		return max;
	}

	private static long productToRight(int[][] matrix, int i, int j)
	{
		long product = 1;
		if (j <= N - ADJACENT)
		{
			for (int r = j; r < j + ADJACENT; r++)
			{
				product *= matrix[i][r];
			}
		}
		return product;
	}

	private static long productToDown(int[][] matrix, int i, int j)
	{
		long product = 1;
		if (i <= N - ADJACENT)
		{
			for (int r = i; r < i + ADJACENT; r++)
			{
				product *= matrix[r][j];
			}
		}
		return product;
	}

	private static long productToDiagRight(int[][] matrix, int i, int j)
	{
		long product = 1;
		int s = j;
		if (i <= N - ADJACENT && j <= N - ADJACENT)
		{
			for (int r = i; r < i + ADJACENT; r++)
			{
				product *= matrix[r][s++];
			}
		}
		return product;
	}

	private static long productToDiagLeft(int[][] matrix, int i, int j)
	{
		long product = 1;
		if (i <= N - ADJACENT && j >= ADJACENT - 1)
		{
			for (int r = i; r < i + ADJACENT; r++)
			{
				product *= matrix[r][j--];
			}
		}
		return product;
	}
}
