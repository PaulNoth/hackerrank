import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
