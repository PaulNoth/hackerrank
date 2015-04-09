package cisco;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BigFileSystemSearch
{
    private static final int QUERY_ALL = 1;

    private static final int QUERY_ANY = 2;

    private static final int QUERY_SOME = 3;

    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        int filesCount = Integer.parseInt(stdin.nextLine());

        Set<Set<Integer>> files = new HashSet<>();
        for (int i = 0; i < filesCount; i++)
        {
            String[] integers = stdin.nextLine().split(" ");
            int length = Integer.parseInt(integers[0]);
            Set<Integer> file = new HashSet<>(length);
            for (int j = 0; j < length; j++)
            {
                file.add(Integer.parseInt(integers[j + 1]));
            }
            files.add(file);
        }

        int queries = Integer.parseInt(stdin.nextLine());
        for (int i = 0; i < queries; i++)
        {
            String[] queryData = stdin.nextLine().split(" ");
            int queryType = Integer.parseInt(queryData[0]);
            int arrayLength = Integer.parseInt(queryData[1]);
            List<Integer> searchData = new ArrayList<>(arrayLength);
            for (int j = 0; j < arrayLength; j++)
            {
                searchData.add(Integer.parseInt(queryData[j + 2]));
            }
            if(queryType >= 1 && queryType <= 3)
            {
                int result = search(queryType, files, searchData);
                System.out.println(result);
            }
        }

        stdin.close();
    }

    private static int search(int queryType, Set<Set<Integer>> files,
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

    private static int querySome(Set<Set<Integer>> files,
            List<Integer> queryData)
    {
        int hits = 0;
        int containsQueryData = 0;
        for (Set<Integer> file : files)
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

    private static int queryAny(Set<Set<Integer>> files, List<Integer> queryData)
    {
        int hits = 0;
        for (Set<Integer> file : files)
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

    private static int queryAll(Set<Set<Integer>> files, List<Integer> queryData)
    {
        int hits = 0;

        for (Set<Integer> file : files)
        {
            if(file.size() >= queryData.size())
            {
                if(file.containsAll(queryData))
                {
                    hits++;
                }
            }
            else
            {
                int containsQueryData = 0;
                for (int data : queryData)
                {
                    if(file.contains(data))
                    {
                        containsQueryData++;
                    }
                }
                if(containsQueryData == file.size())
                {
                    hits++;
                }
                containsQueryData = 0;
            }
        }

        return hits;
    }
}
