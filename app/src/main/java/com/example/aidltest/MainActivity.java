package com.example.aidltest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

import woyou.aidlservice.jiuiv5.ICallback;
import woyou.aidlservice.jiuiv5.ILcdCallback;
import woyou.aidlservice.jiuiv5.ITax;
import woyou.aidlservice.jiuiv5.IWoyouService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IWoyouService iWoyouService = new IWoyouService() {
            @Override
            public void updateFirmware() throws RemoteException {

            }

            @Override
            public int getFirmwareStatus() throws RemoteException {
                return 0;
            }

            @Override
            public String getServiceVersion() throws RemoteException {
                return null;
            }

            @Override
            public void printerInit(ICallback iCallback) throws RemoteException {

            }

            @Override
            public void printerSelfChecking(ICallback iCallback) throws RemoteException {

            }

            @Override
            public String getPrinterSerialNo() throws RemoteException {
                return null;
            }

            @Override
            public String getPrinterVersion() throws RemoteException {
                return null;
            }

            @Override
            public String getPrinterModal() throws RemoteException {
                return null;
            }

            @Override
            public int getPrintedLength() throws RemoteException {
                return 0;
            }

            @Override
            public void lineWrap(int i, ICallback iCallback) throws RemoteException {

            }

            @Override
            public void sendRAWData(byte[] bytes, ICallback iCallback) throws RemoteException {

            }

            @Override
            public void setAlignment(int i, ICallback iCallback) throws RemoteException {

            }

            @Override
            public void setFontName(String s, ICallback iCallback) throws RemoteException {

            }

            @Override
            public void setFontSize(float v, ICallback iCallback) throws RemoteException {

            }

            @Override
            public void printText(String s, ICallback iCallback) throws RemoteException {

            }

            @Override
            public void printTextWithFont(String s, String s1, float v, ICallback iCallback) throws RemoteException {

            }

            @Override
            public void printColumnsText(String[] strings, int[] ints, int[] ints1, ICallback iCallback) throws RemoteException {

            }

            @Override
            public void printBitmap(Bitmap bitmap, ICallback iCallback) throws RemoteException {

            }

            @Override
            public void printBarCode(String s, int i, int i1, int i2, int i3, ICallback iCallback) throws RemoteException {

            }

            @Override
            public void printQRCode(String s, int i, int i1, ICallback iCallback) throws RemoteException {

            }

            @Override
            public void printOriginalText(String s, ICallback iCallback) throws RemoteException {

            }

            @Override
            public void commitPrinterBuffer() throws RemoteException {

            }

            @Override
            public void cutPaper(ICallback iCallback) throws RemoteException {

            }

            @Override
            public int getCutPaperTimes() throws RemoteException {
                return 0;
            }

            @Override
            public void openDrawer(ICallback iCallback) throws RemoteException {

            }

            @Override
            public int getOpenDrawerTimes() throws RemoteException {
                return 0;
            }

            @Override
            public void enterPrinterBuffer(boolean b) throws RemoteException {

            }

            @Override
            public void exitPrinterBuffer(boolean b) throws RemoteException {

            }

            @Override
            public void tax(byte[] bytes, ITax iTax) throws RemoteException {

            }

            @Override
            public int getPrinterMode() throws RemoteException {
                return 0;
            }

            @Override
            public int getPrinterBBMDistance() throws RemoteException {
                return 0;
            }

            @Override
            public void printColumnsString(String[] strings, int[] ints, int[] ints1, ICallback iCallback) throws RemoteException {

            }

            @Override
            public int updatePrinterState() throws RemoteException {
                return 0;
            }

            @Override
            public void sendLCDCommand(int i) throws RemoteException {

            }

            @Override
            public void sendLCDString(String s, ILcdCallback iLcdCallback) throws RemoteException {

            }

            @Override
            public void sendLCDBitmap(Bitmap bitmap, ILcdCallback iLcdCallback) throws RemoteException {

            }

            @Override
            public void commitPrinterBufferWithCallback(ICallback iCallback) throws RemoteException {

            }

            @Override
            public void exitPrinterBufferWithCallback(boolean b, ICallback iCallback) throws RemoteException {

            }

            @Override
            public void sendLCDDoubleString(String s, String s1, ILcdCallback iLcdCallback) throws RemoteException {

            }

            @Override
            public void printBitmapCustom(Bitmap bitmap, int i, ICallback iCallback) throws RemoteException {

            }

            @Override
            public IBinder asBinder() {
                return null;
            }
        };
    }
}