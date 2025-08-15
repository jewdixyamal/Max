package defpackage;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* renamed from: d54  reason: default package */
public abstract class d54 {
    public static final LinkedHashMap a = new LinkedHashMap();

    static {
        jn a2 = cx6.a();
        a2.I("AssetLoader", zw6.o("InputFormat", "OutputFormat"));
        Object[] objArr = {"InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"};
        c54.n(6, objArr);
        a2.I("AudioDecoder", zw6.h(6, objArr));
        a2.I("AudioGraph", zw6.o("RegisterNewInputStream", "OutputEnded"));
        Object[] objArr2 = {"RegisterNewInputStream", "OutputFormat", "ProducedOutput"};
        c54.n(3, objArr2);
        a2.I("AudioMixer", zw6.h(3, objArr2));
        Object[] objArr3 = {"InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"};
        c54.n(6, objArr3);
        a2.I("AudioEncoder", zw6.h(6, objArr3));
        Object[] objArr4 = {"InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"};
        c54.n(6, objArr4);
        a2.I("VideoDecoder", zw6.h(6, objArr4));
        Object[] objArr5 = {"RegisterNewInputStream", "SurfaceTextureInput", "QueueFrame", "QueueBitmap", "QueueTexture", "RenderedToOutputSurface", "OutputTextureRendered", "ReceiveEndOfAllInput", "SignalEnded"};
        c54.n(9, objArr5);
        a2.I("VFP", zw6.h(9, objArr5));
        a2.I("ExternalTextureManager", zw6.o("SignalEOS", "SurfaceTextureTransformFix"));
        a2.I("BitmapTextureManager", zw6.n("SignalEOS"));
        a2.I("TexIdTextureManager", zw6.n("SignalEOS"));
        a2.I("Compositor", zw6.n("OutputTextureRendered"));
        Object[] objArr6 = {"InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"};
        c54.n(6, objArr6);
        a2.I("VideoEncoder", zw6.h(6, objArr6));
        a2.I("Muxer", zw6.p("InputFormat", "CanWriteSample", "AcceptedInput", "InputEnded", "OutputEnded"));
        a2.j();
        SystemClock.elapsedRealtime();
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 114 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a() {
        /*
            java.lang.Class<d54> r0 = defpackage.d54.class
            monitor-enter(r0)
            java.lang.Class<d54> r1 = defpackage.d54.class
            monitor-enter(r1)     // Catch:{ all -> 0x000b }
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            monitor-exit(r0)
            return
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            throw r1
        L_0x000b:
            r1 = move-exception
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d54.a():void");
    }
}
