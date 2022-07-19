package coms.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
public class MainLogic {
    @Autowired
       private JdbcTemplate jdbcTemplate;


        public void selectEx(){
            List<Map<String,Object>> li =jdbcTemplate.queryForList("select * from student");
           Iterator<Map<String,Object>> it = li.iterator();
           while(it.hasNext()){
               Object o=it.next();
               System.out.println(o.toString());
           }
      }
  /*  public void insertElements(){
        String SQL = "insert into Student (sid,firstname,lastname) values (?, ?, ?)";
        jdbcTemplate.update( SQL, new Object[]{11,"sai","krishna"} );
    }*/
    public void updateElements(){
        String SQL = "update student set lastname=? where sid=?";
        jdbcTemplate.update(SQL,"singh",5);
    }
    public void deleteElement(){
        String SQL="delete from student where sid=?";
        jdbcTemplate.update(SQL,11);
    }
    }
