package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.transformer.ExportException;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.lang.Thread;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.client.methods.HttpPost;

/* renamed from: bkb  reason: default package */
public final class bkb implements o05, dke, p1f, pgf, wne {
    public final Object a;
    public Object b;
    public Object c;

    public /* synthetic */ bkb(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public void F(long j) {
    }

    public void a() {
        ((p1f) this.a).a();
    }

    public void b(EncodeException encodeException) {
        ((lq1) this.a).d(encodeException);
    }

    public void c(VideoFrameProcessingException videoFrameProcessingException) {
        ((pj3) this.b).accept(new ExportException("Video frame processing error", videoFrameProcessingException, 5001));
    }

    public void d() {
        ((lq1) this.a).b((Object) null);
    }

    public void e(gle gle) {
        tle tle = (tle) this.c;
        long j = ((ol) this.a).a;
        CopyOnWriteArraySet copyOnWriteArraySet = tle.o;
        boolean contains = copyOnWriteArraySet.contains(Long.valueOf(j));
        if (contains) {
            copyOnWriteArraySet.remove(Long.valueOf(j));
            ((eoe) tle.X.getValue()).d(j);
        }
        if (contains) {
            String str = tle.B0;
            hm9.m(str, "executeTask: cancelling task after processing with requestId=" + ((ol) this.a).a, new Object[0]);
        } else if (((ExecutorService) ((tle) this.c).y0.getValue()).isShutdown()) {
            ol olVar = (ol) this.a;
            if (olVar instanceof ju7) {
                tle tle2 = (tle) this.c;
                tle2.getClass();
                if ((olVar instanceof ju7) && tle2.b != null) {
                    hm9.k(tle.B0, "countDownSyncLogoutLatch");
                    tle2.b.countDown();
                }
            }
        } else if (!((lme) this.b).b().a.get()) {
            ((ExecutorService) ((tle) this.c).y0.getValue()).execute(new ple(this, (ol) this.a, (lme) this.b, gle));
        }
    }

    public sf6 f(int i) {
        return ((p1f) this.a).f(i);
    }

    public void g(pke pke) {
        if (!((ExecutorService) ((tle) this.c).y0.getValue()).isShutdown() && !((lme) this.b).b().a.get()) {
            ((ExecutorService) ((tle) this.c).y0.getValue()).execute(new qle(this, (lme) this.b, (ol) this.a, pke));
        }
    }

    public void h(long j) {
        ((flf) this.c).i = j;
        try {
            ((flf) this.c).f.b();
        } catch (ExportException e) {
            ((pj3) this.b).accept(e);
        }
    }

    public long i() {
        return ((ol) this.a).a;
    }

    public void j(d05 d05) {
        adc adc = (adc) this.c;
        MediaMuxer mediaMuxer = adc.C;
        nb0 nb0 = (nb0) this.b;
        if (mediaMuxer != null) {
            try {
                adc.K(d05, nb0);
                d05.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else if (!adc.r) {
            d05 d052 = adc.U;
            if (d052 != null) {
                d052.close();
                adc.U = null;
            }
            if (d05.I()) {
                adc.U = d05;
                if (!adc.n() || !adc.V.g()) {
                    adc.C(nb0);
                    return;
                }
                return;
            }
            d15 d15 = (d15) adc.F;
            d15.h.execute(new r05(d15, 3));
            d05.close();
            return;
        } else {
            d05.close();
            return;
        }
        throw th;
    }

    public boolean k() {
        return ((p1f) this.a).k();
    }

    public void m(jee jee) {
        ((p1f) this.a).m(jee);
    }

    public void n(q64 q64) {
        ((adc) this.c).G = q64;
    }

    public void o(int i, int i2) {
        jee jee;
        try {
            jee = ((flf) this.c).f.a(i, i2);
        } catch (ExportException e) {
            ((pj3) this.b).accept(e);
            jee = null;
        }
        m(jee);
    }

    public void p() {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        MediaCodec mediaCodec = (MediaCodec) this.a;
        int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, WorkRequest.MIN_BACKOFF_MILLIS);
        if (dequeueOutputBuffer != -3) {
            xef xef = (xef) this.b;
            if (dequeueOutputBuffer != -2) {
                if (dequeueOutputBuffer != -1 && dequeueOutputBuffer >= 0) {
                    if (bufferInfo.size > 0 && xef != null) {
                        ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(dequeueOutputBuffer);
                        if ((bufferInfo.flags & 2) == 0) {
                            float f = (float) (((double) ((int) (((((double) bufferInfo.presentationTimeUs) / ((double) (xef.y - xef.x))) * 100.0d) * 100.0d))) / 100.0d);
                            qj3 qj3 = (qj3) xef.w.b;
                            if (qj3 != null) {
                                try {
                                    qj3.accept(Float.valueOf(f));
                                } catch (Throwable th) {
                                    hm9.p("ada", "convertVideo: progress accept failed", th);
                                }
                            }
                        }
                        ej9 ej9 = xef.c;
                        if (ej9.b()) {
                            boolean z = ej9.c;
                            MediaMuxer mediaMuxer = (MediaMuxer) ej9.f;
                            if (!z) {
                                mediaMuxer.start();
                                ej9.c = true;
                            }
                            ej9.a();
                            mediaMuxer.writeSampleData(ej9.a, outputBuffer, bufferInfo);
                        } else {
                            ((ArrayList) ej9.g).add(new dj9(ej9.a, outputBuffer, bufferInfo));
                        }
                    }
                    mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((bufferInfo.flags & 4) != 0 && xef != null) {
                        MediaCodec mediaCodec2 = (MediaCodec) xef.h.a;
                        if (mediaCodec2 != null) {
                            mediaCodec2.stop();
                        }
                        MediaCodec mediaCodec3 = (MediaCodec) xef.h.a;
                        if (mediaCodec3 != null) {
                            mediaCodec3.release();
                        }
                        xef.g.a();
                        ((MediaMuxer) xef.c.f).stop();
                        ((MediaMuxer) xef.c.f).release();
                        xef.l = true;
                    }
                }
            } else if (xef != null) {
                MediaFormat outputFormat = mediaCodec.getOutputFormat();
                ej9 ej92 = xef.c;
                ej92.a = ((MediaMuxer) ej92.f).addTrack(outputFormat);
            }
        }
    }

    public void q(ffc ffc, hd6 hd6) {
        bkb bkb = this;
        ffc ffc2 = ffc;
        hd6 hd62 = hd6;
        if (((cd6) bkb.c) == null) {
            try {
                cd6 cd6 = new cd6((Context) bkb.a, "shaders/vertex_shader_transformation_es2.glsl", "shaders/fragment_shader_alpha_scale_es2.glsl");
                bkb.c = cd6;
                cd6.o(new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f});
                ((cd6) bkb.c).q("uTexTransformationMatrix", mr0.l());
            } catch (IOException e) {
                throw new Exception(e);
            }
        }
        int i = hd62.b;
        int i2 = hd62.c;
        int i3 = hd62.d;
        mr0.u(i, i2, i3);
        lsd lsd = new lsd(i2, i3);
        fl2 fl2 = (fl2) bkb.b;
        fl2.j = lsd;
        mr0.h();
        cd6 cd62 = (cd6) bkb.c;
        cd62.getClass();
        cd62.w();
        int i4 = 3042;
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        mr0.f();
        int i5 = ffc2.o - 1;
        while (i5 >= 0) {
            if4 if4 = (if4) ffc2.get(i5);
            cd6 cd63 = (cd6) bkb.c;
            cd63.getClass();
            hd6 hd63 = if4.b;
            cd63.u(hd63.a, 0, "uTexSampler");
            lsd lsd2 = new lsd(hd63.c, hd63.d);
            float[] fArr = (float[]) fl2.b;
            Matrix.setIdentityM(fArr, 0);
            float[] fArr2 = (float[]) fl2.a;
            Matrix.setIdentityM(fArr2, 0);
            float[] fArr3 = (float[]) fl2.e;
            Matrix.setIdentityM(fArr3, 0);
            float[] fArr4 = (float[]) fl2.c;
            Matrix.setIdentityM(fArr4, 0);
            float[] fArr5 = (float[]) fl2.d;
            Matrix.setIdentityM(fArr5, 0);
            Matrix.setIdentityM((float[]) fl2.f, 0);
            float[] fArr6 = (float[]) fl2.g;
            Matrix.setIdentityM(fArr6, 0);
            float[] fArr7 = (float[]) fl2.h;
            Matrix.setIdentityM(fArr7, 0);
            float[] fArr8 = (float[]) fl2.i;
            Matrix.setIdentityM(fArr8, 0);
            k8g k8g = if4.d;
            Pair pair = (Pair) k8g.a;
            Matrix.translateM(fArr2, 0, ((Float) pair.first).floatValue(), ((Float) pair.second).floatValue(), 0.0f);
            fm9.l((lsd) fl2.j);
            float f = (float) lsd2.a;
            lsd lsd3 = (lsd) fl2.j;
            float f2 = (float) lsd2.b;
            Matrix.scaleM(fArr, 0, f / ((float) lsd3.a), f2 / ((float) lsd3.b), 1.0f);
            Pair pair2 = (Pair) k8g.c;
            Matrix.scaleM(fArr4, 0, ((Float) pair2.first).floatValue(), ((Float) pair2.second).floatValue(), 1.0f);
            Matrix.invertM(fArr5, 0, fArr4, 0);
            Pair pair3 = (Pair) k8g.b;
            Matrix.translateM(fArr3, 0, ((Float) pair3.first).floatValue() * -1.0f, ((Float) pair3.second).floatValue() * -1.0f, 0.0f);
            Matrix.rotateM((float[]) fl2.f, 0, 0.0f, 0.0f, 0.0f, 1.0f);
            Matrix.scaleM(fArr6, 0, f2 / f, 1.0f, 1.0f);
            Matrix.invertM(fArr7, 0, fArr6, 0);
            float[] fArr9 = (float[]) fl2.i;
            Matrix.multiplyMM(fArr9, 0, fArr9, 0, (float[]) fl2.a, 0);
            float[] fArr10 = (float[]) fl2.i;
            Matrix.multiplyMM(fArr10, 0, fArr10, 0, (float[]) fl2.b, 0);
            float[] fArr11 = (float[]) fl2.i;
            Matrix.multiplyMM(fArr11, 0, fArr11, 0, (float[]) fl2.c, 0);
            float[] fArr12 = (float[]) fl2.i;
            Matrix.multiplyMM(fArr12, 0, fArr12, 0, (float[]) fl2.e, 0);
            float[] fArr13 = (float[]) fl2.i;
            Matrix.multiplyMM(fArr13, 0, fArr13, 0, (float[]) fl2.d, 0);
            float[] fArr14 = (float[]) fl2.i;
            Matrix.multiplyMM(fArr14, 0, fArr14, 0, (float[]) fl2.g, 0);
            float[] fArr15 = (float[]) fl2.i;
            Matrix.multiplyMM(fArr15, 0, fArr15, 0, (float[]) fl2.f, 0);
            float[] fArr16 = (float[]) fl2.i;
            Matrix.multiplyMM(fArr16, 0, fArr16, 0, (float[]) fl2.h, 0);
            float[] fArr17 = (float[]) fl2.i;
            Matrix.multiplyMM(fArr17, 0, fArr17, 0, (float[]) fl2.c, 0);
            cd63.q("uTransformationMatrix", fArr8);
            cd63.p("uAlphaScale", 1.0f);
            cd63.h();
            GLES20.glDrawArrays(5, 0, 4);
            mr0.f();
            ffc2 = ffc;
            i5--;
            i4 = 3042;
            bkb = this;
        }
        GLES20.glDisable(i4);
        mr0.f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object r(kotlin.coroutines.Continuation r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.akb
            if (r0 == 0) goto L_0x0013
            r0 = r10
            akb r0 = (defpackage.akb) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            akb r0 = new akb
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 0
            java.lang.String r5 = "app.profile_migration_complete"
            r6 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r6) goto L_0x002f
            bkb r9 = r0.o
            defpackage.od2.a0(r10)
            goto L_0x00a3
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            defpackage.od2.a0(r10)
            java.lang.Object r10 = r9.a
            je7 r10 = (defpackage.je7) r10
            java.lang.Object r10 = r10.getValue()
            q33 r10 = (defpackage.q33) r10
            t33 r10 = (defpackage.t33) r10
            ne7 r10 = r10.g
            r2 = 0
            boolean r10 = r10.getBoolean(r5, r2)
            java.lang.Class<bkb> r2 = defpackage.bkb.class
            if (r10 == 0) goto L_0x0068
            java.lang.String r9 = r2.getName()
            ir6 r10 = defpackage.hm9.m
            if (r10 != 0) goto L_0x005a
            goto L_0x0067
        L_0x005a:
            boolean r0 = r10.c()
            if (r0 == 0) goto L_0x0067
            us7 r0 = defpackage.us7.X
            java.lang.String r1 = "profile migration already complete"
            r10.d(r0, r9, r1, r4)
        L_0x0067:
            return r3
        L_0x0068:
            java.lang.String r10 = r2.getName()
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x0071
            goto L_0x007e
        L_0x0071:
            boolean r7 = r2.c()
            if (r7 == 0) goto L_0x007e
            us7 r7 = defpackage.us7.X
            java.lang.String r8 = "start profile migration"
            r2.d(r7, r10, r8, r4)
        L_0x007e:
            java.lang.Object r10 = r9.b
            je7 r10 = (defpackage.je7) r10
            java.lang.Object r10 = r10.getValue()
            ds3 r10 = (defpackage.ds3) r10
            java.lang.Object r2 = r9.a
            je7 r2 = (defpackage.je7) r2
            java.lang.Object r2 = r2.getValue()
            q33 r2 = (defpackage.q33) r2
            hyc r2 = (defpackage.hyc) r2
            long r7 = r2.t()
            r0.o = r9
            r0.Z = r6
            java.lang.Comparable r10 = r10.b(r7, r0)
            if (r10 != r1) goto L_0x00a3
            return r1
        L_0x00a3:
            uj3 r10 = (defpackage.uj3) r10
            if (r10 == 0) goto L_0x00cb
            java.lang.Object r0 = r9.c
            je7 r0 = (defpackage.je7) r0
            java.lang.Object r0 = r0.getValue()
            blb r0 = (defpackage.blb) r0
            kotlinx.coroutines.internal.ContextScope r1 = r0.c
            alb r2 = new alb
            r2.<init>(r10, r0, r4)
            r10 = 3
            defpackage.j47.T(r1, r4, r4, r2, r10)
            java.lang.Object r9 = r9.a
            je7 r9 = (defpackage.je7) r9
            java.lang.Object r9 = r9.getValue()
            q33 r9 = (defpackage.q33) r9
            t33 r9 = (defpackage.t33) r9
            r9.j(r5, r6)
        L_0x00cb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkb.r(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void release() {
        ((p1f) this.a).release();
    }

    public ThreadFactory s(String str, Integer num) {
        return (ThreadFactory) ((ConcurrentHashMap) this.c).computeIfAbsent(str, new di(14, new lr1(str, this, num, 9)));
    }

    public synchronized void t(qs0 qs0) {
        try {
            qs0 qs02 = qs0.a;
            qs0 qs03 = qs0.d;
            if (qs02 != null) {
                qs02.d = qs03;
            }
            if (qs03 != null) {
                qs03.a = qs02;
            }
            qs0.a = null;
            qs0.d = null;
            if (qs0 == ((qs0) this.b)) {
                this.b = qs03;
            }
            if (qs0 == ((qs0) this.c)) {
                this.c = qs02;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public /* synthetic */ bkb(boolean z, Object obj, Object obj2, Object obj3) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public bkb(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, gba gba) {
        this.a = uncaughtExceptionHandler;
        this.b = gba;
        this.c = new ConcurrentHashMap();
    }

    public bkb(String str, qq6 qq6) {
        this.a = HttpPost.METHOD_NAME;
        this.b = str;
        this.c = qq6;
    }

    public bkb(int i) {
        switch (i) {
            case 4:
                this.a = new aab(0);
                this.b = new khe(new ie(14, (Object) this));
                return;
            default:
                this.a = new SparseArray();
                return;
        }
    }

    public bkb(int i, int i2, int i3, int i4, xef xef) {
        this.b = xef;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
        createVideoFormat.setInteger("frame-rate", i3);
        createVideoFormat.setInteger("bitrate", i4);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("i-frame-interval", 1);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.a = createEncoderByType;
        createEncoderByType.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.c = createEncoderByType.createInputSurface();
        createEncoderByType.start();
    }

    public bkb(Executor executor) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new k40(this);
        this.a = new qm(executor, 1);
    }

    public bkb(Context context) {
        this.a = context;
        this.b = new fl2();
    }

    public bkb(flf flf, Context context, o1f o1f, i63 i63, gte gte, xw0 xw0, crd crd, List list) {
        flf flf2 = flf;
        this.c = flf2;
        this.b = gte;
        this.a = o1f.m(context, i63, xw0, this, crd, list, flf2.h);
    }

    public bkb(imc imc) {
        this.c = imc;
        this.b = new AtomicBoolean(false);
        this.a = ((fu1) imc.c).o.schedule((Runnable) new zt1(this, 0), 2000, TimeUnit.MILLISECONDS);
    }
}
