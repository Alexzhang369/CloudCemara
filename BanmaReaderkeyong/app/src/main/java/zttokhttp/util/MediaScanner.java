package zttokhttp.util;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.util.Log;

import java.io.File;

/**
 * Created by Administrator on 2017/7/27.
 */

public class MediaScanner  {
    private static MediaScanner instance;
    public static MediaScanner get(Context mContext,File file) {
        if(instance == null) {
            instance = new MediaScanner(mContext,file);
        }

        return instance;
    }

    public MediaScanner(Context context,File file)
    {
        MediaScannerConnection.scanFile(context,
                new String[]{file.toString()}, null,
                new MediaScannerConnection.OnScanCompletedListener() {
                    public void onScanCompleted(String path, Uri uri) {
                        Log.i("ExternalStorage", "Scanned " + path + ":");
                        Log.i("ExternalStorage", "-> uri=" + uri);
                    }
                });
    }
}