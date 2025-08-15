package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* renamed from: jqa  reason: default package */
public final class jqa implements VideoSink {
    public final String a;
    public long b = -1;
    public final /* synthetic */ kqa c;

    public jqa(kqa kqa, String str) {
        this.c = kqa;
        this.a = str;
    }

    public final void onFrame(VideoFrame videoFrame) {
        fp1 fp1;
        Long compactParticipantId = videoFrame.getCompactParticipantId();
        if (compactParticipantId == null) {
            compactParticipantId = -1L;
        }
        if (compactParticipantId.longValue() != this.b) {
            this.b = compactParticipantId.longValue();
            if (compactParticipantId.longValue() == -1) {
                compactParticipantId = null;
            }
            kqa kqa = this.c;
            ConcurrentHashMap concurrentHashMap = kqa.v0;
            String str = this.a;
            fp1 fp12 = (fp1) concurrentHashMap.get(str);
            ConcurrentHashMap concurrentHashMap2 = kqa.w0;
            ConcurrentHashMap concurrentHashMap3 = kqa.v0;
            if (fp12 != null) {
                concurrentHashMap3.remove(str, fp12);
                concurrentHashMap2.remove(fp12, str);
            }
            if (compactParticipantId != null && (fp1 = (fp1) ((ConcurrentHashMap) ((o9g) kqa.X).b).get(Integer.valueOf((int) compactParticipantId.longValue()))) != null) {
                concurrentHashMap3.put(str, fp1);
                concurrentHashMap2.put(fp1, str);
            }
        }
    }
}
