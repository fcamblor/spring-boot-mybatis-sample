package com.samples;

import java.util.List;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

@Repository
public class SampleRepository extends SqlSessionDaoSupport {

  /* Uncomment this if you want to fix/debug the issue .. but YES that's weird !
  private final ApplicationContext applicationContext;

  protected SampleRepository(ApplicationContext applicationContext) {
    super();
    this.applicationContext = applicationContext;
  }

  @Override
  protected void checkDaoConfig() {
    // Don't know why, but late injection doesn't work here, and we need to do things ourselves
    // which is weird !
    if(this.getSqlSessionTemplate() == null && this.getSqlSessionFactory() == null) {
      logger.info("SqlSession* ARE NULL");
      if(applicationContext.getBeanNamesForType(SqlSessionTemplate.class).length != 0) {
        this.setSqlSessionTemplate(applicationContext.getBean(SqlSessionTemplate.class));
      } else if(applicationContext.getBeanNamesForType(SqlSessionFactory.class).length != 0) {
        this.setSqlSessionFactory(applicationContext.getBean(SqlSessionFactory.class));
      }
    } else {
      logger.info("SqlSession* ARE NOT NULL");
    }

    super.checkDaoConfig();
  }
   */

  public List<String> selectAllNames() {
    return this.getSqlSession().selectList("com.samples.SampleRepository.select-all-lists");
  }
}
