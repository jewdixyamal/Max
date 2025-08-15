package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* renamed from: lqa  reason: default package */
public final class lqa implements VideoSink {
    public final Map a;
    public final o9g b;

    public lqa(ConcurrentHashMap concurrentHashMap, o9g o9g) {
        this.a = concurrentHashMap;
        this.b = o9g;
    }

    public final void onFrame(VideoFrame videoFrame) {
        Long compactParticipantId;
        fp1 fp1;
        List<VideoSink> list;
        if ((videoFrame.getRotatedWidth() > 16 || videoFrame.getRotatedHeight() > 16) && (compactParticipantId = videoFrame.getCompactParticipantId()) != null && (fp1 = (fp1) ((ConcurrentHashMap) this.b.b).get(Integer.valueOf((int) compactParticipantId.longValue()))) != null && (list = (List) this.a.get(fp1)) != null) {
            for (VideoSink onFrame : list) {
                onFrame.onFrame(videoFrame);
            }
        }
    }
}
