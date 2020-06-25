package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: FindByListName";
    private static final String LISTNAME = "List 1";


    @Test
    public void testFindByListName() {
        //Given
        TaskList tasklist = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(tasklist);
        String listName = tasklist.getListName();

        //When
        List<TaskList> readTasksList = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, readTasksList.size());
        Assert.assertEquals(LISTNAME, listName);

        //CleanUp
        int id = readTasksList.get(0).getId();
        taskListDao.deleteById(id);
    }
}
