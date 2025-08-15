package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* renamed from: t75  reason: default package */
public final class t75 extends u2 {
    public final ArrayList A0;
    public final boolean B0;
    public final h74 C0;
    public final Looper D0;
    public final gg0 E0;
    public final rhe F0;
    public final n75 G0;
    public final p75 H0;
    public final n40 I0;
    public final f9e J0;
    public final huc K0;
    public final o84 L0;
    public final long M0;
    public int N0;
    public int O0;
    public int P0;
    public boolean Q0;
    public int R0;
    public final w1d S0;
    public cod T0;
    public j3b U0;
    public fd8 V0;
    public final AudioTrack W0;
    public final ae3 X = new ae3(false, 0);
    public Object X0;
    public final Context Y;
    public Surface Y0;
    public final u2 Z;
    public final int Z0;
    public int a1;
    public int b1;
    public final l0f c;
    public final int c1;
    public final g30 d1;
    public float e1;
    public boolean f1;
    public final boolean g1;
    public boolean h1;
    public final si4 i1;
    public fd8 j1;
    public z2b k1;
    public int l1;
    public long m1;
    public final j3b o;
    public final uj0[] s0;
    public final gz7 t0;
    public final aie u0;
    public final g75 v0;
    public final f85 w0;
    public final z23 x0;
    public final CopyOnWriteArraySet y0;
    public final gue z0;

    static {
        h85.a("goog.exo.exoplayer");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: t75} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: t75} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: t75} */
    /* JADX WARNING: type inference failed for: r12v1, types: [java.lang.Object, p75] */
    /* JADX WARNING: type inference failed for: r2v16, types: [huc, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t75(defpackage.w65 r31, defpackage.u2 r32) {
        /*
            r30 = this;
            r1 = r30
            r0 = r31
            r4 = 20
            r5 = 1
            r6 = 0
            r7 = 2
            r1.<init>(r7)
            ae3 r8 = new ae3
            r8.<init>((boolean) r6, (int) r6)
            r1.X = r8
            int r8 = java.lang.System.identityHashCode(r30)     // Catch:{ all -> 0x019e }
            java.lang.String r8 = java.lang.Integer.toHexString(r8)     // Catch:{ all -> 0x019e }
            java.lang.String r9 = defpackage.maf.e     // Catch:{ all -> 0x019e }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x019e }
            int r8 = r8.length()     // Catch:{ all -> 0x019e }
            int r8 = r8 + 30
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x019e }
            int r9 = r9.length()     // Catch:{ all -> 0x019e }
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x019e }
            r9.<init>(r8)     // Catch:{ all -> 0x019e }
            android.content.Context r8 = r0.a     // Catch:{ all -> 0x019e }
            android.os.Looper r9 = r0.i
            android.content.Context r10 = r8.getApplicationContext()     // Catch:{ all -> 0x019e }
            r1.Y = r10     // Catch:{ all -> 0x019e }
            w56 r10 = r0.h     // Catch:{ all -> 0x019e }
            rhe r11 = r0.b
            java.lang.Object r10 = r10.apply(r11)     // Catch:{ all -> 0x019e }
            h74 r10 = (defpackage.h74) r10     // Catch:{ all -> 0x019e }
            r1.C0 = r10     // Catch:{ all -> 0x019e }
            g30 r10 = r0.j     // Catch:{ all -> 0x019e }
            r1.d1 = r10     // Catch:{ all -> 0x019e }
            int r10 = r0.k     // Catch:{ all -> 0x019e }
            r1.Z0 = r10     // Catch:{ all -> 0x019e }
            r1.f1 = r6     // Catch:{ all -> 0x019e }
            long r12 = r0.o     // Catch:{ all -> 0x019e }
            r1.M0 = r12     // Catch:{ all -> 0x019e }
            n75 r10 = new n75     // Catch:{ all -> 0x019e }
            r10.<init>(r1)     // Catch:{ all -> 0x019e }
            r1.G0 = r10     // Catch:{ all -> 0x019e }
            p75 r12 = new p75     // Catch:{ all -> 0x019e }
            r12.<init>()     // Catch:{ all -> 0x019e }
            r1.H0 = r12     // Catch:{ all -> 0x019e }
            android.os.Handler r12 = new android.os.Handler     // Catch:{ all -> 0x019e }
            r12.<init>(r9)     // Catch:{ all -> 0x019e }
            jde r13 = r0.c     // Catch:{ all -> 0x019e }
            java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x019e }
            r14 = r13
            cle r14 = (defpackage.cle) r14     // Catch:{ all -> 0x019e }
            r15 = r12
            r16 = r10
            r17 = r10
            r18 = r10
            r19 = r10
            uj0[] r10 = r14.a(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x019e }
            r1.s0 = r10     // Catch:{ all -> 0x019e }
            int r13 = r10.length     // Catch:{ all -> 0x019e }
            if (r13 <= 0) goto L_0x0089
            r13 = r5
            goto L_0x008a
        L_0x0089:
            r13 = r6
        L_0x008a:
            defpackage.np8.f(r13)     // Catch:{ all -> 0x019e }
            jde r13 = r0.e     // Catch:{ all -> 0x019e }
            java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x019e }
            gz7 r13 = (defpackage.gz7) r13     // Catch:{ all -> 0x019e }
            r1.t0 = r13     // Catch:{ all -> 0x019e }
            jde r13 = r0.d     // Catch:{ all -> 0x019e }
            java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x019e }
            vj8 r13 = (defpackage.vj8) r13     // Catch:{ all -> 0x019e }
            jde r13 = r0.g     // Catch:{ all -> 0x019e }
            java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x019e }
            gg0 r13 = (defpackage.gg0) r13     // Catch:{ all -> 0x019e }
            r1.E0 = r13     // Catch:{ all -> 0x019e }
            boolean r13 = r0.l     // Catch:{ all -> 0x019e }
            r1.B0 = r13     // Catch:{ all -> 0x019e }
            w1d r13 = r0.m     // Catch:{ all -> 0x019e }
            r1.S0 = r13     // Catch:{ all -> 0x019e }
            r1.D0 = r9     // Catch:{ all -> 0x019e }
            r1.F0 = r11     // Catch:{ all -> 0x019e }
            if (r32 != 0) goto L_0x00b9
            r13 = r1
            goto L_0x00bb
        L_0x00b9:
            r13 = r32
        L_0x00bb:
            r1.Z = r13     // Catch:{ all -> 0x019e }
            z23 r13 = new z23     // Catch:{ all -> 0x019e }
            g75 r14 = new g75     // Catch:{ all -> 0x019e }
            r14.<init>(r1)     // Catch:{ all -> 0x019e }
            r13.<init>(r9, r11, r14)     // Catch:{ all -> 0x019e }
            r1.x0 = r13     // Catch:{ all -> 0x019e }
            java.util.concurrent.CopyOnWriteArraySet r9 = new java.util.concurrent.CopyOnWriteArraySet     // Catch:{ all -> 0x019e }
            r9.<init>()     // Catch:{ all -> 0x019e }
            r1.y0 = r9     // Catch:{ all -> 0x019e }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x019e }
            r9.<init>()     // Catch:{ all -> 0x019e }
            r1.A0 = r9     // Catch:{ all -> 0x019e }
            cod r9 = new cod     // Catch:{ all -> 0x019e }
            r9.<init>()     // Catch:{ all -> 0x019e }
            r1.T0 = r9     // Catch:{ all -> 0x019e }
            l0f r9 = new l0f     // Catch:{ all -> 0x019e }
            int r11 = r10.length     // Catch:{ all -> 0x019e }
            kgc[] r11 = new defpackage.kgc[r11]     // Catch:{ all -> 0x019e }
            int r10 = r10.length     // Catch:{ all -> 0x019e }
            m85[] r10 = new defpackage.m85[r10]     // Catch:{ all -> 0x019e }
            r0f r13 = defpackage.r0f.b     // Catch:{ all -> 0x019e }
            r14 = 0
            r9.<init>((defpackage.kgc[]) r11, (defpackage.m85[]) r10, (defpackage.r0f) r13, (defpackage.ez7) r14)     // Catch:{ all -> 0x019e }
            r1.c = r9     // Catch:{ all -> 0x019e }
            gue r9 = new gue     // Catch:{ all -> 0x019e }
            r9.<init>()     // Catch:{ all -> 0x019e }
            r1.z0 = r9     // Catch:{ all -> 0x019e }
            android.util.SparseBooleanArray r9 = new android.util.SparseBooleanArray     // Catch:{ all -> 0x019e }
            r9.<init>()     // Catch:{ all -> 0x019e }
            int[] r10 = new int[r4]     // Catch:{ all -> 0x019e }
            r10 = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28} // fill-array     // Catch:{ all -> 0x019e }
            r11 = r6
        L_0x0100:
            if (r11 >= r4) goto L_0x010e
            r13 = r10[r11]     // Catch:{ all -> 0x019e }
            r15 = r6 ^ 1
            defpackage.np8.f(r15)     // Catch:{ all -> 0x019e }
            r9.append(r13, r5)     // Catch:{ all -> 0x019e }
            int r11 = r11 + r5
            goto L_0x0100
        L_0x010e:
            gz7 r4 = r1.t0     // Catch:{ all -> 0x019e }
            r4.getClass()     // Catch:{ all -> 0x019e }
            r4 = r6 ^ 1
            defpackage.np8.f(r4)     // Catch:{ all -> 0x019e }
            r4 = 29
            r9.append(r4, r5)     // Catch:{ all -> 0x019e }
            j3b r10 = new j3b     // Catch:{ all -> 0x019e }
            r11 = r6 ^ 1
            defpackage.np8.f(r11)     // Catch:{ all -> 0x019e }
            sm5 r11 = new sm5     // Catch:{ all -> 0x019e }
            r11.<init>(r9)     // Catch:{ all -> 0x019e }
            r10.<init>(r11)     // Catch:{ all -> 0x019e }
            r1.o = r10     // Catch:{ all -> 0x019e }
            android.util.SparseBooleanArray r9 = new android.util.SparseBooleanArray     // Catch:{ all -> 0x019e }
            r9.<init>()     // Catch:{ all -> 0x019e }
            r10 = r6
        L_0x0134:
            android.util.SparseBooleanArray r13 = r11.a     // Catch:{ all -> 0x019e }
            int r13 = r13.size()     // Catch:{ all -> 0x019e }
            if (r10 >= r13) goto L_0x014a
            int r13 = r11.a(r10)     // Catch:{ all -> 0x019e }
            r15 = r6 ^ 1
            defpackage.np8.f(r15)     // Catch:{ all -> 0x019e }
            r9.append(r13, r5)     // Catch:{ all -> 0x019e }
            int r10 = r10 + r5
            goto L_0x0134
        L_0x014a:
            r10 = r6 ^ 1
            defpackage.np8.f(r10)     // Catch:{ all -> 0x019e }
            r10 = 4
            r9.append(r10, r5)     // Catch:{ all -> 0x019e }
            r11 = r6 ^ 1
            defpackage.np8.f(r11)     // Catch:{ all -> 0x019e }
            r11 = 10
            r9.append(r11, r5)     // Catch:{ all -> 0x019e }
            j3b r13 = new j3b     // Catch:{ all -> 0x019e }
            r15 = r6 ^ 1
            defpackage.np8.f(r15)     // Catch:{ all -> 0x019e }
            sm5 r15 = new sm5     // Catch:{ all -> 0x019e }
            r15.<init>(r9)     // Catch:{ all -> 0x019e }
            r13.<init>(r15)     // Catch:{ all -> 0x019e }
            r1.U0 = r13     // Catch:{ all -> 0x019e }
            rhe r9 = r1.F0     // Catch:{ all -> 0x019e }
            android.os.Looper r13 = r1.D0     // Catch:{ all -> 0x019e }
            aie r9 = r9.a(r13, r14)     // Catch:{ all -> 0x019e }
            r1.u0 = r9     // Catch:{ all -> 0x019e }
            g75 r9 = new g75     // Catch:{ all -> 0x019e }
            r9.<init>(r1)     // Catch:{ all -> 0x019e }
            r1.v0 = r9     // Catch:{ all -> 0x019e }
            l0f r13 = r1.c     // Catch:{ all -> 0x019e }
            z2b r13 = defpackage.z2b.h(r13)     // Catch:{ all -> 0x019e }
            r1.k1 = r13     // Catch:{ all -> 0x019e }
            h74 r13 = r1.C0     // Catch:{ all -> 0x019e }
            u2 r15 = r1.Z     // Catch:{ all -> 0x019e }
            android.os.Looper r10 = r1.D0     // Catch:{ all -> 0x019e }
            r13.R(r15, r10)     // Catch:{ all -> 0x019e }
            int r10 = defpackage.maf.a     // Catch:{ all -> 0x019e }
            r13 = 31
            if (r10 >= r13) goto L_0x01a1
            i4b r13 = new i4b     // Catch:{ all -> 0x019e }
            r13.<init>()     // Catch:{ all -> 0x019e }
        L_0x019b:
            r29 = r13
            goto L_0x01a6
        L_0x019e:
            r0 = move-exception
            goto L_0x0350
        L_0x01a1:
            i4b r13 = defpackage.l75.a()     // Catch:{ all -> 0x019e }
            goto L_0x019b
        L_0x01a6:
            f85 r13 = new f85     // Catch:{ all -> 0x019e }
            uj0[] r15 = r1.s0     // Catch:{ all -> 0x019e }
            gz7 r2 = r1.t0     // Catch:{ all -> 0x019e }
            l0f r7 = r1.c     // Catch:{ all -> 0x019e }
            jde r11 = r0.f     // Catch:{ all -> 0x019e }
            java.lang.Object r11 = r11.get()     // Catch:{ all -> 0x019e }
            r19 = r11
            ec4 r19 = (defpackage.ec4) r19     // Catch:{ all -> 0x019e }
            gg0 r11 = r1.E0     // Catch:{ all -> 0x019e }
            int r4 = r1.N0     // Catch:{ all -> 0x019e }
            h74 r5 = r1.C0     // Catch:{ all -> 0x019e }
            w1d r14 = r1.S0     // Catch:{ all -> 0x019e }
            cc4 r0 = r0.n     // Catch:{ all -> 0x019e }
            android.os.Looper r3 = r1.D0     // Catch:{ all -> 0x019e }
            rhe r6 = r1.F0     // Catch:{ all -> 0x019e }
            r25 = 0
            r16 = r15
            r15 = r13
            r17 = r2
            r18 = r7
            r20 = r11
            r21 = r4
            r22 = r5
            r23 = r14
            r24 = r0
            r26 = r3
            r27 = r6
            r28 = r9
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x019e }
            r1.w0 = r13     // Catch:{ all -> 0x019e }
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.e1 = r0     // Catch:{ all -> 0x019e }
            r0 = 0
            r1.N0 = r0     // Catch:{ all -> 0x019e }
            fd8 r0 = defpackage.fd8.S0     // Catch:{ all -> 0x019e }
            r1.V0 = r0     // Catch:{ all -> 0x019e }
            r1.j1 = r0     // Catch:{ all -> 0x019e }
            r0 = -1
            r1.l1 = r0     // Catch:{ all -> 0x019e }
            r2 = 21
            if (r10 >= r2) goto L_0x022c
            android.media.AudioTrack r0 = r1.W0     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x020a
            int r0 = r0.getAudioSessionId()     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x020a
            android.media.AudioTrack r0 = r1.W0     // Catch:{ all -> 0x019e }
            r0.release()     // Catch:{ all -> 0x019e }
            r0 = 0
            r1.W0 = r0     // Catch:{ all -> 0x019e }
        L_0x020a:
            android.media.AudioTrack r0 = r1.W0     // Catch:{ all -> 0x019e }
            if (r0 != 0) goto L_0x0223
            android.media.AudioTrack r0 = new android.media.AudioTrack     // Catch:{ all -> 0x019e }
            r15 = 4000(0xfa0, float:5.605E-42)
            r16 = 4
            r17 = 2
            r18 = 2
            r20 = 0
            r14 = 3
            r19 = 0
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x019e }
            r1.W0 = r0     // Catch:{ all -> 0x019e }
        L_0x0223:
            android.media.AudioTrack r0 = r1.W0     // Catch:{ all -> 0x019e }
            int r0 = r0.getAudioSessionId()     // Catch:{ all -> 0x019e }
            r1.c1 = r0     // Catch:{ all -> 0x019e }
            goto L_0x023f
        L_0x022c:
            android.content.Context r2 = r1.Y     // Catch:{ all -> 0x019e }
            java.lang.String r3 = "audio"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch:{ all -> 0x019e }
            android.media.AudioManager r2 = (android.media.AudioManager) r2     // Catch:{ all -> 0x019e }
            if (r2 != 0) goto L_0x0239
            goto L_0x023d
        L_0x0239:
            int r0 = r2.generateAudioSessionId()     // Catch:{ all -> 0x019e }
        L_0x023d:
            r1.c1 = r0     // Catch:{ all -> 0x019e }
        L_0x023f:
            ffc r0 = defpackage.ffc.X     // Catch:{ all -> 0x019e }
            r0 = 1
            r1.g1 = r0     // Catch:{ all -> 0x019e }
            h74 r0 = r1.C0     // Catch:{ all -> 0x019e }
            r0.getClass()     // Catch:{ all -> 0x019e }
            z23 r2 = r1.x0     // Catch:{ all -> 0x019e }
            r2.getClass()     // Catch:{ all -> 0x019e }
            nm7 r3 = new nm7     // Catch:{ all -> 0x019e }
            r3.<init>(r0)     // Catch:{ all -> 0x019e }
            java.lang.Object r0 = r2.d     // Catch:{ all -> 0x019e }
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0     // Catch:{ all -> 0x019e }
            r0.add(r3)     // Catch:{ all -> 0x019e }
            gg0 r0 = r1.E0     // Catch:{ all -> 0x019e }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x019e }
            android.os.Looper r3 = r1.D0     // Catch:{ all -> 0x019e }
            r2.<init>(r3)     // Catch:{ all -> 0x019e }
            h74 r3 = r1.C0     // Catch:{ all -> 0x019e }
            h84 r0 = (defpackage.h84) r0     // Catch:{ all -> 0x019e }
            r0.b(r3, r2)     // Catch:{ all -> 0x019e }
            n75 r0 = r1.G0     // Catch:{ all -> 0x019e }
            java.util.concurrent.CopyOnWriteArraySet r2 = r1.y0     // Catch:{ all -> 0x019e }
            r2.add(r0)     // Catch:{ all -> 0x019e }
            td r0 = new td     // Catch:{ all -> 0x019e }
            n75 r2 = r1.G0     // Catch:{ all -> 0x019e }
            r0.<init>((android.content.Context) r8, (android.os.Handler) r12, (defpackage.n75) r2)     // Catch:{ all -> 0x019e }
            java.lang.Object r2 = r0.o     // Catch:{ all -> 0x019e }
            k30 r2 = (defpackage.k30) r2     // Catch:{ all -> 0x019e }
            java.lang.Object r3 = r0.c     // Catch:{ all -> 0x019e }
            android.content.Context r3 = (android.content.Context) r3     // Catch:{ all -> 0x019e }
            boolean r4 = r0.b     // Catch:{ all -> 0x019e }
            if (r4 == 0) goto L_0x028a
            r3.unregisterReceiver(r2)     // Catch:{ all -> 0x019e }
            r2 = 0
            r0.b = r2     // Catch:{ all -> 0x019e }
        L_0x028a:
            n40 r0 = new n40     // Catch:{ all -> 0x019e }
            n75 r2 = r1.G0     // Catch:{ all -> 0x019e }
            r0.<init>((android.content.Context) r8, (android.os.Handler) r12, (defpackage.n75) r2)     // Catch:{ all -> 0x019e }
            r1.I0 = r0     // Catch:{ all -> 0x019e }
            java.lang.Object r2 = r0.i     // Catch:{ all -> 0x019e }
            g30 r2 = (defpackage.g30) r2     // Catch:{ all -> 0x019e }
            r3 = 0
            boolean r2 = defpackage.maf.a(r2, r3)     // Catch:{ all -> 0x019e }
            if (r2 != 0) goto L_0x02a3
            r0.i = r3     // Catch:{ all -> 0x019e }
            r2 = 0
            r0.d = r2     // Catch:{ all -> 0x019e }
        L_0x02a3:
            f9e r0 = new f9e     // Catch:{ all -> 0x019e }
            n75 r2 = r1.G0     // Catch:{ all -> 0x019e }
            r0.<init>(r8, r12, r2)     // Catch:{ all -> 0x019e }
            r1.J0 = r0     // Catch:{ all -> 0x019e }
            g30 r2 = r1.d1     // Catch:{ all -> 0x019e }
            int r2 = r2.c     // Catch:{ all -> 0x019e }
            int r2 = defpackage.maf.x(r2)     // Catch:{ all -> 0x019e }
            int r3 = r0.d     // Catch:{ all -> 0x019e }
            if (r3 != r2) goto L_0x02b9
            goto L_0x02e0
        L_0x02b9:
            r0.d = r2     // Catch:{ all -> 0x019e }
            r0.b()     // Catch:{ all -> 0x019e }
            n75 r2 = r0.b     // Catch:{ all -> 0x019e }
            t75 r2 = r2.a     // Catch:{ all -> 0x019e }
            f9e r3 = r2.J0     // Catch:{ all -> 0x019e }
            si4 r3 = a2(r3)     // Catch:{ all -> 0x019e }
            si4 r4 = r2.i1     // Catch:{ all -> 0x019e }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x019e }
            if (r4 != 0) goto L_0x02e0
            r2.i1 = r3     // Catch:{ all -> 0x019e }
            q64 r4 = new q64     // Catch:{ all -> 0x019e }
            r5 = 21
            r4.<init>((int) r5, (java.lang.Object) r3)     // Catch:{ all -> 0x019e }
            z23 r2 = r2.x0     // Catch:{ all -> 0x019e }
            r3 = 29
            r2.i(r3, r4)     // Catch:{ all -> 0x019e }
        L_0x02e0:
            huc r2 = new huc     // Catch:{ all -> 0x019e }
            r2.<init>()     // Catch:{ all -> 0x019e }
            android.content.Context r3 = r8.getApplicationContext()     // Catch:{ all -> 0x019e }
            java.lang.String r4 = "power"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ all -> 0x019e }
            android.os.PowerManager r3 = (android.os.PowerManager) r3     // Catch:{ all -> 0x019e }
            r1.K0 = r2     // Catch:{ all -> 0x019e }
            o84 r2 = new o84     // Catch:{ all -> 0x019e }
            r2.<init>((android.content.Context) r8)     // Catch:{ all -> 0x019e }
            r1.L0 = r2     // Catch:{ all -> 0x019e }
            si4 r0 = a2(r0)     // Catch:{ all -> 0x019e }
            r1.i1 = r0     // Catch:{ all -> 0x019e }
            int r0 = r1.c1     // Catch:{ all -> 0x019e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x019e }
            r2 = 10
            r3 = 1
            r1.k2(r3, r2, r0)     // Catch:{ all -> 0x019e }
            int r0 = r1.c1     // Catch:{ all -> 0x019e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x019e }
            r4 = 2
            r1.k2(r4, r2, r0)     // Catch:{ all -> 0x019e }
            g30 r0 = r1.d1     // Catch:{ all -> 0x019e }
            r2 = 3
            r1.k2(r3, r2, r0)     // Catch:{ all -> 0x019e }
            int r0 = r1.Z0     // Catch:{ all -> 0x019e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x019e }
            r2 = 4
            r1.k2(r4, r2, r0)     // Catch:{ all -> 0x019e }
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x019e }
            r2 = 5
            r1.k2(r4, r2, r0)     // Catch:{ all -> 0x019e }
            boolean r0 = r1.f1     // Catch:{ all -> 0x019e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x019e }
            r2 = 9
            r3 = 1
            r1.k2(r3, r2, r0)     // Catch:{ all -> 0x019e }
            p75 r0 = r1.H0     // Catch:{ all -> 0x019e }
            r2 = 7
            r3 = 2
            r1.k2(r3, r2, r0)     // Catch:{ all -> 0x019e }
            p75 r0 = r1.H0     // Catch:{ all -> 0x019e }
            r2 = 6
            r3 = 8
            r1.k2(r2, r3, r0)     // Catch:{ all -> 0x019e }
            ae3 r0 = r1.X
            r0.g()
            return
        L_0x0350:
            ae3 r1 = r1.X
            r1.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t75.<init>(w65, u2):void");
    }

    public static si4 a2(f9e f9e) {
        f9e.getClass();
        int i = maf.a;
        AudioManager audioManager = f9e.c;
        return new si4(0, i >= 28 ? audioManager.getStreamMinVolume(f9e.d) : 0, audioManager.getStreamMaxVolume(f9e.d));
    }

    public static long e2(z2b z2b) {
        jue jue = new jue();
        gue gue = new gue();
        z2b.a.h(z2b.b.a, gue);
        long j = z2b.c;
        if (j != -9223372036854775807L) {
            return gue.X + j;
        }
        return z2b.a.n(gue.c, jue, 0).x0;
    }

    public static boolean f2(z2b z2b) {
        return z2b.e == 3 && z2b.l && z2b.m == 0;
    }

    public final int B() {
        s2();
        if (this.k1.a.q()) {
            return 0;
        }
        z2b z2b = this.k1;
        return z2b.a.b(z2b.b.a);
    }

    public final int O() {
        s2();
        if (n()) {
            return this.k1.b.c;
        }
        return -1;
    }

    public final lue O1() {
        s2();
        return this.k1.a;
    }

    public final void Q1() {
        s2();
    }

    public final fd8 Z1() {
        lue O1 = O1();
        if (O1.q()) {
            return this.j1;
        }
        rb8 rb8 = O1.n(p0(), (jue) this.b, 0).c;
        dd8 a = this.j1.a();
        fd8 fd8 = rb8.o;
        if (fd8 != null) {
            CharSequence charSequence = fd8.a;
            if (charSequence != null) {
                a.a = charSequence;
            }
            CharSequence charSequence2 = fd8.b;
            if (charSequence2 != null) {
                a.b = charSequence2;
            }
            CharSequence charSequence3 = fd8.c;
            if (charSequence3 != null) {
                a.c = charSequence3;
            }
            CharSequence charSequence4 = fd8.o;
            if (charSequence4 != null) {
                a.d = charSequence4;
            }
            CharSequence charSequence5 = fd8.X;
            if (charSequence5 != null) {
                a.e = charSequence5;
            }
            CharSequence charSequence6 = fd8.Y;
            if (charSequence6 != null) {
                a.f = charSequence6;
            }
            CharSequence charSequence7 = fd8.Z;
            if (charSequence7 != null) {
                a.g = charSequence7;
            }
            Uri uri = fd8.s0;
            if (uri != null) {
                a.h = uri;
            }
            d5c d5c = fd8.t0;
            if (d5c != null) {
                a.i = d5c;
            }
            d5c d5c2 = fd8.u0;
            if (d5c2 != null) {
                a.j = d5c2;
            }
            byte[] bArr = fd8.v0;
            if (bArr != null) {
                a.k = (byte[]) bArr.clone();
                a.l = fd8.w0;
            }
            Uri uri2 = fd8.x0;
            if (uri2 != null) {
                a.m = uri2;
            }
            Integer num = fd8.y0;
            if (num != null) {
                a.n = num;
            }
            Integer num2 = fd8.z0;
            if (num2 != null) {
                a.o = num2;
            }
            Integer num3 = fd8.A0;
            if (num3 != null) {
                a.p = num3;
            }
            Boolean bool = fd8.B0;
            if (bool != null) {
                a.q = bool;
            }
            Integer num4 = fd8.C0;
            if (num4 != null) {
                a.r = num4;
            }
            Integer num5 = fd8.D0;
            if (num5 != null) {
                a.r = num5;
            }
            Integer num6 = fd8.E0;
            if (num6 != null) {
                a.s = num6;
            }
            Integer num7 = fd8.F0;
            if (num7 != null) {
                a.t = num7;
            }
            Integer num8 = fd8.G0;
            if (num8 != null) {
                a.u = num8;
            }
            Integer num9 = fd8.H0;
            if (num9 != null) {
                a.v = num9;
            }
            Integer num10 = fd8.I0;
            if (num10 != null) {
                a.w = num10;
            }
            CharSequence charSequence8 = fd8.J0;
            if (charSequence8 != null) {
                a.x = charSequence8;
            }
            CharSequence charSequence9 = fd8.K0;
            if (charSequence9 != null) {
                a.y = charSequence9;
            }
            CharSequence charSequence10 = fd8.L0;
            if (charSequence10 != null) {
                a.z = charSequence10;
            }
            Integer num11 = fd8.M0;
            if (num11 != null) {
                a.A = num11;
            }
            Integer num12 = fd8.N0;
            if (num12 != null) {
                a.B = num12;
            }
            CharSequence charSequence11 = fd8.O0;
            if (charSequence11 != null) {
                a.C = charSequence11;
            }
            CharSequence charSequence12 = fd8.P0;
            if (charSequence12 != null) {
                a.D = charSequence12;
            }
            CharSequence charSequence13 = fd8.Q0;
            if (charSequence13 != null) {
                a.E = charSequence13;
            }
            Bundle bundle = fd8.R0;
            if (bundle != null) {
                a.F = bundle;
            }
        }
        return new fd8(a);
    }

    public final long b0() {
        s2();
        if (!n()) {
            return k();
        }
        z2b z2b = this.k1;
        lue lue = z2b.a;
        Object obj = z2b.b.a;
        gue gue = this.z0;
        lue.h(obj, gue);
        z2b z2b2 = this.k1;
        return z2b2.c == -9223372036854775807L ? maf.M(z2b2.a.n(p0(), (jue) this.b, 0).x0) : maf.M(gue.X) + maf.M(this.k1.c);
    }

    public final r4b b2(p4b p4b) {
        int d2 = d2();
        lue lue = this.k1.a;
        if (d2 == -1) {
            d2 = 0;
        }
        f85 f85 = this.w0;
        return new r4b(f85, p4b, lue, d2, this.F0, f85.u0);
    }

    public final long c() {
        s2();
        if (n()) {
            z2b z2b = this.k1;
            xj8 xj8 = z2b.b;
            lue lue = z2b.a;
            Object obj = xj8.a;
            gue gue = this.z0;
            lue.h(obj, gue);
            return maf.M(gue.a(xj8.b, xj8.c));
        }
        lue O1 = O1();
        if (O1.q()) {
            return -9223372036854775807L;
        }
        return maf.M(O1.n(p0(), (jue) this.b, 0).y0);
    }

    public final long c2(z2b z2b) {
        if (z2b.a.q()) {
            return maf.D(this.m1);
        }
        if (z2b.b.a()) {
            return z2b.s;
        }
        lue lue = z2b.a;
        xj8 xj8 = z2b.b;
        long j = z2b.s;
        Object obj = xj8.a;
        gue gue = this.z0;
        lue.h(obj, gue);
        return j + gue.X;
    }

    public final int d2() {
        if (this.k1.a.q()) {
            return this.l1;
        }
        z2b z2b = this.k1;
        return z2b.a.h(z2b.b.a, this.z0).c;
    }

    public final z2b g2(z2b z2b, lue lue, Pair pair) {
        List list;
        int i;
        lue lue2 = lue;
        Pair pair2 = pair;
        np8.d(lue.q() || pair2 != null);
        lue lue3 = z2b.a;
        z2b g = z2b.g(lue);
        if (lue.q()) {
            xj8 xj8 = z2b.t;
            long D = maf.D(this.m1);
            z2b a = g.b(xj8, D, D, D, 0, sze.o, this.c, ffc.X).a(xj8);
            a.q = a.s;
            return a;
        }
        Object obj = g.b.a;
        int i2 = maf.a;
        boolean z = !obj.equals(pair2.first);
        xj8 xj82 = z ? new xj8(pair2.first) : g.b;
        long longValue = ((Long) pair2.second).longValue();
        long D2 = maf.D(b0());
        if (!lue3.q()) {
            D2 -= lue3.h(obj, this.z0).X;
        }
        if (z || longValue < D2) {
            xj8 xj83 = xj82;
            np8.f(!xj83.a());
            sze sze = z ? sze.o : g.h;
            l0f l0f = z ? this.c : g.i;
            if (z) {
                ls5 ls5 = zw6.b;
                list = ffc.X;
            } else {
                list = g.j;
            }
            z2b a2 = g.b(xj83, longValue, longValue, longValue, 0, sze, l0f, list).a(xj83);
            a2.q = longValue;
            return a2;
        } else if (i == 0) {
            int b = lue2.b(g.k.a);
            if (b != -1 && lue2.g(b, this.z0, false).c == lue2.h(xj82.a, this.z0).c) {
                return g;
            }
            lue2.h(xj82.a, this.z0);
            long a3 = xj82.a() ? this.z0.a(xj82.b, xj82.c) : this.z0.o;
            z2b a4 = g.b(xj82, g.s, g.s, g.d, a3 - g.s, g.h, g.i, g.j).a(xj82);
            a4.q = a3;
            return a4;
        } else {
            xj8 xj84 = xj82;
            np8.f(!xj84.a());
            long max = Math.max(0, g.r - (longValue - D2));
            long j = g.q;
            if (g.k.equals(g.b)) {
                j = longValue + max;
            }
            z2b b2 = g.b(xj84, longValue, longValue, longValue, max, g.h, g.i, g.j);
            b2.q = j;
            return b2;
        }
    }

    public final int getRepeatMode() {
        s2();
        return this.N0;
    }

    public final Pair h2(lue lue, int i, long j) {
        if (lue.q()) {
            this.l1 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.m1 = j;
            return null;
        }
        if (i == -1 || i >= lue.p()) {
            i = lue.a(false);
            j = maf.M(lue.n(i, (jue) this.b, 0).x0);
        }
        return lue.j((jue) this.b, this.z0, i, maf.D(j));
    }

    public final void i2(int i, int i2) {
        if (i != this.a1 || i2 != this.b1) {
            this.a1 = i;
            this.b1 = i2;
            this.x0.i(24, new h75(i, i2, 1));
        }
    }

    public final void j2(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.A0.remove(i2);
        }
        cod cod = this.T0;
        int[] iArr = cod.b;
        int[] iArr2 = new int[(iArr.length - i)];
        int i3 = 0;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 < 0 || i5 >= i) {
                int i6 = i4 - i3;
                if (i5 >= 0) {
                    i5 -= i;
                }
                iArr2[i6] = i5;
            } else {
                i3++;
            }
        }
        this.T0 = new cod(iArr2, new Random(cod.a.nextLong()));
    }

    public final long k() {
        s2();
        return maf.M(c2(this.k1));
    }

    public final void k2(int i, int i2, Object obj) {
        for (uj0 uj0 : this.s0) {
            if (uj0.a == i) {
                r4b b2 = b2(uj0);
                np8.f(!b2.g);
                b2.d = i2;
                np8.f(!b2.g);
                b2.e = obj;
                b2.c();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l2(java.util.List r15, int r16, long r17, boolean r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r16
            int r2 = r14.d2()
            long r3 = r14.k()
            int r5 = r0.O0
            r6 = 1
            int r5 = r5 + r6
            r0.O0 = r5
            java.util.ArrayList r5 = r0.A0
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L_0x0020
            int r7 = r5.size()
            r14.j2(r7)
        L_0x0020:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r7 = 0
            r8 = r7
        L_0x0027:
            int r10 = r15.size()
            if (r8 >= r10) goto L_0x004f
            sk8 r10 = new sk8
            r11 = r15
            java.lang.Object r12 = r15.get(r8)
            dj0 r12 = (defpackage.dj0) r12
            boolean r13 = r0.B0
            r10.<init>(r12, r13)
            r9.add(r10)
            r75 r12 = new r75
            java.lang.Object r13 = r10.b
            p08 r10 = r10.a
            l08 r10 = r10.o
            r12.<init>(r13, r10)
            r5.add(r8, r12)
            int r8 = r8 + 1
            goto L_0x0027
        L_0x004f:
            cod r8 = r0.T0
            int r10 = r9.size()
            cod r8 = r8.a(r10)
            r0.T0 = r8
            a5b r10 = new a5b
            r10.<init>(r5, r8)
            boolean r5 = r10.q()
            int r8 = r10.o
            if (r5 != 0) goto L_0x0071
            if (r1 >= r8) goto L_0x006b
            goto L_0x0071
        L_0x006b:
            com.google.android.exoplayer2.IllegalSeekPositionException r0 = new com.google.android.exoplayer2.IllegalSeekPositionException
            r0.<init>()
            throw r0
        L_0x0071:
            r5 = -1
            if (r19 == 0) goto L_0x007f
            int r1 = r10.a(r7)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x007d:
            r11 = r1
            goto L_0x0087
        L_0x007f:
            if (r1 != r5) goto L_0x0084
            r11 = r2
            r2 = r3
            goto L_0x0087
        L_0x0084:
            r2 = r17
            goto L_0x007d
        L_0x0087:
            z2b r1 = r0.k1
            android.util.Pair r4 = r14.h2(r10, r11, r2)
            z2b r1 = r14.g2(r1, r10, r4)
            int r4 = r1.e
            if (r11 == r5) goto L_0x00a3
            if (r4 == r6) goto L_0x00a3
            boolean r4 = r10.q()
            if (r4 != 0) goto L_0x00a2
            if (r11 < r8) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r4 = 2
            goto L_0x00a3
        L_0x00a2:
            r4 = 4
        L_0x00a3:
            z2b r1 = r1.f(r4)
            long r12 = defpackage.maf.D(r2)
            cod r10 = r0.T0
            f85 r2 = r0.w0
            aie r2 = r2.s0
            x75 r3 = new x75
            r8 = r3
            r8.<init>(r9, r10, r11, r12)
            r4 = 17
            yhe r2 = r2.a(r4, r3)
            r2.b()
            z2b r2 = r0.k1
            xj8 r2 = r2.b
            java.lang.Object r2 = r2.a
            xj8 r3 = r1.b
            java.lang.Object r3 = r3.a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00dc
            z2b r2 = r0.k1
            lue r2 = r2.a
            boolean r2 = r2.q()
            if (r2 != 0) goto L_0x00dc
            r5 = r6
            goto L_0x00dd
        L_0x00dc:
            r5 = r7
        L_0x00dd:
            long r7 = r14.c2(r1)
            r4 = 0
            r6 = 4
            r2 = 0
            r3 = 1
            r9 = -1
            r0 = r14
            r0.q2(r1, r2, r3, r4, r5, r6, r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t75.l2(java.util.List, int, long, boolean):void");
    }

    public final void m2(Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (uj0 uj0 : this.s0) {
            if (uj0.a == 2) {
                r4b b2 = b2(uj0);
                np8.f(!b2.g);
                b2.d = 1;
                np8.f(true ^ b2.g);
                b2.e = surface;
                b2.c();
                arrayList.add(b2);
            }
        }
        Object obj = this.X0;
        if (!(obj == null || obj == surface)) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((r4b) it.next()).a(this.M0);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj2 = this.X0;
            Surface surface2 = this.Y0;
            if (obj2 == surface2) {
                surface2.release();
                this.Y0 = null;
            }
        }
        this.X0 = surface;
        if (z) {
            n2(new ExoPlaybackException(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    public final boolean n() {
        s2();
        return this.k1.b.a();
    }

    public final void n2(ExoPlaybackException exoPlaybackException) {
        z2b z2b = this.k1;
        z2b a = z2b.a(z2b.b);
        a.q = a.s;
        a.r = 0;
        boolean z = true;
        z2b f = a.f(1);
        if (exoPlaybackException != null) {
            f = f.e(exoPlaybackException);
        }
        z2b z2b2 = f;
        this.O0++;
        aie aie = this.w0.s0;
        aie.getClass();
        yhe b = aie.b();
        b.a = aie.a.obtainMessage(6);
        b.b();
        if (!z2b2.a.q() || this.k1.a.q()) {
            z = false;
        }
        q2(z2b2, 0, 1, false, z, 4, c2(z2b2), -1);
    }

    public final int o0() {
        s2();
        if (n()) {
            return this.k1.b.b;
        }
        return -1;
    }

    public final void o2() {
        int i;
        int i2;
        boolean z = true;
        j3b j3b = this.U0;
        int i3 = maf.a;
        u2 u2Var = this.Z;
        boolean n = u2Var.n();
        lue O1 = u2Var.O1();
        boolean q = O1.q();
        jue jue = (jue) u2Var.b;
        boolean z2 = !q && O1.n(u2Var.p0(), jue, 0).s0;
        lue O12 = u2Var.O1();
        if (O12.q()) {
            i = -1;
        } else {
            int p0 = u2Var.p0();
            int repeatMode = u2Var.getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            u2Var.Q1();
            i = O12.l(p0, repeatMode, false);
        }
        boolean z3 = i != -1;
        lue O13 = u2Var.O1();
        if (O13.q()) {
            i2 = -1;
        } else {
            int p02 = u2Var.p0();
            int repeatMode2 = u2Var.getRepeatMode();
            if (repeatMode2 == 1) {
                repeatMode2 = 0;
            }
            u2Var.Q1();
            i2 = O13.e(p02, repeatMode2, false);
        }
        boolean z4 = i2 != -1;
        lue O14 = u2Var.O1();
        boolean z5 = !O14.q() && O14.n(u2Var.p0(), jue, 0).a();
        lue O15 = u2Var.O1();
        boolean z6 = !O15.q() && O15.n(u2Var.p0(), jue, 0).t0;
        boolean q2 = u2Var.O1().q();
        o9g o9g = new o9g(23);
        sm5 sm5 = this.o.a;
        rm5 rm5 = (rm5) o9g.b;
        rm5.getClass();
        for (int i4 = 0; i4 < sm5.a.size(); i4++) {
            rm5.a(sm5.a(i4));
        }
        boolean z7 = !n;
        o9g.n(4, z7);
        o9g.n(5, z2 && !n);
        o9g.n(6, z3 && !n);
        o9g.n(7, !q2 && (z3 || !z5 || z2) && !n);
        o9g.n(8, z4 && !n);
        o9g.n(9, !q2 && (z4 || (z5 && z6)) && !n);
        o9g.n(10, z7);
        o9g.n(11, z2 && !n);
        if (!z2 || n) {
            z = false;
        }
        o9g.n(12, z);
        j3b j3b2 = new j3b(rm5.d());
        this.U0 = j3b2;
        if (!j3b2.equals(j3b)) {
            this.x0.h(13, new g75(this));
        }
    }

    public final int p0() {
        s2();
        int d2 = d2();
        if (d2 == -1) {
            return 0;
        }
        return d2;
    }

    public final void p2(int i, int i2, boolean z) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        z2b z2b = this.k1;
        if (z2b.l != z2 || z2b.m != i3) {
            this.O0++;
            z2b d = z2b.d(i3, z2);
            aie aie = this.w0.s0;
            aie.getClass();
            yhe b = aie.b();
            b.a = aie.a.obtainMessage(1, z2 ? 1 : 0, i3);
            b.b();
            q2(d, 0, i2, false, false, 5, -9223372036854775807L, -1);
        }
    }

    public final long q() {
        s2();
        return maf.M(this.k1.r);
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0290  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q2(defpackage.z2b r41, int r42, int r43, boolean r44, boolean r45, int r46, long r47, int r49) {
        /*
            r40 = this;
            r0 = r40
            r1 = r41
            r2 = r46
            z2b r3 = r0.k1
            r0.k1 = r1
            lue r4 = r3.a
            lue r5 = r1.a
            boolean r4 = r4.equals(r5)
            r5 = 1
            r4 = r4 ^ r5
            lue r6 = r3.a
            lue r7 = r1.a
            boolean r8 = r7.q()
            r9 = -1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r11 = 3
            r13 = 0
            if (r8 == 0) goto L_0x0035
            boolean r8 = r6.q()
            if (r8 == 0) goto L_0x0035
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r10)
            goto L_0x00ba
        L_0x0035:
            boolean r8 = r7.q()
            boolean r12 = r6.q()
            if (r8 == r12) goto L_0x004c
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r4.<init>(r6, r7)
            goto L_0x00ba
        L_0x004c:
            xj8 r8 = r3.b
            java.lang.Object r12 = r8.a
            gue r11 = r0.z0
            gue r12 = r6.h(r12, r11)
            int r12 = r12.c
            java.lang.Object r9 = r0.b
            jue r9 = (defpackage.jue) r9
            jue r6 = r6.n(r12, r9, r13)
            java.lang.Object r6 = r6.a
            xj8 r12 = r1.b
            java.lang.Object r15 = r12.a
            gue r11 = r7.h(r15, r11)
            int r11 = r11.c
            jue r7 = r7.n(r11, r9, r13)
            java.lang.Object r7 = r7.a
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009a
            if (r45 == 0) goto L_0x007e
            if (r2 != 0) goto L_0x007e
            r4 = r5
            goto L_0x0087
        L_0x007e:
            if (r45 == 0) goto L_0x0084
            if (r2 != r5) goto L_0x0084
            r4 = 2
            goto L_0x0087
        L_0x0084:
            if (r4 == 0) goto L_0x0094
            r4 = 3
        L_0x0087:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.<init>(r7, r4)
            r4 = r6
            goto L_0x00ba
        L_0x0094:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x009a:
            if (r45 == 0) goto L_0x00b3
            if (r2 != 0) goto L_0x00b3
            long r6 = r8.d
            long r8 = r12.d
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b3
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r4.<init>(r6, r8)
            goto L_0x00ba
        L_0x00b3:
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r10)
        L_0x00ba:
            java.lang.Object r6 = r4.first
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            fd8 r7 = r0.V0
            if (r6 == 0) goto L_0x00f7
            lue r9 = r1.a
            boolean r9 = r9.q()
            if (r9 != 0) goto L_0x00f1
            lue r9 = r1.a
            xj8 r10 = r1.b
            java.lang.Object r10 = r10.a
            gue r11 = r0.z0
            gue r9 = r9.h(r10, r11)
            int r9 = r9.c
            lue r10 = r1.a
            java.lang.Object r11 = r0.b
            jue r11 = (defpackage.jue) r11
            jue r9 = r10.n(r9, r11, r13)
            rb8 r9 = r9.c
            goto L_0x00f2
        L_0x00f1:
            r9 = 0
        L_0x00f2:
            fd8 r10 = defpackage.fd8.S0
            r0.j1 = r10
            goto L_0x00f8
        L_0x00f7:
            r9 = 0
        L_0x00f8:
            if (r6 != 0) goto L_0x0104
            java.util.List r10 = r3.j
            java.util.List r11 = r1.j
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0139
        L_0x0104:
            fd8 r7 = r0.j1
            dd8 r7 = r7.a()
            java.util.List r10 = r1.j
            r11 = 0
        L_0x010d:
            int r12 = r10.size()
            if (r11 >= r12) goto L_0x012e
            java.lang.Object r12 = r10.get(r11)
            e99 r12 = (defpackage.e99) r12
            r15 = 0
        L_0x011a:
            c99[] r8 = r12.a
            int r13 = r8.length
            if (r15 >= r13) goto L_0x0129
            r8 = r8[r15]
            r8.p(r7)
            int r15 = r15 + 1
            r13 = 0
            goto L_0x011a
        L_0x0129:
            int r11 = r11 + 1
            r13 = 0
            goto L_0x010d
        L_0x012e:
            fd8 r8 = new fd8
            r8.<init>(r7)
            r0.j1 = r8
            fd8 r7 = r40.Z1()
        L_0x0139:
            fd8 r8 = r0.V0
            boolean r8 = r7.equals(r8)
            r8 = r8 ^ r5
            r0.V0 = r7
            boolean r7 = r3.l
            boolean r10 = r1.l
            if (r7 == r10) goto L_0x014a
            r7 = r5
            goto L_0x014b
        L_0x014a:
            r7 = 0
        L_0x014b:
            int r10 = r3.e
            int r11 = r1.e
            if (r10 == r11) goto L_0x0153
            r10 = r5
            goto L_0x0154
        L_0x0153:
            r10 = 0
        L_0x0154:
            if (r10 != 0) goto L_0x0158
            if (r7 == 0) goto L_0x015b
        L_0x0158:
            r40.r2()
        L_0x015b:
            boolean r11 = r3.g
            boolean r12 = r1.g
            if (r11 == r12) goto L_0x0163
            r11 = r5
            goto L_0x0164
        L_0x0163:
            r11 = 0
        L_0x0164:
            lue r12 = r3.a
            lue r13 = r1.a
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x017c
            z23 r12 = r0.x0
            e75 r13 = new e75
            r14 = 0
            r15 = r42
            r13.<init>(r1, r15, r14)
            r14 = 0
            r12.h(r14, r13)
        L_0x017c:
            if (r45 == 0) goto L_0x02b3
            gue r12 = new gue
            r12.<init>()
            lue r13 = r3.a
            boolean r13 = r13.q()
            if (r13 != 0) goto L_0x01c1
            xj8 r13 = r3.b
            java.lang.Object r13 = r13.a
            lue r14 = r3.a
            r14.h(r13, r12)
            int r14 = r12.c
            lue r15 = r3.a
            int r15 = r15.b(r13)
            lue r5 = r3.a
            r42 = r13
            java.lang.Object r13 = r0.b
            jue r13 = (defpackage.jue) r13
            r16 = r10
            r17 = r11
            r10 = 0
            jue r5 = r5.n(r14, r13, r10)
            java.lang.Object r5 = r5.a
            java.lang.Object r10 = r0.b
            jue r10 = (defpackage.jue) r10
            rb8 r10 = r10.c
            r22 = r42
            r19 = r5
            r21 = r10
            r20 = r14
            r23 = r15
            goto L_0x01cf
        L_0x01c1:
            r16 = r10
            r17 = r11
            r20 = r49
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = -1
        L_0x01cf:
            if (r2 != 0) goto L_0x01fd
            xj8 r5 = r3.b
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x01e8
            xj8 r5 = r3.b
            int r10 = r5.b
            int r5 = r5.c
            long r10 = r12.a(r10, r5)
            long r12 = e2(r3)
            goto L_0x0211
        L_0x01e8:
            xj8 r5 = r3.b
            int r5 = r5.e
            r10 = -1
            if (r5 == r10) goto L_0x01f7
            z2b r5 = r0.k1
            long r10 = e2(r5)
        L_0x01f5:
            r12 = r10
            goto L_0x0211
        L_0x01f7:
            long r10 = r12.X
            long r12 = r12.o
        L_0x01fb:
            long r10 = r10 + r12
            goto L_0x01f5
        L_0x01fd:
            xj8 r5 = r3.b
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x020c
            long r10 = r3.s
            long r12 = e2(r3)
            goto L_0x0211
        L_0x020c:
            long r10 = r12.X
            long r12 = r3.s
            goto L_0x01fb
        L_0x0211:
            o3b r5 = new o3b
            long r24 = defpackage.maf.M(r10)
            long r26 = defpackage.maf.M(r12)
            xj8 r10 = r3.b
            int r11 = r10.b
            int r10 = r10.c
            r18 = r5
            r28 = r11
            r29 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24, r26, r28, r29)
            int r10 = r40.p0()
            z2b r11 = r0.k1
            lue r11 = r11.a
            boolean r11 = r11.q()
            if (r11 != 0) goto L_0x026b
            z2b r11 = r0.k1
            xj8 r12 = r11.b
            java.lang.Object r12 = r12.a
            lue r11 = r11.a
            gue r13 = r0.z0
            r11.h(r12, r13)
            z2b r11 = r0.k1
            lue r11 = r11.a
            int r11 = r11.b(r12)
            z2b r13 = r0.k1
            lue r13 = r13.a
            java.lang.Object r14 = r0.b
            jue r14 = (defpackage.jue) r14
            r42 = r11
            r15 = r12
            r11 = 0
            jue r11 = r13.n(r10, r14, r11)
            java.lang.Object r11 = r11.a
            rb8 r12 = r14.c
            r33 = r42
            r29 = r11
            r31 = r12
            r32 = r15
            goto L_0x0273
        L_0x026b:
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = -1
        L_0x0273:
            long r34 = defpackage.maf.M(r47)
            o3b r11 = new o3b
            z2b r12 = r0.k1
            xj8 r12 = r12.b
            boolean r12 = r12.a()
            if (r12 == 0) goto L_0x0290
            z2b r12 = r0.k1
            long r12 = e2(r12)
            long r12 = defpackage.maf.M(r12)
            r36 = r12
            goto L_0x0292
        L_0x0290:
            r36 = r34
        L_0x0292:
            z2b r12 = r0.k1
            xj8 r12 = r12.b
            int r13 = r12.b
            int r12 = r12.c
            r28 = r11
            r30 = r10
            r38 = r13
            r39 = r12
            r28.<init>(r29, r30, r31, r32, r33, r34, r36, r38, r39)
            z23 r10 = r0.x0
            ui0 r12 = new ui0
            r13 = 5
            r12.<init>((int) r2, (java.lang.Object) r5, (java.lang.Object) r11, (int) r13)
            r2 = 11
            r10.h(r2, r12)
            goto L_0x02b7
        L_0x02b3:
            r16 = r10
            r17 = r11
        L_0x02b7:
            if (r6 == 0) goto L_0x02c5
            z23 r2 = r0.x0
            hd0 r5 = new hd0
            r6 = 5
            r5.<init>(r4, r6, r9)
            r4 = 1
            r2.h(r4, r5)
        L_0x02c5:
            com.google.android.exoplayer2.ExoPlaybackException r2 = r3.f
            com.google.android.exoplayer2.ExoPlaybackException r4 = r1.f
            if (r2 == r4) goto L_0x02e7
            z23 r2 = r0.x0
            c75 r4 = new c75
            r5 = 0
            r4.<init>(r1, r5)
            r5 = 10
            r2.h(r5, r4)
            com.google.android.exoplayer2.ExoPlaybackException r2 = r1.f
            if (r2 == 0) goto L_0x02e7
            z23 r2 = r0.x0
            c75 r4 = new c75
            r6 = 1
            r4.<init>(r1, r6)
            r2.h(r5, r4)
        L_0x02e7:
            l0f r2 = r3.i
            l0f r4 = r1.i
            if (r2 == r4) goto L_0x031b
            gz7 r2 = r0.t0
            java.lang.Object r4 = r4.c
            r2.getClass()
            ez7 r4 = (defpackage.ez7) r4
            r2.c = r4
            b0f r2 = new b0f
            l0f r4 = r1.i
            java.lang.Object r4 = r4.X
            m85[] r4 = (defpackage.m85[]) r4
            r2.<init>(r4)
            z23 r4 = r0.x0
            d74 r5 = new d74
            r6 = 12
            r5.<init>(r1, r6, r2)
            r2 = 2
            r4.h(r2, r5)
            z23 r4 = r0.x0
            c75 r5 = new c75
            r6 = 2
            r5.<init>(r1, r6)
            r4.h(r2, r5)
        L_0x031b:
            if (r8 == 0) goto L_0x032d
            fd8 r2 = r0.V0
            z23 r4 = r0.x0
            q64 r5 = new q64
            r6 = 15
            r5.<init>((int) r6, (java.lang.Object) r2)
            r2 = 14
            r4.h(r2, r5)
        L_0x032d:
            if (r17 == 0) goto L_0x033b
            z23 r2 = r0.x0
            c75 r4 = new c75
            r5 = 3
            r4.<init>(r1, r5)
            r5 = 3
            r2.h(r5, r4)
        L_0x033b:
            if (r16 != 0) goto L_0x033f
            if (r7 == 0) goto L_0x034b
        L_0x033f:
            z23 r2 = r0.x0
            c75 r4 = new c75
            r5 = 4
            r4.<init>(r1, r5)
            r5 = -1
            r2.h(r5, r4)
        L_0x034b:
            if (r16 == 0) goto L_0x0359
            z23 r2 = r0.x0
            c75 r4 = new c75
            r5 = 5
            r4.<init>(r1, r5)
            r5 = 4
            r2.h(r5, r4)
        L_0x0359:
            if (r7 == 0) goto L_0x0369
            z23 r2 = r0.x0
            e75 r4 = new e75
            r5 = 1
            r6 = r43
            r4.<init>(r1, r6, r5)
            r5 = 5
            r2.h(r5, r4)
        L_0x0369:
            int r2 = r3.m
            int r4 = r1.m
            if (r2 == r4) goto L_0x037a
            z23 r2 = r0.x0
            c75 r4 = new c75
            r5 = 6
            r4.<init>(r1, r5)
            r2.h(r5, r4)
        L_0x037a:
            boolean r2 = f2(r3)
            boolean r4 = f2(r41)
            if (r2 == r4) goto L_0x038f
            z23 r2 = r0.x0
            c75 r4 = new c75
            r5 = 7
            r4.<init>(r1, r5)
            r2.h(r5, r4)
        L_0x038f:
            b3b r2 = r3.n
            b3b r4 = r1.n
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x03a7
            z23 r2 = r0.x0
            c75 r4 = new c75
            r5 = 8
            r4.<init>(r1, r5)
            r5 = 12
            r2.h(r5, r4)
        L_0x03a7:
            if (r44 == 0) goto L_0x03b6
            z23 r2 = r0.x0
            ta4 r4 = new ta4
            r5 = 18
            r4.<init>(r5)
            r5 = -1
            r2.h(r5, r4)
        L_0x03b6:
            r40.o2()
            z23 r2 = r0.x0
            r2.e()
            boolean r2 = r3.o
            boolean r4 = r1.o
            if (r2 == r4) goto L_0x03da
            java.util.concurrent.CopyOnWriteArraySet r2 = r0.y0
            java.util.Iterator r2 = r2.iterator()
        L_0x03ca:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x03da
            java.lang.Object r4 = r2.next()
            n75 r4 = (defpackage.n75) r4
            r4.getClass()
            goto L_0x03ca
        L_0x03da:
            boolean r2 = r3.p
            boolean r1 = r1.p
            if (r2 == r1) goto L_0x03f8
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.y0
            java.util.Iterator r0 = r0.iterator()
        L_0x03e6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x03f8
            java.lang.Object r1 = r0.next()
            n75 r1 = (defpackage.n75) r1
            t75 r1 = r1.a
            r1.r2()
            goto L_0x03e6
        L_0x03f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t75.q2(z2b, int, int, boolean, boolean, int, long, int):void");
    }

    public final void r(int i, long j) {
        s2();
        h74 h74 = this.C0;
        int i2 = 1;
        if (!h74.s0) {
            ed e = h74.e();
            h74.s0 = true;
            h74.Q(e, -1, new yv3(21));
        }
        lue lue = this.k1.a;
        if (i < 0 || (!lue.q() && i >= lue.p())) {
            throw new IllegalStateException();
        }
        this.O0++;
        if (n()) {
            a85 a85 = new a85(this.k1);
            a85.a(1);
            t75 t75 = this.v0.a;
            t75.u0.a.post(new kl4((Object) t75, 19, (Object) a85));
            return;
        }
        s2();
        if (this.k1.e != 1) {
            i2 = 2;
        }
        int p0 = p0();
        z2b g2 = g2(this.k1.f(i2), lue, h2(lue, i, j));
        this.w0.s0.a(3, new d85(lue, i, maf.D(j))).b();
        q2(g2, 0, 1, true, true, 1, c2(g2), p0);
    }

    public final void r2() {
        s2();
        int i = this.k1.e;
        o84 o84 = this.L0;
        huc huc = this.K0;
        if (i != 1) {
            if (i == 2 || i == 3) {
                s2();
                boolean z = this.k1.p;
                boolean u = u();
                huc.getClass();
                u();
                o84.getClass();
                return;
            } else if (i != 4) {
                throw new IllegalStateException();
            }
        }
        huc.getClass();
        o84.getClass();
    }

    public final void s2() {
        this.X.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.D0;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i = maf.a;
            Locale locale = Locale.US;
            String j = k7d.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (!this.g1) {
                fm9.c(j, this.h1 ? null : new IllegalStateException());
                this.h1 = true;
                return;
            }
            throw new IllegalStateException(j);
        }
    }

    public final boolean u() {
        s2();
        return this.k1.l;
    }
}
