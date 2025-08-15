package ru.ok.android.externcalls.sdk.api.retry;

import androidx.work.WorkRequest;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import kotlin.Metadata;
import ru.ok.android.api.http.HttpStatusApiException;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\b\u001a9\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\b\u001a9\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\b\u001a9\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\b\u001a9\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\b\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\b\u001aA\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u0017\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u001a8\u0002XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"", "T", "Liqd;", "", "isEnabled", "La4c;", "logger", "retryApiCallForOutgoing", "(Liqd;ZLa4c;)Liqd;", "retryApiCallForJoining", "retryApiCallForIncoming", "retryApiCallForBackgroundWork", "retryApiCallForFastWorkRequired", "retryWithFastBackoff", "retryWithSlowBackoff", "Llf0;", "backoff", "retryApiWithBackoff", "(Liqd;ZLa4c;Llf0;)Liqd;", "createFastBackoff", "()Llf0;", "createSlowBackoff", "", "throwable", "retryApiExceptionFilter", "(Ljava/lang/Throwable;)Z", "", "LOG_TAG", "Ljava/lang/String;", "calls-sdk_release"}, k = 2, mv = {1, 9, 0})
public final class RetryKt {
    private static final String LOG_TAG = "CallsApiRetry";

    private static final lf0 createFastBackoff() {
        return new lf0(new s85(15, 0, 0.0f), MultiFileUploader.UPLOAD_NEXT_INTERVAL);
    }

    private static final lf0 createSlowBackoff() {
        return new lf0(new s85(10, 1000, 2.0f), WorkRequest.MIN_BACKOFF_MILLIS);
    }

    public static final <T> iqd retryApiCallForBackgroundWork(iqd iqd, boolean z, a4c a4c) {
        return retryWithSlowBackoff(iqd, z, a4c);
    }

    public static final <T> iqd retryApiCallForFastWorkRequired(iqd iqd, boolean z, a4c a4c) {
        return retryWithFastBackoff(iqd, z, a4c);
    }

    public static final <T> iqd retryApiCallForIncoming(iqd iqd, boolean z, a4c a4c) {
        return retryWithSlowBackoff(iqd, z, a4c);
    }

    public static final <T> iqd retryApiCallForJoining(iqd iqd, boolean z, a4c a4c) {
        return retryWithFastBackoff(iqd, z, a4c);
    }

    public static final <T> iqd retryApiCallForOutgoing(iqd iqd, boolean z, a4c a4c) {
        return retryWithFastBackoff(iqd, z, a4c);
    }

    /* access modifiers changed from: private */
    public static final boolean retryApiExceptionFilter(Throwable th) {
        if ((th instanceof UnknownHostException) || (th instanceof ConnectException) || (th instanceof NoRouteToHostException) || (th instanceof SocketException) || (th instanceof SSLProtocolException) || (th instanceof SSLPeerUnverifiedException) || (th instanceof SSLHandshakeException) || (th instanceof SSLException) || (th instanceof HttpRetryException)) {
            return true;
        }
        if (th instanceof HttpStatusApiException) {
            int i = ((HttpStatusApiException) th).a;
            if (i == 502 || i == 504) {
                return true;
            }
        } else if ((th instanceof ProtocolException) || (th instanceof IOException)) {
            return true;
        }
        return false;
    }

    private static final <T> iqd retryApiWithBackoff(iqd iqd, boolean z, a4c a4c, lf0 lf0) {
        if (z) {
            RetryKt$retryApiWithBackoff$1 retryKt$retryApiWithBackoff$1 = RetryKt$retryApiWithBackoff$1.INSTANCE;
            RetryKt$retryApiWithBackoff$2 retryKt$retryApiWithBackoff$2 = new RetryKt$retryApiWithBackoff$2(a4c);
            RetryKt$retryApiWithBackoff$3 retryKt$retryApiWithBackoff$3 = new RetryKt$retryApiWithBackoff$3(a4c);
            return new q1a(0, new e0a(iqd.n(), new yjc((m56) retryKt$retryApiWithBackoff$1, lf0, (a66) retryKt$retryApiWithBackoff$2, muc.a(), (m56) retryKt$retryApiWithBackoff$3), 6));
        }
        a4c.log(LOG_TAG, "retry disabled");
        return iqd;
    }

    private static final <T> iqd retryWithFastBackoff(iqd iqd, boolean z, a4c a4c) {
        return retryApiWithBackoff(iqd, z, a4c, createFastBackoff());
    }

    private static final <T> iqd retryWithSlowBackoff(iqd iqd, boolean z, a4c a4c) {
        return retryApiWithBackoff(iqd, z, a4c, createSlowBackoff());
    }
}
