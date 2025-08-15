package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: p47  reason: default package */
public abstract class p47 {
    /* JADX WARNING: type inference failed for: r0v2, types: [one, java.lang.Object] */
    public static q47 a(byte[] bArr) {
        try {
            Tasks.InvalidateAndDownloadAudio invalidateAndDownloadAudio = (Tasks.InvalidateAndDownloadAudio) qw8.mergeFrom(new Tasks.InvalidateAndDownloadAudio(), bArr);
            ? obj = new Object();
            Tasks.FileDownload fileDownload = invalidateAndDownloadAudio.fileDownload;
            obj.a = fileDownload.messageId;
            obj.b = fileDownload.attachId;
            obj.c = fileDownload.videoId;
            obj.d = fileDownload.audioId;
            obj.e = fileDownload.mp4GifId;
            obj.f = fileDownload.stickerId;
            obj.j = fileDownload.fileId;
            obj.k = fileDownload.fileName;
            obj.g = fileDownload.url;
            obj.h = fileDownload.notifyProgress;
            obj.i = fileDownload.checkAutoloadConnection;
            obj.l = fileDownload.invalidateCount;
            obj.m = fileDownload.useOriginalExtension;
            obj.n = fileDownload.notCopyVideoToGallery;
            return new q47(invalidateAndDownloadAudio.requestId, invalidateAndDownloadAudio.outputPath, invalidateAndDownloadAudio.chatServerId, invalidateAndDownloadAudio.serverMessageId, new pne(obj));
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
