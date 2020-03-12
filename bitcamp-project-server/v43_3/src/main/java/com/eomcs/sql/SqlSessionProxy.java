package com.eomcs.sql;

import java.sql.Connection;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

public class SqlSessionProxy implements SqlSession {

  SqlSession origina;

  public SqlSessionProxy(SqlSession origina) {
    this.origina = origina;
  }

  // close() 메서드를 변경한다.
  @Override
  public void close() {
    // try-width-resources 문장에서 자동으로 close()를 호출할 때
    // SqlSession을 닫지 않게 변경한다.
    // 왜? 계속해서 다른 DAO가 사용할 수 있기 때문이다.
    //
    // origina.close();
  }

  // 대신 스레드의 작업이 모두 끝났을 때 닫도록 한다.
  // => 이를 위해 진짜 닫는 일을 하는 메서드를 추가한다.

  public void realclose() {
    origina.close();
  }

  @Override
  public <T> T selectOne(String statement) {
    return origina.selectOne(statement);
  }

  @Override
  public <T> T selectOne(String statement, Object parameter) {
    return origina.selectOne(statement, parameter);
  }

  @Override
  public <E> List<E> selectList(String statement) {
    return origina.selectList(statement);
  }

  @Override
  public <E> List<E> selectList(String statement, Object parameter) {
    return origina.selectList(statement, parameter);
  }

  @Override
  public <E> List<E> selectList(String statement, Object parameter, RowBounds rowBounds) {
    return origina.selectList(statement, parameter, rowBounds);
  }

  @Override
  public <K, V> Map<K, V> selectMap(String statement, String mapKey) {
    return origina.selectMap(statement, mapKey);
  }

  @Override
  public <K, V> Map<K, V> selectMap(String statement, Object parameter, String mapKey) {
    return origina.selectMap(statement, parameter, mapKey);
  }

  @Override
  public <K, V> Map<K, V> selectMap(String statement, Object parameter, String mapKey,
      RowBounds rowBounds) {
    return origina.selectMap(statement, parameter, mapKey, rowBounds);
  }

  @Override
  public <T> Cursor<T> selectCursor(String statement) {
    return origina.selectCursor(statement);
  }

  @Override
  public <T> Cursor<T> selectCursor(String statement, Object parameter) {
    return origina.selectCursor(statement, parameter);
  }

  @Override
  public <T> Cursor<T> selectCursor(String statement, Object parameter, RowBounds rowBounds) {
    return origina.selectCursor(statement, parameter, rowBounds);
  }

  @SuppressWarnings("rawtypes")
  @Override
  public void select(String statement, Object parameter, ResultHandler handler) {
    origina.select(statement, parameter, handler);
  }

  @SuppressWarnings("rawtypes")
  @Override
  public void select(String statement, ResultHandler handler) {
    origina.select(statement, handler);
  }

  @SuppressWarnings("rawtypes")
  @Override
  public void select(String statement, Object parameter, RowBounds rowBounds,
      ResultHandler handler) {
    origina.select(statement, parameter, rowBounds, handler);
  }

  @Override
  public int insert(String statement) {
    return origina.insert(statement);
  }

  @Override
  public int insert(String statement, Object parameter) {
    return origina.insert(statement, parameter);
  }

  @Override
  public int update(String statement) {
    return origina.update(statement);
  }

  @Override
  public int update(String statement, Object parameter) {
    return origina.update(statement, parameter);
  }

  @Override
  public int delete(String statement) {
    return origina.delete(statement);
  }

  @Override
  public int delete(String statement, Object parameter) {
    return origina.delete(statement, parameter);
  }

  @Override
  public void commit() {
    origina.commit();
  }

  @Override
  public void commit(boolean force) {
    origina.commit(force);
  }

  @Override
  public void rollback() {
    origina.rollback();
  }

  @Override
  public void rollback(boolean force) {
    origina.rollback(force);
  }

  @Override
  public List<BatchResult> flushStatements() {
    return origina.flushStatements();
  }


  @Override
  public void clearCache() {
    origina.clearCache();
  }

  @Override
  public Configuration getConfiguration() {
    return origina.getConfiguration();
  }

  @Override
  public <T> T getMapper(Class<T> type) {
    return origina.getMapper(type);
  }

  @Override
  public Connection getConnection() {
    return origina.getConnection();
  }

}
