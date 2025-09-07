package behavioral.templateMethod;

abstract class AbstractReportExporter {
    public final void exportReport(ReportData data, String filePath) {
        prepareData(data);
        openFile(filePath);
        writeHeader(data);
        writeDataRows(data);
        writeFooter(data);
        closeFile(filePath);
        System.out.println("Export complete: " + filePath);
    }

    protected void prepareData(ReportData data) { // Hook method
        System.out.println("Preparing report data (common step)...");
    }

    protected void openFile(String filePath) { // Hook method
        System.out.println("Opening file '" + filePath);
    };

    protected abstract void writeHeader(ReportData data);

    protected abstract void writeDataRows(ReportData data);

    protected void writeFooter(ReportData data) { // Hook method
        System.out.println("Writing footer (default: no footer).");
    }

    protected void closeFile(String filePath) { // Hook method
        System.out.println("Closing file '" + filePath);
    }
}
