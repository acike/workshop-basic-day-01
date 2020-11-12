import java.util.List;

public class DemoClass {

    public static void main(String[] args) {
        ReportType1 report1 =  new Report1();
        report1.build();
    }

}

abstract class ReportType2 {
    abstract void header();
    abstract void body();
}

abstract class ReportType1 {
    abstract void header();
    abstract void body();
    abstract void footer();

    void build() {
        header();
        body();
        footer();
    }
}

class Report1 extends ReportType1 {

    @Override
    void header() {

    }

    @Override
    void body() {

    }

    @Override
    void footer() {

    }
}

interface IXXXX {
}
class XImpl implements IXXXX {
}

interface Database {}
class MySQL implements  Database {
}

interface CRUD {
    void create();
    void read();
    void update();
    void delete();
}
interface COnly {
    void create();
}
class DB2 implements COnly {

    @Override
    public void create() {
        // TODO
    }
}

class DB1 implements CRUD{
    @Override
    public void create() {

    }

    @Override
    public void read() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
