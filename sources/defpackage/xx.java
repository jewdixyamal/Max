package defpackage;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.ExoPlaybackException;

/* renamed from: xx  reason: default package */
public final /* synthetic */ class xx implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Handler.Callback c;

    public /* synthetic */ xx(Object obj, Handler.Callback callback, int i) {
        this.a = i;
        this.b = obj;
        this.c = callback;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.a) {
            case 0:
                ((zx) this.b).getClass();
                r88 r88 = (r88) this.c;
                r88.getClass();
                if (maf.a < 30) {
                    Handler handler = r88.b;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    return;
                }
                s88 s88 = (s88) r88.c;
                if (r88 == s88.x2) {
                    if (j == Long.MAX_VALUE) {
                        s88.J1 = true;
                        return;
                    }
                    try {
                        s88.q0(j);
                        s88.y0();
                        s88.L1.f++;
                        s88.x0();
                        s88.a0(j);
                        return;
                    } catch (ExoPlaybackException e) {
                        s88.K1 = e;
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                ((ay) this.b).getClass();
                r88 r882 = (r88) this.c;
                r882.getClass();
                if (oaf.a < 30) {
                    Handler handler2 = r882.b;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    return;
                }
                r882.a(j);
                return;
            case 2:
                ((pl8) this.b).getClass();
                r88 r883 = (r88) this.c;
                r883.getClass();
                if (maf.a < 30) {
                    Handler handler3 = r883.b;
                    handler3.sendMessageAtFrontOfQueue(Message.obtain(handler3, 0, (int) (j >> 32), (int) j));
                    return;
                }
                s88 s882 = (s88) r883.c;
                if (r883 == s882.x2) {
                    if (j == Long.MAX_VALUE) {
                        s882.J1 = true;
                        return;
                    }
                    try {
                        s882.q0(j);
                        s882.y0();
                        s882.L1.f++;
                        s882.x0();
                        s882.a0(j);
                        return;
                    } catch (ExoPlaybackException e2) {
                        s882.K1 = e2;
                        return;
                    }
                } else {
                    return;
                }
            default:
                ((adb) this.b).getClass();
                r88 r884 = (r88) this.c;
                r884.getClass();
                if (oaf.a < 30) {
                    Handler handler4 = r884.b;
                    handler4.sendMessageAtFrontOfQueue(Message.obtain(handler4, 0, (int) (j >> 32), (int) j));
                    return;
                }
                r884.a(j);
                return;
        }
    }
}
