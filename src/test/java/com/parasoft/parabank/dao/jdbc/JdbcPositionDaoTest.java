/**
 * 
 */
package com.parasoft.parabank.dao.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.domain.HistoryPoint;
import com.parasoft.parabank.domain.Position;
import java.util.Date;
import java.util.List;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for JdbcPositionDao
 *
 * @see com.parasoft.parabank.dao.jdbc.JdbcPositionDao
 * @author devtest
 */
public class JdbcPositionDaoTest {

	/**
	 * Parasoft Jtest UTA: Test for createPosition(Position)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcPositionDao#createPosition(Position)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testCreatePosition() throws Throwable {
		// Given
		JdbcPositionDao underTest = new JdbcPositionDao();
		JdbcSequenceDao sequenceDao = mock(JdbcSequenceDao.class);
		underTest.setSequenceDao(sequenceDao);

		// When
		Position position = mock(Position.class);
		int result = underTest.createPosition(position);

		// Then - assertions for argument 1 of method createPosition(Position)
		assertEquals(0, position.getPositionId());
		assertEquals(0, position.getCustomerId());
		assertNull(position.getName());
		assertNull(position.getSymbol());
		assertEquals(0, position.getShares());
		assertNull(position.getPurchasePrice());

		// Then - assertions for this instance of JdbcPositionDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for deletePosition(Position)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcPositionDao#deletePosition(Position)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDeletePosition() throws Throwable {
		// Given
		JdbcPositionDao underTest = new JdbcPositionDao();

		// When
		Position position = mock(Position.class);
		boolean result = underTest.deletePosition(position);

		// Then - assertions for argument 1 of method deletePosition(Position)
		assertEquals(0, position.getPositionId());
		assertEquals(0, position.getCustomerId());
		assertNull(position.getName());
		assertNull(position.getSymbol());
		assertEquals(0, position.getShares());
		assertNull(position.getPurchasePrice());

		// Then - assertions for this instance of JdbcPositionDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPosition(int)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcPositionDao#getPosition(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPosition() throws Throwable {
		// Given
		JdbcPositionDao underTest = new JdbcPositionDao();

		// When
		int position_id = 0; // UTA: default value
		Position result = underTest.getPosition(position_id);

		// Then - assertions for this instance of JdbcPositionDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPositionHistory(int, Date, Date)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcPositionDao#getPositionHistory(int, Date, Date)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPositionHistory() throws Throwable {
		// Given
		JdbcPositionDao underTest = new JdbcPositionDao();

		// When
		int positionId = 0; // UTA: default value
		Date startDate = mock(Date.class);
		Date endDate = mock(Date.class);
		List<HistoryPoint> result = underTest.getPositionHistory(positionId, startDate, endDate);

		// Then - assertions for this instance of JdbcPositionDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPositionsForCustomerId(int)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcPositionDao#getPositionsForCustomerId(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPositionsForCustomerId() throws Throwable {
		// Given
		JdbcPositionDao underTest = new JdbcPositionDao();

		// When
		int customer_id = 0; // UTA: default value
		List<Position> result = underTest.getPositionsForCustomerId(customer_id);

		// Then - assertions for this instance of JdbcPositionDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for setSequenceDao(JdbcSequenceDao)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcPositionDao#setSequenceDao(JdbcSequenceDao)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetSequenceDao() throws Throwable {
		// Given
		JdbcPositionDao underTest = new JdbcPositionDao();

		// When
		JdbcSequenceDao sequenceDao = mock(JdbcSequenceDao.class);
		underTest.setSequenceDao(sequenceDao);

		// Then - assertions for argument 1 of method setSequenceDao(JdbcSequenceDao)
		assertNull(sequenceDao.getJdbcTemplate());

		// Then - assertions for this instance of JdbcPositionDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for updatePosition(Position)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcPositionDao#updatePosition(Position)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testUpdatePosition() throws Throwable {
		// Given
		JdbcPositionDao underTest = new JdbcPositionDao();

		// When
		Position position = mock(Position.class);
		boolean result = underTest.updatePosition(position);

		// Then - assertions for argument 1 of method updatePosition(Position)
		assertEquals(0, position.getPositionId());
		assertEquals(0, position.getCustomerId());
		assertNull(position.getName());
		assertNull(position.getSymbol());
		assertEquals(0, position.getShares());
		assertNull(position.getPurchasePrice());

		// Then - assertions for this instance of JdbcPositionDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}
}