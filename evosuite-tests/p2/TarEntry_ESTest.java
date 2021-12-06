/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 05 16:49:26 PST 2021
 */

package p2;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class TarEntry_ESTest extends TarEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      TarHeader tarHeader0 = new TarHeader();
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        tarEntry0.parseTarHeader(tarHeader0, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 100
         //
         verifyException("p2.TarHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      Date date0 = new Date(1L);
      tarEntry0.setModTime(date0);
      assertFalse(tarEntry0.isDirectory());
      assertEquals(0L, tarEntry0.getSize());
      assertEquals(0, tarEntry0.getGroupId());
      assertEquals(0, tarEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      tarEntry0.setModTime(1L);
      assertEquals(0L, tarEntry0.getSize());
      assertFalse(tarEntry0.isDirectory());
      assertEquals(0, tarEntry0.getGroupId());
      assertEquals(0, tarEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("O");
      File file0 = new File("");
      TarEntry tarEntry1 = new TarEntry(file0);
      boolean boolean0 = tarEntry0.isDescendent(tarEntry1);
      assertEquals("", tarEntry1.getName());
      assertFalse(tarEntry0.isDirectory());
      assertEquals(0L, tarEntry0.getSize());
      assertEquals(0, tarEntry0.getGroupId());
      assertEquals(0, tarEntry0.getUserId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      tarEntry0.setNames("o", "");
      tarEntry0.getUserName();
      assertEquals("o", tarEntry0.getUserName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      assertEquals(0, tarEntry0.getUserId());
      
      tarEntry0.setIds(1, 0);
      int int0 = tarEntry0.getUserId();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      tarEntry0.setIds((-1), 0);
      int int0 = tarEntry0.getUserId();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      assertEquals(0L, tarEntry0.getSize());
      
      tarEntry0.setSize(1L);
      long long0 = tarEntry0.getSize();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      assertEquals(0L, tarEntry0.getSize());
      
      tarEntry0.setSize((-1L));
      long long0 = tarEntry0.getSize();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      File file0 = new File("3");
      TarEntry tarEntry0 = new TarEntry(file0);
      String string0 = tarEntry0.getName();
      assertEquals("3", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      tarEntry0.setGroupName("u");
      tarEntry0.getGroupName();
      assertFalse(tarEntry0.isDirectory());
      assertEquals(0L, tarEntry0.getSize());
      assertEquals(0, tarEntry0.getUserId());
      assertEquals(0, tarEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      assertEquals(0, tarEntry0.getGroupId());
      
      tarEntry0.setIds(0, 1);
      int int0 = tarEntry0.getGroupId();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      tarEntry0.setGroupId((-1));
      int int0 = tarEntry0.getGroupId();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      assertFalse(tarEntry0.isDirectory());
      
      File file0 = new File("//", "//");
      tarEntry0.file = file0;
      tarEntry0.getFile();
      assertEquals(0, tarEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      File file0 = new File("");
      TarEntry tarEntry0 = new TarEntry(file0);
      File file1 = tarEntry0.getFile();
      assertEquals("", tarEntry0.getName());
      assertNotNull(file1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      File file0 = new File("");
      TarEntry tarEntry0 = new TarEntry(file0);
      TarEntry tarEntry1 = new TarEntry("N");
      boolean boolean0 = tarEntry0.equals(tarEntry1);
      assertEquals(0, tarEntry1.getGroupId());
      assertEquals(0, tarEntry1.getUserId());
      assertFalse(boolean0);
      assertFalse(tarEntry1.isDirectory());
      assertEquals(0L, tarEntry1.getSize());
      assertEquals("", tarEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-1);
      long long0 = tarEntry0.computeCheckSum(byteArray0);
      assertEquals(0, tarEntry0.getUserId());
      assertFalse(tarEntry0.isDirectory());
      assertEquals(255L, long0);
      assertEquals(0L, tarEntry0.getSize());
      assertEquals(0, tarEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      // Undeclared exception!
      try { 
        tarEntry0.writeEntryHeader((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("p2.TarHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        tarEntry0.writeEntryHeader(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("p2.TarHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      // Undeclared exception!
      try { 
        tarEntry0.setUserName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      // Undeclared exception!
      try { 
        tarEntry0.setNames((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      // Undeclared exception!
      try { 
        tarEntry0.setName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      // Undeclared exception!
      try { 
        tarEntry0.setModTime((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("p2.TarEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      // Undeclared exception!
      try { 
        tarEntry0.setGroupName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      TarHeader tarHeader0 = new TarHeader();
      // Undeclared exception!
      try { 
        tarEntry0.parseTarHeader(tarHeader0, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("p2.TarHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      TarHeader tarHeader0 = new TarHeader();
      // Undeclared exception!
      try { 
        tarEntry0.nameTarHeader(tarHeader0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      // Undeclared exception!
      try { 
        tarEntry0.isDescendent((TarEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("p2.TarEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      TarHeader tarHeader0 = new TarHeader();
      File file0 = new File("", "");
      // Undeclared exception!
      try { 
        tarEntry0.getFileTarHeader(tarHeader0, file0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      TarHeader tarHeader0 = tarEntry0.header;
      // Undeclared exception!
      try { 
        tarEntry0.getFileTarHeader(tarHeader0, (File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("p2.TarEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      // Undeclared exception!
      try { 
        tarEntry0.equals((TarEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("p2.TarEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      // Undeclared exception!
      try { 
        tarEntry0.computeCheckSum((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("p2.TarEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      File file0 = new File("", "u");
      TarEntry tarEntry0 = new TarEntry(file0);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        tarEntry0.adjustEntryName(byteArray0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TarEntry tarEntry0 = null;
      try {
        tarEntry0 = new TarEntry((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("p2.TarHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TarEntry tarEntry0 = null;
      try {
        tarEntry0 = new TarEntry((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      File file0 = new File("", "");
      TarEntry tarEntry0 = null;
      try {
        tarEntry0 = new TarEntry(file0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TarEntry tarEntry0 = null;
      try {
        tarEntry0 = new TarEntry((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("p2.TarEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      TarHeader tarHeader0 = new TarHeader();
      tarEntry0.nameTarHeader(tarHeader0, "/");
      assertEquals("/", tarHeader0.getName());
      assertEquals(16877, tarHeader0.mode);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      TarHeader tarHeader0 = new TarHeader();
      tarEntry0.nameTarHeader(tarHeader0, "");
      //  // Unstable assertion: assertEquals(33188, tarHeader0.mode);
      //  // Unstable assertion: assertEquals(1638751757L, tarHeader0.modTime);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      File file0 = new File("/WinRAR");
      TarEntry tarEntry0 = new TarEntry(file0);
      TarHeader tarHeader0 = tarEntry0.getHeader();
      tarEntry0.getFileTarHeader(tarHeader0, file0);
      assertEquals("WinRAR/", tarHeader0.getName());
      assertEquals("WinRAR/", tarEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      tarEntry0.setUserId(0);
      assertEquals(0L, tarEntry0.getSize());
      assertFalse(tarEntry0.isDirectory());
      assertEquals(0, tarEntry0.getUserId());
      assertEquals(0, tarEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      tarEntry0.setUserName("");
      assertEquals(0, tarEntry0.getGroupId());
      assertEquals(0, tarEntry0.getUserId());
      assertFalse(tarEntry0.isDirectory());
      assertEquals(0L, tarEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      byte[] byteArray0 = new byte[7];
      long long0 = tarEntry0.computeCheckSum(byteArray0);
      assertEquals(0L, long0);
      assertFalse(tarEntry0.isDirectory());
      assertEquals(0L, tarEntry0.getSize());
      assertEquals(0, tarEntry0.getGroupId());
      assertEquals(0, tarEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      assertFalse(tarEntry0.isDirectory());
      
      File file0 = new File("//", "//");
      tarEntry0.file = file0;
      tarEntry0.getDirectoryEntries();
      assertEquals(0, tarEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      TarEntry[] tarEntryArray0 = tarEntry0.getDirectoryEntries();
      assertEquals(0, tarEntry0.getUserId());
      assertEquals(0, tarEntry0.getGroupId());
      assertEquals(0L, tarEntry0.getSize());
      assertFalse(tarEntry0.isDirectory());
      assertEquals(0, tarEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      File file0 = new File("");
      File file1 = file0.getAbsoluteFile();
      TarEntry tarEntry0 = new TarEntry(file1);
      assertEquals("Eclipse Mars2/eclipse_Mars2_workspace/CptS581-FinalExam/", tarEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      TarHeader tarHeader0 = new TarHeader();
      File file0 = new File("", "dq");
      tarEntry0.getFileTarHeader(tarHeader0, file0);
      assertEquals("dq", tarHeader0.getName());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("/");
      boolean boolean0 = tarEntry0.isDirectory();
      assertTrue(boolean0);
      assertEquals(0, tarEntry0.getGroupId());
      assertEquals(0, tarEntry0.getUserId());
      assertEquals(0L, tarEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      TarHeader tarHeader0 = new TarHeader();
      File file0 = new File("", "d");
      tarEntry0.getFileTarHeader(tarHeader0, file0);
      assertEquals("d", tarHeader0.getName());
      
      tarEntry0.isDirectory();
      assertEquals(0L, tarEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      boolean boolean0 = tarEntry0.isDirectory();
      assertEquals(0L, tarEntry0.getSize());
      assertFalse(boolean0);
      assertEquals(0, tarEntry0.getUserId());
      assertEquals(0, tarEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      tarEntry0.getGroupName();
      assertEquals(0L, tarEntry0.getSize());
      assertFalse(tarEntry0.isDirectory());
      assertEquals(0, tarEntry0.getUserId());
      assertEquals(0, tarEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      tarEntry0.isDescendent(tarEntry0);
      assertEquals(0, tarEntry0.getUserId());
      assertEquals(0, tarEntry0.getGroupId());
      assertFalse(tarEntry0.isDirectory());
      assertEquals(0L, tarEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      Date date0 = tarEntry0.getModTime();
      //  // Unstable assertion: assertEquals(0, tarEntry0.getUserId());
      //  // Unstable assertion: assertEquals(0, tarEntry0.getGroupId());
      //  // Unstable assertion: assertEquals("Sun Dec 05 16:49:15 PST 2021", date0.toString());
      //  // Unstable assertion: assertEquals(0L, tarEntry0.getSize());
      //  // Unstable assertion: assertFalse(tarEntry0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      tarEntry0.getFile();
      assertEquals(0, tarEntry0.getGroupId());
      assertEquals(0, tarEntry0.getUserId());
      assertFalse(tarEntry0.isDirectory());
      assertEquals(0L, tarEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      TarHeader tarHeader0 = tarEntry0.getHeader();
      //  // Unstable assertion: assertEquals(1638751754L, tarHeader0.modTime);
      
      File file0 = new File("");
      tarEntry0.getFileTarHeader(tarHeader0, file0);
      tarEntry0.getDirectoryEntries();
      //  // Unstable assertion: assertEquals("", tarEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      File file0 = new File("");
      TarEntry tarEntry0 = new TarEntry(file0);
      String string0 = tarEntry0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        tarEntry0.adjustEntryName(byteArray0, "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("p2.TarHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      tarEntry0.equals(tarEntry0);
      assertEquals(0L, tarEntry0.getSize());
      assertFalse(tarEntry0.isDirectory());
      assertEquals(0, tarEntry0.getUserId());
      assertEquals(0, tarEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      tarEntry0.getUserName();
      assertFalse(tarEntry0.isDirectory());
      assertEquals(0L, tarEntry0.getSize());
      assertEquals(0, tarEntry0.getGroupId());
      assertEquals(0, tarEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      TarEntry tarEntry0 = null;
      try {
        tarEntry0 = new TarEntry(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 100
         //
         verifyException("p2.TarHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      File file0 = new File("");
      TarEntry tarEntry0 = new TarEntry(file0);
      tarEntry0.getSize();
      assertEquals("", tarEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      int int0 = tarEntry0.getUserId();
      assertEquals(0, tarEntry0.getGroupId());
      assertFalse(tarEntry0.isDirectory());
      assertEquals(0L, tarEntry0.getSize());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      tarEntry0.setName("");
      assertEquals(0L, tarEntry0.getSize());
      assertFalse(tarEntry0.isDirectory());
      assertEquals(0, tarEntry0.getGroupId());
      assertEquals(0, tarEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      TarEntry tarEntry0 = new TarEntry("");
      int int0 = tarEntry0.getGroupId();
      assertEquals(0, int0);
      assertEquals(0, tarEntry0.getUserId());
      assertEquals(0L, tarEntry0.getSize());
      assertFalse(tarEntry0.isDirectory());
  }
}
