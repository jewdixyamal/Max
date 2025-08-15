package defpackage;

import android.net.Uri;
import java.io.IOException;
import ru.ok.android.api.core.ApiException;

/* renamed from: n01  reason: default package */
public final class n01 implements hl {
    public final void debugApiException(vk vkVar, fl flVar, ApiException apiException) {
        Uri uri = flVar.getUri();
        String message = apiException.getMessage();
        hm9.l0("ApiProviderTag", "debugApiException: " + uri + " " + message, apiException);
    }

    public final void debugApiRequest(vk vkVar, fl flVar, wk wkVar) {
        Uri uri = flVar.getUri();
        hm9.m("ApiProviderTag", "debugApiRequest: " + uri, new Object[0]);
    }

    public final db7 debugApiResponseFail(vk vkVar, fl flVar, db7 db7) {
        Uri uri = flVar.getUri();
        hm9.m0("ApiProviderTag", "debugApiResponseFail: " + uri, new Object[0]);
        return db7;
    }

    public final db7 debugApiResponseOk(vk vkVar, fl flVar, db7 db7) {
        Uri uri = flVar.getUri();
        hm9.m("ApiProviderTag", "debugApiResponseOk: " + uri, new Object[0]);
        return db7;
    }

    public final void debugIoException(vk vkVar, fl flVar, IOException iOException) {
        Uri uri = flVar.getUri();
        String message = iOException.getMessage();
        hm9.l0("ApiProviderTag", "debugIoException: " + uri + " " + message, iOException);
    }
}
