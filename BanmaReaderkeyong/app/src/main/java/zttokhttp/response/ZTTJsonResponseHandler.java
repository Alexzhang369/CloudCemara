package zttokhttp.response;

import org.json.JSONObject;

/**
 * json类型的回调接口
 * Created by tsy on 16/8/15.
 */
public abstract class ZTTJsonResponseHandler implements ZTTIResponseHandler {

    public abstract void onSuccess(int statusCode, JSONObject response);

    @Override
    public void onProgress(long currentBytes, long totalBytes) {

    }
}
