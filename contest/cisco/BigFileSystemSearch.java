package cisco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * <p>
 * You have recently got a job as a system administrator in a big IT company.
 * </p>
 * 
 * <p>
 * The first problem which you encountered is to build a data structure which
 * allows you to do some set-oriented searching in a big file system.
 * </p>
 * <p>
 * You have <b><i>N</i></b> files in your system. Each file is represented by a
 * sequence of integers separated by a single space.
 * </p>
 * <p>
 * You have to perform <b><i>Q</i></b> queries. For each query, you will be
 * given an array <b><i>A={a<sub>1</sub>,a<sub>2</sub>,...,
 * a<sub>K</sub>}</i></b>, and you have to perform any one of the following
 * three queries on the whole file system:
 * <ul>
 * <li><tt>query_all</tt>: Returns the number of files which contain all
 * elements from array <b><i>A</i></b>.
 * <li><tt>query_any</tt>: Returns the number files which contain at least one
 * element from array <b><i>A</i></b>.
 * <li><tt>query_some</tt>: Returns the number of files which contain at least
 * one element and at most <b><i>K-1</i></b> elements from array
 * <b><i>A</i></b>.
 * </ul>
 * </p>
 * <p>
 * Note: <br>
 * <b><i>A</i></b> array, <b><i>X</i></b>, will be considered to contain all
 * elements of another array, <b><i>Y</i></b>, if and only if the frequency of
 * each element of <b><i>Y</i></b> doesn't exceed the respective frequency in
 * array <b><i>X</i></b>. That is, if <b><i>X={9,5,4}</i></b> and
 * <b><i>Y={9,9,5}</i></b> then <b><i>X</i></b> doesn't consists all elements of
 * <b><i>Y</i></b>, as frequency of <b><i>9</i></b> in <b><i>Y</i></b> is
 * greater than <b><i>X</i></b>.
 * </p>
 * <p>
 * Input Format <br>
 * In the first line there is only one integer, <b><i>N</i></b>, denoting the
 * number of files in the file system. <br>
 * <br>
 * <b><i>N</i></b> lines follow. In the <b><i>i<sup>th</sup></i></b> of them
 * there is a description of the <b><i>i<sup>th</sup></i></b> file. Each such
 * description consists of a number, <b><i>M</i></b>, denoting the number of
 * integers in this file, followed by <b><i>M</i></b> integers representing
 * these integers. <br>
 * <br>
 * The next line consists of a single integer, <b><i>Q</i></b>, denoting the
 * number of queries which you have to perform. <br>
 * <br>
 * <b><i>Q</i></b> lines follow. In the <b><i>i<sup>th</sup></i></b> of them
 * there is a description of the <b><i>i<sup>th</sup></i></b> query. Each query
 * consists of an integer, <b><i>T</i></b>, denoting the type of the query
 * followed by an integer, <b><i>Q</i></b>, denoting the length of array
 * <b><i>A</i></b>. Then follows <b><i>K</i></b> integers, in the same line,
 * representing the elements of <b><i>A</i></b>.
 * </p>
 * <p>
 * Output Format <br>
 * Print exactly <b><i>Q</i></b> lines. In the <b><i>i<sup>th</sup></i></b> of
 * them print the answer to the <b><i>i<sup>th</sup></i></b> query.
 * </p>
 * <p>
 * Constraints: <br>
 * 1<=N<=300<br>
 * 1<=M<=300<br>
 * 1<=Q<=300<br>
 * 1<=T<=3<br>
 * 1<=K<=300<br>
 * All numbers in the files and queries are greater than <b>0</i></b> and not
 * greater than <b><i>10<sup>9</sup></i></b>.
 * </p>
 * <p>
 * Sample Input <br>
 * 3<br>
 * 3 1 2 3<br>
 * 3 2 3 4 <br>
 * 3 3 4 5 <br>
 * 3<br>
 * 1 2 3 4<br>
 * 2 2 2 5<br>
 * 3 3 2 3 4
 * </p>
 * <p>
 * Sample Output <br>
 * 2<br>
 * 3<br>
 * 2
 * </p>
 * <p>
 * Explanation <br>
 * There are three queries: <br>
 * <br>
 * You have to count the number of files which contain numbers <b><i>3</i></b>
 * and <b><i>4</i></b>. The second and the third file is valid for this query,
 * so the answer is <b><i>2</i></b>. <br>
 * <br>
 * You have to count the number of files which contain number <b><i>2</i></b> or
 * number 5. All files are valid for this query, so the answer is
 * <b><i>3</i></b>. <br>
 * <br>
 * You have to count the number of files which contain some numbers from the set
 * <b><i>{2,3,4}</i></b>, but not all of them. The first and the third file is
 * valid for this query, so the answer is <b><i>2</i></b>.
 * </p>
 * 
 * @author Pidanic
 *
 */
public class BigFileSystemSearch
{
    private static final int QUERY_ALL = 1;

    private static final int QUERY_ANY = 2;

    private static final int QUERY_SOME = 3;

    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        int filesCount = Integer.parseInt(stdin.nextLine());

        List<List<Integer>> files = new ArrayList<>(filesCount);
        if(filesCount >= 1 && filesCount <= 300)
        {
            for (int i = 0; i < filesCount; i++)
            {
                String[] integers = stdin.nextLine().split(" ");
                int length = Integer.parseInt(integers[0]);
                if(length <= 300)
                {
                    List<Integer> file = new ArrayList<>(length);
                    for (int j = 0; j < length; j++)
                    {
                        long num = Long.parseLong(integers[j + 1]);
                        if(num > 0 && num <= 1_000_000_000)
                        {
                            file.add((int) num);
                        }
                    }
                    files.add(file);
                }
            }
        }

        int queries = Integer.parseInt(stdin.nextLine());
        if(queries >= 1 && queries <= 300)
        {
            for (int i = 0; i < queries; i++)
            {
                String[] queryData = stdin.nextLine().split(" ");
                int queryType = Integer.parseInt(queryData[0]);
                int arrayLength = Integer.parseInt(queryData[1]);
                if(arrayLength <= 300)
                {
                    List<Integer> searchData = new ArrayList<>(arrayLength);
                    for (int j = 0; j < arrayLength; j++)
                    {
                        long qData = Long.parseLong(queryData[j + 2]);
                        if(qData > 0 && qData <= 1_000_000_000)
                        {
                            searchData.add((int) qData);
                        }
                    }
                    if(queryType >= 1 && queryType <= 3)
                    {
                        int result = search(queryType, files, searchData);
                        System.out.println(result);
                    }
                }
            }
        }

        stdin.close();
    }

    private static int search(int queryType, List<List<Integer>> files,
            List<Integer> queryData)
    {
        int result;
        if(queryType == QUERY_ALL)
        {
            result = queryAll(files, queryData);
        }
        else if(queryType == QUERY_ANY)
        {
            result = queryAny(files, queryData);
        }
        else if(queryType == QUERY_SOME)
        {
            result = querySome(files, queryData);
        }
        else
        {
            result = 0;
        }
        return result;
    }

    private static int querySome(List<List<Integer>> files,
            List<Integer> queryData)
    {
        int hits = 0;
        int containsQueryData = 0;
        for (List<Integer> file : files)
        {
            for (int data : queryData)
            {
                if(file.contains(data))
                {
                    containsQueryData++;
                }
            }
            if(containsQueryData >= 1
                    && containsQueryData <= queryData.size() - 1)
            {
                hits++;
            }
            containsQueryData = 0;
        }

        return hits;
    }

    private static int queryAny(List<List<Integer>> files,
            List<Integer> queryData)
    {
        int hits = 0;
        for (List<Integer> file : files)
        {
            for (int data : queryData)
            {
                if(file.contains(data))
                {
                    hits++;
                    break;
                }
            }
        }
        return hits;
    }

    private static int queryAll(List<List<Integer>> files,
            List<Integer> queryData)
    {
        int hits = 0;
        for (List<Integer> file : files)
        {
            Map<Integer, Integer> fileIntCount = getIntegerCount(file);
            Map<Integer, Integer> queryIntCount = getIntegerCount(queryData);

            int containsQueryData = 0;
            for (int queryKey : queryIntCount.keySet())
            {
                if(fileIntCount.containsKey(queryKey))
                {
                    int queryCount = queryIntCount.get(queryKey);
                    int fileCount = fileIntCount.get(queryKey);
                    if(queryCount <= fileCount)
                    {
                        containsQueryData++;
                    }
                }
                else
                {
                    break;
                }
            }
            if(queryIntCount.size() == containsQueryData)
            {
                hits++;
            }
            // if(file.size() >= queryData.size())
            // {
            // if(file.containsAll(queryData))
            // {
            // hits++;
            // }
            // }
            // else
            // {
            // int containsQueryData = 0;
            // for (int data : queryData)
            // {
            // if(file.contains(data))
            // {
            // containsQueryData++;
            // }
            // }
            // if(containsQueryData == file.size())
            // {
            // hits++;
            // }
            // containsQueryData = 0;
            // }
        }
        return hits;
    }

    private static Map<Integer, Integer> getIntegerCount(List<Integer> list)
    {
        Map<Integer, Integer> result = new HashMap<>();
        for (int element : list)
        {
            Integer value = result.get(element);
            if(value == null)
            {
                result.put(element, 1);
            }
            else
            {
                result.put(element, ++value);
            }
        }
        return result;
    }
}
