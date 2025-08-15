package one.me.sdk.messagewrite.recordcontrols.delegates;

import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"one/me/sdk/messagewrite/recordcontrols/delegates/VideoMessageRecordDelegate$PreviewRenderException", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "message-write-widget_release"}, k = 1, mv = {2, 0, 0})
public final class VideoMessageRecordDelegate$PreviewRenderException extends IllegalStateException {
    public VideoMessageRecordDelegate$PreviewRenderException() {
        this(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoMessageRecordDelegate$PreviewRenderException(int i) {
        super(zr6.i("Preview wasn't rendered for ", ft4.j(z7.S(MultiFileUploader.UPLOAD_NEXT_INTERVAL, kt4.SECONDS)), " seconds"));
        int i2 = ft4.o;
    }
}
