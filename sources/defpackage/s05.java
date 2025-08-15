package defpackage;

import android.media.MediaCodec;
import android.util.Range;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;

/* renamed from: s05  reason: default package */
public final /* synthetic */ class s05 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d15 b;
    public final /* synthetic */ long c;

    public /* synthetic */ s05(d15 d15, long j, int i) {
        this.a = i;
        this.b = d15;
        this.c = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                d15 d15 = this.b;
                switch (au1.s(d15.D)) {
                    case 0:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                        return;
                    case 1:
                        long j = this.c;
                        a14.H(j);
                        d15.o.addLast(Range.create(Long.valueOf(j), Long.MAX_VALUE));
                        d15.i(3);
                        return;
                    case 4:
                        d15.i(6);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(rh4.r(d15.D)));
                }
            default:
                d15 d152 = this.b;
                long j2 = this.c;
                switch (au1.s(d152.D)) {
                    case 0:
                        d152.w = null;
                        a14.H(j2);
                        try {
                            if (d152.z) {
                                d152.h();
                            }
                            d152.t = Range.create(Long.valueOf(j2), Long.MAX_VALUE);
                            d152.e.start();
                            k05 k05 = d152.f;
                            if (k05 instanceof z05) {
                                ((z05) k05).a(true);
                            }
                            d152.i(2);
                            return;
                        } catch (MediaCodec.CodecException e) {
                            d152.b(1, e.getMessage(), e);
                            return;
                        }
                    case 1:
                    case 4:
                    case 7:
                        return;
                    case 2:
                        d152.w = null;
                        Range range = (Range) d152.o.removeLast();
                        c54.p("There should be a \"pause\" before \"resume\"", range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE);
                        Long l = (Long) range.getLower();
                        long longValue = l.longValue();
                        d152.o.addLast(Range.create(l, Long.valueOf(j2)));
                        a14.H(j2);
                        a14.H(j2 - longValue);
                        if ((d152.c || xi4.a.e(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!d152.c || xi4.a.e(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                            d152.e.setParameters(zr6.g(0, "drop-input-frames"));
                            k05 k052 = d152.f;
                            if (k052 instanceof z05) {
                                ((z05) k052).a(true);
                            }
                        }
                        if (d152.c) {
                            d152.g();
                        }
                        d152.i(2);
                        return;
                    case 3:
                    case 5:
                        d152.i(5);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(rh4.r(d152.D)));
                }
        }
    }
}
