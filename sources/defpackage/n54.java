package defpackage;

import java.util.Locale;

/* renamed from: n54  reason: default package */
public final class n54 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public int m;

    public /* synthetic */ n54(int i2) {
        this.a = i2;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                int i2 = this.b;
                int i3 = this.c;
                int i4 = this.d;
                int i5 = this.e;
                int i6 = this.f;
                int i7 = this.g;
                int i8 = this.h;
                int i9 = this.i;
                int i10 = this.j;
                int i11 = this.k;
                long j2 = this.l;
                int i12 = this.m;
                int i13 = maf.a;
                Locale locale = Locale.US;
                StringBuilder j3 = wg0.j("DecoderCounters {\n decoderInits=", i2, ",\n decoderReleases=", i3, "\n queuedInputBuffers=");
                ms2.k(j3, i4, "\n skippedInputBuffers=", i5, "\n renderedOutputBuffers=");
                ms2.k(j3, i6, "\n skippedOutputBuffers=", i7, "\n droppedBuffers=");
                ms2.k(j3, i8, "\n droppedInputBuffers=", i9, "\n maxConsecutiveDroppedBuffers=");
                String str = "\n droppedToKeyframeEvents=";
                int i14 = i10;
                int i15 = i11;
                ms2.k(j3, i14, str, i15, "\n totalVideoFrameProcessingOffsetUs=");
                j3.append(j2);
                j3.append("\n videoFrameProcessingOffsetCount=");
                j3.append(i12);
                j3.append("\n}");
                return j3.toString();
            default:
                int i16 = this.b;
                int i17 = this.c;
                int i18 = this.d;
                int i19 = this.e;
                int i20 = this.f;
                int i21 = this.g;
                int i22 = this.h;
                int i23 = this.i;
                int i24 = this.j;
                int i25 = this.k;
                long j4 = this.l;
                int i26 = this.m;
                int i27 = oaf.a;
                Locale locale2 = Locale.US;
                StringBuilder j5 = wg0.j("DecoderCounters {\n decoderInits=", i16, ",\n decoderReleases=", i17, "\n queuedInputBuffers=");
                ms2.k(j5, i18, "\n skippedInputBuffers=", i19, "\n renderedOutputBuffers=");
                ms2.k(j5, i20, "\n skippedOutputBuffers=", i21, "\n droppedBuffers=");
                String str2 = "\n droppedInputBuffers=";
                ms2.k(j5, i22, str2, i23, "\n maxConsecutiveDroppedBuffers=");
                int i28 = i24;
                ms2.k(j5, i28, "\n droppedToKeyframeEvents=", i25, "\n totalVideoFrameProcessingOffsetUs=");
                j5.append(j4);
                j5.append("\n videoFrameProcessingOffsetCount=");
                j5.append(i26);
                j5.append("\n}");
                return j5.toString();
        }
    }
}
