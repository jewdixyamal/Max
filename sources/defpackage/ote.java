package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: ote  reason: default package */
public abstract class ote implements s43 {
    public static final o97 b = new o97("CORE", 1);
    public static final cc7[] c = new cc7[0];
    public final /* synthetic */ int a;

    public /* synthetic */ ote(int i) {
        this.a = i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A(java.lang.String r23) {
        /*
            r0 = 21
            r1 = 20
            r2 = 19
            r3 = 18
            r4 = 17
            r5 = 16
            r6 = 15
            r7 = 14
            r8 = 13
            r9 = 12
            r12 = 9
            r13 = 8
            r14 = 7
            r15 = 6
            r16 = 5
            r17 = 4
            r18 = 3
            r19 = 1
            r20 = 0
            r21 = -1
            if (r23 != 0) goto L_0x0029
            return r21
        L_0x0029:
            java.lang.String r11 = defpackage.ia9.l(r23)
            r11.getClass()
            int r22 = r11.hashCode()
            switch(r22) {
                case -2123537834: goto L_0x01ce;
                case -1662384011: goto L_0x01c1;
                case -1662384007: goto L_0x01b5;
                case -1662095187: goto L_0x01a8;
                case -1606874997: goto L_0x019b;
                case -1487656890: goto L_0x018e;
                case -1487464693: goto L_0x0182;
                case -1487464690: goto L_0x0176;
                case -1487394660: goto L_0x0169;
                case -1487018032: goto L_0x015c;
                case -1248337486: goto L_0x014e;
                case -1079884372: goto L_0x0140;
                case -1004728940: goto L_0x0133;
                case -879272239: goto L_0x0126;
                case -879258763: goto L_0x0119;
                case -387023398: goto L_0x010c;
                case -43467528: goto L_0x00ff;
                case 13915911: goto L_0x00f2;
                case 187078296: goto L_0x00e5;
                case 187078297: goto L_0x00d8;
                case 187078669: goto L_0x00cb;
                case 187090232: goto L_0x00be;
                case 187091926: goto L_0x00b0;
                case 187099443: goto L_0x00a3;
                case 1331848029: goto L_0x0096;
                case 1503095341: goto L_0x0089;
                case 1504578661: goto L_0x007c;
                case 1504619009: goto L_0x006f;
                case 1504824762: goto L_0x0062;
                case 1504831518: goto L_0x0055;
                case 1505118770: goto L_0x0048;
                case 2039520277: goto L_0x003b;
                default: goto L_0x0037;
            }
        L_0x0037:
            r10 = r21
            goto L_0x01da
        L_0x003b:
            java.lang.String r10 = "video/x-matroska"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0044
            goto L_0x0037
        L_0x0044:
            r10 = 31
            goto L_0x01da
        L_0x0048:
            java.lang.String r10 = "audio/webm"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0051
            goto L_0x0037
        L_0x0051:
            r10 = 30
            goto L_0x01da
        L_0x0055:
            java.lang.String r10 = "audio/mpeg"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x005e
            goto L_0x0037
        L_0x005e:
            r10 = 29
            goto L_0x01da
        L_0x0062:
            java.lang.String r10 = "audio/midi"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x006b
            goto L_0x0037
        L_0x006b:
            r10 = 28
            goto L_0x01da
        L_0x006f:
            java.lang.String r10 = "audio/flac"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0078
            goto L_0x0037
        L_0x0078:
            r10 = 27
            goto L_0x01da
        L_0x007c:
            java.lang.String r10 = "audio/eac3"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0085
            goto L_0x0037
        L_0x0085:
            r10 = 26
            goto L_0x01da
        L_0x0089:
            java.lang.String r10 = "audio/3gpp"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0092
            goto L_0x0037
        L_0x0092:
            r10 = 25
            goto L_0x01da
        L_0x0096:
            java.lang.String r10 = "video/mp4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x009f
            goto L_0x0037
        L_0x009f:
            r10 = 24
            goto L_0x01da
        L_0x00a3:
            java.lang.String r10 = "audio/wav"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00ac
            goto L_0x0037
        L_0x00ac:
            r10 = 23
            goto L_0x01da
        L_0x00b0:
            java.lang.String r10 = "audio/ogg"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00ba
            goto L_0x0037
        L_0x00ba:
            r10 = 22
            goto L_0x01da
        L_0x00be:
            java.lang.String r10 = "audio/mp4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00c8
            goto L_0x0037
        L_0x00c8:
            r10 = r0
            goto L_0x01da
        L_0x00cb:
            java.lang.String r10 = "audio/amr"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00d5
            goto L_0x0037
        L_0x00d5:
            r10 = r1
            goto L_0x01da
        L_0x00d8:
            java.lang.String r10 = "audio/ac4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00e2
            goto L_0x0037
        L_0x00e2:
            r10 = r2
            goto L_0x01da
        L_0x00e5:
            java.lang.String r10 = "audio/ac3"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00ef
            goto L_0x0037
        L_0x00ef:
            r10 = r3
            goto L_0x01da
        L_0x00f2:
            java.lang.String r10 = "video/x-flv"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00fc
            goto L_0x0037
        L_0x00fc:
            r10 = r4
            goto L_0x01da
        L_0x00ff:
            java.lang.String r10 = "application/webm"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0109
            goto L_0x0037
        L_0x0109:
            r10 = r5
            goto L_0x01da
        L_0x010c:
            java.lang.String r10 = "audio/x-matroska"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0116
            goto L_0x0037
        L_0x0116:
            r10 = r6
            goto L_0x01da
        L_0x0119:
            java.lang.String r10 = "image/png"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0123
            goto L_0x0037
        L_0x0123:
            r10 = r7
            goto L_0x01da
        L_0x0126:
            java.lang.String r10 = "image/bmp"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0130
            goto L_0x0037
        L_0x0130:
            r10 = r8
            goto L_0x01da
        L_0x0133:
            java.lang.String r10 = "text/vtt"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x013d
            goto L_0x0037
        L_0x013d:
            r10 = r9
            goto L_0x01da
        L_0x0140:
            java.lang.String r10 = "video/x-msvideo"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x014a
            goto L_0x0037
        L_0x014a:
            r10 = 11
            goto L_0x01da
        L_0x014e:
            java.lang.String r10 = "application/mp4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0158
            goto L_0x0037
        L_0x0158:
            r10 = 10
            goto L_0x01da
        L_0x015c:
            java.lang.String r10 = "image/webp"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0166
            goto L_0x0037
        L_0x0166:
            r10 = r12
            goto L_0x01da
        L_0x0169:
            java.lang.String r10 = "image/jpeg"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0173
            goto L_0x0037
        L_0x0173:
            r10 = r13
            goto L_0x01da
        L_0x0176:
            java.lang.String r10 = "image/heif"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0180
            goto L_0x0037
        L_0x0180:
            r10 = r14
            goto L_0x01da
        L_0x0182:
            java.lang.String r10 = "image/heic"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x018c
            goto L_0x0037
        L_0x018c:
            r10 = r15
            goto L_0x01da
        L_0x018e:
            java.lang.String r10 = "image/avif"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0198
            goto L_0x0037
        L_0x0198:
            r10 = r16
            goto L_0x01da
        L_0x019b:
            java.lang.String r10 = "audio/amr-wb"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01a5
            goto L_0x0037
        L_0x01a5:
            r10 = r17
            goto L_0x01da
        L_0x01a8:
            java.lang.String r10 = "video/webm"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01b2
            goto L_0x0037
        L_0x01b2:
            r10 = r18
            goto L_0x01da
        L_0x01b5:
            java.lang.String r10 = "video/mp2t"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01bf
            goto L_0x0037
        L_0x01bf:
            r10 = 2
            goto L_0x01da
        L_0x01c1:
            java.lang.String r10 = "video/mp2p"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01cb
            goto L_0x0037
        L_0x01cb:
            r10 = r19
            goto L_0x01da
        L_0x01ce:
            java.lang.String r10 = "audio/eac3-joc"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01d8
            goto L_0x0037
        L_0x01d8:
            r10 = r20
        L_0x01da:
            switch(r10) {
                case 0: goto L_0x01f6;
                case 1: goto L_0x01f3;
                case 2: goto L_0x01f0;
                case 3: goto L_0x01ef;
                case 4: goto L_0x01ee;
                case 5: goto L_0x01ed;
                case 6: goto L_0x01ec;
                case 7: goto L_0x01ec;
                case 8: goto L_0x01eb;
                case 9: goto L_0x01ea;
                case 10: goto L_0x01e9;
                case 11: goto L_0x01e8;
                case 12: goto L_0x01e7;
                case 13: goto L_0x01e6;
                case 14: goto L_0x01e5;
                case 15: goto L_0x01ef;
                case 16: goto L_0x01ef;
                case 17: goto L_0x01e4;
                case 18: goto L_0x01f6;
                case 19: goto L_0x01e3;
                case 20: goto L_0x01ee;
                case 21: goto L_0x01e9;
                case 22: goto L_0x01e2;
                case 23: goto L_0x01e1;
                case 24: goto L_0x01e9;
                case 25: goto L_0x01ee;
                case 26: goto L_0x01f6;
                case 27: goto L_0x01e0;
                case 28: goto L_0x01df;
                case 29: goto L_0x01de;
                case 30: goto L_0x01ef;
                case 31: goto L_0x01ef;
                default: goto L_0x01dd;
            }
        L_0x01dd:
            return r21
        L_0x01de:
            return r14
        L_0x01df:
            return r6
        L_0x01e0:
            return r17
        L_0x01e1:
            return r9
        L_0x01e2:
            return r12
        L_0x01e3:
            return r19
        L_0x01e4:
            return r16
        L_0x01e5:
            return r4
        L_0x01e6:
            return r2
        L_0x01e7:
            return r8
        L_0x01e8:
            return r5
        L_0x01e9:
            return r13
        L_0x01ea:
            return r3
        L_0x01eb:
            return r7
        L_0x01ec:
            return r1
        L_0x01ed:
            return r0
        L_0x01ee:
            return r18
        L_0x01ef:
            return r15
        L_0x01f0:
            r0 = 11
            return r0
        L_0x01f3:
            r0 = 10
            return r0
        L_0x01f6:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ote.A(java.lang.String):int");
    }

    public static int B(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static final void D(View view, int i, int i2, int i3, int i4) {
        View view2 = (View) view.getParent();
        if (c54.K(view)) {
            view.layout(view2.getMeasuredWidth() - i3, i2, view2.getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }

    public static /* synthetic */ void E(View view, int i, int i2, int i3, int i4) {
        int measuredWidth = view.getMeasuredWidth() + i;
        if ((i4 & 8) != 0) {
            i3 = view.getMeasuredHeight() + i2;
        }
        D(view, i, i2, measuredWidth, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013a, code lost:
        if (r11 == null) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x016b, code lost:
        r11 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x016c, code lost:
        r9 = new defpackage.bx8(r9, r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.fx8 F(defpackage.gy8 r14) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "payloadCatching catch error"
            java.lang.String r2 = "ServerPayload/PayloadCatching"
            r3 = 1
            r4 = 0
            int r5 = defpackage.lz7.N(r14)     // Catch:{ all -> 0x000d }
            goto L_0x003c
        L_0x000d:
            r5 = move-exception
            defpackage.hm9.l0(r2, r1, r5)
            java.util.concurrent.CopyOnWriteArraySet r6 = defpackage.u7d.a
            java.util.Iterator r6 = r6.iterator()
        L_0x0017:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x002a
            java.lang.Object r7 = r6.next()
            r4a r7 = (defpackage.r4a) r7
            r7.getClass()
            defpackage.r4a.a(r5)
            goto L_0x0017
        L_0x002a:
            int r6 = defpackage.k7d.a
            int r6 = defpackage.au1.s(r6)
            if (r6 == 0) goto L_0x003b
            if (r6 == r3) goto L_0x003a
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x003a:
            throw r5
        L_0x003b:
            r5 = r4
        L_0x003c:
            r6 = 0
            if (r5 != 0) goto L_0x0040
            return r6
        L_0x0040:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = r4
            r10 = r8
            r9 = r6
        L_0x0048:
            if (r8 >= r5) goto L_0x01a9
            java.lang.String r11 = defpackage.lz7.P(r14)     // Catch:{ all -> 0x004f }
            goto L_0x007e
        L_0x004f:
            r11 = move-exception
            defpackage.hm9.l0(r2, r1, r11)
            java.util.concurrent.CopyOnWriteArraySet r12 = defpackage.u7d.a
            java.util.Iterator r12 = r12.iterator()
        L_0x0059:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x006c
            java.lang.Object r13 = r12.next()
            r4a r13 = (defpackage.r4a) r13
            r13.getClass()
            defpackage.r4a.a(r11)
            goto L_0x0059
        L_0x006c:
            int r12 = defpackage.k7d.a
            int r12 = defpackage.au1.s(r12)
            if (r12 == 0) goto L_0x007d
            if (r12 == r3) goto L_0x007c
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x007c:
            throw r11
        L_0x007d:
            r11 = r6
        L_0x007e:
            if (r11 == 0) goto L_0x0173
            int r12 = r11.hashCode()
            r13 = -1370485892(0xffffffffae500b7c, float:-4.7303925E-11)
            if (r12 == r13) goto L_0x012b
            r13 = -731385813(0xffffffffd467f02b, float:-3.98466718E12)
            if (r12 == r13) goto L_0x00e0
            r13 = -372020745(0xffffffffe9d369f7, float:-3.194797E25)
            if (r12 == r13) goto L_0x0095
            goto L_0x0173
        L_0x0095:
            java.lang.String r12 = "counters"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x009f
            goto L_0x0173
        L_0x009f:
            int r11 = defpackage.lz7.G(r14)     // Catch:{ all -> 0x00a4 }
            goto L_0x00d3
        L_0x00a4:
            r11 = move-exception
            defpackage.hm9.l0(r2, r1, r11)
            java.util.concurrent.CopyOnWriteArraySet r12 = defpackage.u7d.a
            java.util.Iterator r12 = r12.iterator()
        L_0x00ae:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00c1
            java.lang.Object r13 = r12.next()
            r4a r13 = (defpackage.r4a) r13
            r13.getClass()
            defpackage.r4a.a(r11)
            goto L_0x00ae
        L_0x00c1:
            int r12 = defpackage.k7d.a
            int r12 = defpackage.au1.s(r12)
            if (r12 == 0) goto L_0x00d2
            if (r12 == r3) goto L_0x00d1
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x00d1:
            throw r11
        L_0x00d2:
            r11 = r4
        L_0x00d3:
            r12 = r4
        L_0x00d4:
            if (r12 >= r11) goto L_0x01a5
            cx8 r13 = defpackage.mqd.v(r14)
            r7.add(r13)
            int r12 = r12 + 1
            goto L_0x00d4
        L_0x00e0:
            java.lang.String r12 = "totalCount"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x00ea
            goto L_0x0173
        L_0x00ea:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            int r11 = defpackage.lz7.L(r14)     // Catch:{ all -> 0x00f7 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00f7 }
            goto L_0x0125
        L_0x00f7:
            r11 = move-exception
            defpackage.hm9.l0(r2, r1, r11)
            java.util.concurrent.CopyOnWriteArraySet r12 = defpackage.u7d.a
            java.util.Iterator r12 = r12.iterator()
        L_0x0101:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0114
            java.lang.Object r13 = r12.next()
            r4a r13 = (defpackage.r4a) r13
            r13.getClass()
            defpackage.r4a.a(r11)
            goto L_0x0101
        L_0x0114:
            int r12 = defpackage.k7d.a
            int r12 = defpackage.au1.s(r12)
            if (r12 == 0) goto L_0x0125
            if (r12 == r3) goto L_0x0124
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x0124:
            throw r11
        L_0x0125:
            int r10 = r10.intValue()
            goto L_0x01a5
        L_0x012b:
            java.lang.String r12 = "yourReaction"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0134
            goto L_0x0173
        L_0x0134:
            gx8 r9 = defpackage.gx8.EMOJI
            java.lang.String r11 = defpackage.lz7.P(r14)     // Catch:{ all -> 0x013d }
            if (r11 != 0) goto L_0x016c
            goto L_0x016b
        L_0x013d:
            r11 = move-exception
            defpackage.hm9.l0(r2, r1, r11)
            java.util.concurrent.CopyOnWriteArraySet r12 = defpackage.u7d.a
            java.util.Iterator r12 = r12.iterator()
        L_0x0147:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x015a
            java.lang.Object r13 = r12.next()
            r4a r13 = (defpackage.r4a) r13
            r13.getClass()
            defpackage.r4a.a(r11)
            goto L_0x0147
        L_0x015a:
            int r12 = defpackage.k7d.a
            int r12 = defpackage.au1.s(r12)
            if (r12 == 0) goto L_0x016b
            if (r12 == r3) goto L_0x016a
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x016a:
            throw r11
        L_0x016b:
            r11 = r0
        L_0x016c:
            bx8 r12 = new bx8
            r12.<init>(r9, r11)
            r9 = r12
            goto L_0x01a5
        L_0x0173:
            r14.z()     // Catch:{ all -> 0x0177 }
            goto L_0x01a5
        L_0x0177:
            r11 = move-exception
            defpackage.hm9.l0(r2, r1, r11)
            java.util.concurrent.CopyOnWriteArraySet r12 = defpackage.u7d.a
            java.util.Iterator r12 = r12.iterator()
        L_0x0181:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0194
            java.lang.Object r13 = r12.next()
            r4a r13 = (defpackage.r4a) r13
            r13.getClass()
            defpackage.r4a.a(r11)
            goto L_0x0181
        L_0x0194:
            int r12 = defpackage.k7d.a
            int r12 = defpackage.au1.s(r12)
            if (r12 == 0) goto L_0x01a5
            if (r12 == r3) goto L_0x01a4
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x01a4:
            throw r11
        L_0x01a5:
            int r8 = r8 + 1
            goto L_0x0048
        L_0x01a9:
            fx8 r14 = new fx8
            r14.<init>(r7, r10, r9)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ote.F(gy8):fx8");
    }

    public static TypedArray G(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static fn1 O(gy8 gy8) {
        int i;
        String str;
        int i2;
        gy8 gy82 = gy8;
        long nanoTime = System.nanoTime();
        if (!gy8.m()) {
            return new fn1();
        }
        int i3 = 1;
        int i4 = 0;
        try {
            i = lz7.N(gy8);
        } catch (Throwable th) {
            Throwable th2 = th;
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th2);
            }
            int s = au1.s(k7d.a);
            if (s == 0) {
                i = 0;
            } else if (s != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th2;
            }
        }
        if (i == 0) {
            return new fn1();
        }
        long j = 0;
        long j2 = 0;
        String str2 = null;
        while (i4 < i) {
            try {
                str = lz7.P(gy8);
            } catch (Throwable th3) {
                Throwable th4 = th3;
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th4);
                }
                int s2 = au1.s(k7d.a);
                if (s2 == 0) {
                    str = null;
                } else if (s2 != i3) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th4;
                }
            }
            if (str == null) {
                i2 = i3;
            } else {
                int hashCode = str.hashCode();
                if (hashCode != 110541305) {
                    if (hashCode != 554416495) {
                        if (hashCode == 698680425 && str.equals("token_refresh_ts")) {
                            try {
                                j2 = lz7.M(gy82, 0);
                            } catch (Throwable th5) {
                                Throwable th6 = th5;
                                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                                Iterator it3 = u7d.a.iterator();
                                while (it3.hasNext()) {
                                    ((r4a) it3.next()).getClass();
                                    r4a.a(th6);
                                }
                                int s3 = au1.s(k7d.a);
                                if (s3 == 0) {
                                    j2 = 0;
                                } else if (s3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                } else {
                                    throw th6;
                                }
                            }
                            i2 = 1;
                        }
                    } else if (str.equals("token_lifetime_ts")) {
                        try {
                            j = lz7.M(gy82, 0);
                        } catch (Throwable th7) {
                            Throwable th8 = th7;
                            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                            Iterator it4 = u7d.a.iterator();
                            while (it4.hasNext()) {
                                ((r4a) it4.next()).getClass();
                                r4a.a(th8);
                            }
                            int s4 = au1.s(k7d.a);
                            if (s4 == 0) {
                                j = 0;
                            } else if (s4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                throw th8;
                            }
                        }
                        i2 = 1;
                    }
                } else if (str.equals(ApiProtocol.KEY_TOKEN)) {
                    try {
                        str2 = lz7.P(gy8);
                    } catch (Throwable th9) {
                        Throwable th10 = th9;
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                        Iterator it5 = u7d.a.iterator();
                        while (it5.hasNext()) {
                            ((r4a) it5.next()).getClass();
                            r4a.a(th10);
                        }
                        int s5 = au1.s(k7d.a);
                        if (s5 == 0) {
                            str2 = null;
                        } else if (s5 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th10;
                        }
                    }
                    i2 = 1;
                }
                try {
                    gy8.z();
                } catch (Throwable th11) {
                    Throwable th12 = th11;
                    hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th12);
                    Iterator it6 = u7d.a.iterator();
                    while (it6.hasNext()) {
                        ((r4a) it6.next()).getClass();
                        r4a.a(th12);
                    }
                    int s6 = au1.s(k7d.a);
                    if (s6 != 0) {
                        if (s6 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th12;
                    }
                }
                i2 = 1;
            }
            i4++;
            i3 = i2;
        }
        return new fn1(str2 == null ? "" : str2, j, j2, nanoTime);
    }

    public static void R(Drawable drawable, int i) {
        aq4.g(drawable, i);
    }

    public static void S(Drawable drawable, ColorStateList colorStateList) {
        aq4.h(drawable, colorStateList);
    }

    public static void T(Drawable drawable, PorterDuff.Mode mode) {
        aq4.i(drawable, mode);
    }

    public static long V(int i, long j) {
        long j2 = (long) i;
        c54.j("bytesPerFrame must be greater than 0.", j2 > 0);
        return j / j2;
    }

    public static h37 X(h37 h37, int i) {
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (z) {
            if (h37.c <= 0) {
                i = -i;
            }
            return new h37(h37.a, h37.b, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [h37, j37] */
    public static j37 Y(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new h37(i, i2 - 1, 1);
        }
        j37 j37 = j37.o;
        return j37.o;
    }

    public static final void Z(y5f y5f) {
        y5f.e(uba.class, new lxc(4));
    }

    public static final void a0(y5f y5f) {
        y5f.c(b64.class, new lxc(13));
        y5f.e(cz3.class, new mxc(3));
        y5f.e(dxa.class, new mxc(4));
    }

    public static float b(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static final int b0(int i, float f) {
        return Color.argb(tu0.G(f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static long c(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static float d(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int e(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long f(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException(z7b.i(au1.k(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j2, '.'));
    }

    public static final Object i(ilc ilc, CancellationSignal cancellationSignal, Callable callable, Continuation continuation) {
        lx3 lx3;
        if (ilc.n() && ilc.k()) {
            return callable.call();
        }
        v0f v0f = (v0f) continuation.getContext().get(v0f.c);
        if (v0f == null || (lx3 = v0f.a) == null) {
            lx3 = f8.h(ilc);
        }
        sy1 sy1 = new sy1(1, v3c.u(continuation));
        sy1.n();
        sy1.d(new ey3(cancellationSignal, 0, j47.T(zd6.a, lx3, (vx3) null, new fy3(callable, sy1, (Continuation) null), 2)));
        return sy1.m();
    }

    public static final Object j(ilc ilc, Callable callable, Continuation continuation) {
        lx3 lx3;
        if (ilc.n() && ilc.k()) {
            return callable.call();
        }
        v0f v0f = (v0f) continuation.getContext().get(v0f.c);
        if (v0f == null || (lx3 = v0f.a) == null) {
            lx3 = f8.k(ilc);
        }
        return j47.t0(lx3, new dy3(callable, (Continuation) null), continuation);
    }

    public static long k(int i, long j) {
        long j2 = (long) i;
        c54.j("sampleRate must be greater than 0.", j2 > 0);
        return (TimeUnit.SECONDS.toNanos(1) * j) / j2;
    }

    public static int m(int i, int i2, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static final Boolean n(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0092, code lost:
        if (r0.equals("error.limit.violate") == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cb, code lost:
        if (r0.equals("error.code.attempt.limit") == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e0, code lost:
        if (r0.equals("code.limit") == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e3, code lost:
        r1 = defpackage.jpc.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ee, code lost:
        r1 = defpackage.jpc.F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f3, code lost:
        r1 = new defpackage.eqe(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0113, code lost:
        r4 = r2.Y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.tt7 s(defpackage.pke r4) {
        /*
            java.lang.String r0 = r4.b
            java.lang.String r1 = "service.unavailable"
            boolean r1 = defpackage.tpa.f(r0, r1)
            r2 = 0
            if (r1 != 0) goto L_0x010a
            java.lang.String r1 = "service.timeout"
            boolean r1 = defpackage.tpa.f(r0, r1)
            if (r1 != 0) goto L_0x010a
            java.lang.String r1 = "errors.event.unavailable"
            boolean r1 = defpackage.tpa.f(r0, r1)
            if (r1 == 0) goto L_0x001d
            goto L_0x010a
        L_0x001d:
            boolean r1 = r4 instanceof defpackage.gke
            if (r1 == 0) goto L_0x0037
            st7 r4 = new st7
            int r0 = defpackage.yoc.P
            eqe r1 = new eqe
            r1.<init>(r0)
            int r0 = defpackage.yoc.O
            eqe r2 = new eqe
            r2.<init>(r0)
            r0 = 1
            r4.<init>(r1, r2, r0)
            goto L_0x013d
        L_0x0037:
            java.lang.String r1 = "error.limit.violate"
            boolean r3 = defpackage.tpa.f(r0, r1)
            if (r3 == 0) goto L_0x0073
            boolean r0 = r4 instanceof defpackage.qke
            if (r0 == 0) goto L_0x0046
            r2 = r4
            qke r2 = (defpackage.qke) r2
        L_0x0046:
            qt7 r4 = new qt7
            if (r2 == 0) goto L_0x0054
            java.lang.String r0 = r2.Y
            if (r0 == 0) goto L_0x0054
            iqe r1 = new iqe
            r1.<init>(r0)
            goto L_0x005b
        L_0x0054:
            int r0 = defpackage.v0c.oneme_login_sms_count_exceeded_title
            eqe r1 = new eqe
            r1.<init>(r0)
        L_0x005b:
            if (r2 == 0) goto L_0x0067
            java.lang.String r0 = r2.Z
            if (r0 == 0) goto L_0x0067
            iqe r2 = new iqe
            r2.<init>(r0)
            goto L_0x006e
        L_0x0067:
            int r0 = defpackage.v0c.oneme_login_sms_count_exceeded_description
            eqe r2 = new eqe
            r2.<init>(r0)
        L_0x006e:
            r4.<init>(r1, r2)
            goto L_0x013d
        L_0x0073:
            java.lang.String r2 = r4.o
            if (r2 == 0) goto L_0x0085
            int r3 = r2.length()
            if (r3 != 0) goto L_0x007e
            goto L_0x0085
        L_0x007e:
            iqe r1 = new iqe
            r1.<init>(r2)
            goto L_0x00f9
        L_0x0085:
            int r2 = r0.hashCode()
            switch(r2) {
                case -2107093715: goto L_0x00e6;
                case -1988099974: goto L_0x00da;
                case -1927764058: goto L_0x00ce;
                case -1458260801: goto L_0x00c5;
                case -890707199: goto L_0x00b9;
                case -802380906: goto L_0x00ad;
                case 106239865: goto L_0x00a1;
                case 255501108: goto L_0x0095;
                case 1415134249: goto L_0x008e;
                default: goto L_0x008c;
            }
        L_0x008c:
            goto L_0x00ee
        L_0x008e:
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00e3
            goto L_0x00ee
        L_0x0095:
            java.lang.String r1 = "login.token"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x009e
            goto L_0x00ee
        L_0x009e:
            int r1 = defpackage.jpc.n
            goto L_0x00f3
        L_0x00a1:
            java.lang.String r1 = "verify.code.expired"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00aa
            goto L_0x00ee
        L_0x00aa:
            int r1 = defpackage.jpc.l
            goto L_0x00f3
        L_0x00ad:
            java.lang.String r1 = "error.phone.blacklisted"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00b6
            goto L_0x00ee
        L_0x00b6:
            int r1 = defpackage.jpc.k
            goto L_0x00f3
        L_0x00b9:
            java.lang.String r1 = "verify.code.wrong"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00c2
            goto L_0x00ee
        L_0x00c2:
            int r1 = defpackage.jpc.j
            goto L_0x00f3
        L_0x00c5:
            java.lang.String r1 = "error.code.attempt.limit"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00e3
            goto L_0x00ee
        L_0x00ce:
            java.lang.String r1 = "auth.blocked"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00d7
            goto L_0x00ee
        L_0x00d7:
            int r1 = defpackage.jpc.h
            goto L_0x00f3
        L_0x00da:
            java.lang.String r1 = "code.limit"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00e3
            goto L_0x00ee
        L_0x00e3:
            int r1 = defpackage.jpc.m
            goto L_0x00f3
        L_0x00e6:
            java.lang.String r1 = "phone.wrong"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00f1
        L_0x00ee:
            int r1 = defpackage.jpc.F
            goto L_0x00f3
        L_0x00f1:
            int r1 = defpackage.jpc.o
        L_0x00f3:
            eqe r2 = new eqe
            r2.<init>(r1)
            r1 = r2
        L_0x00f9:
            ot7 r2 = new ot7
            yje r4 = r4.X
            if (r4 == 0) goto L_0x0100
            goto L_0x0105
        L_0x0100:
            java.lang.Throwable r4 = new java.lang.Throwable
            r4.<init>(r0)
        L_0x0105:
            r2.<init>(r1, r4)
            r4 = r2
            goto L_0x013d
        L_0x010a:
            boolean r0 = r4 instanceof defpackage.qke
            if (r0 == 0) goto L_0x0111
            r2 = r4
            qke r2 = (defpackage.qke) r2
        L_0x0111:
            if (r2 == 0) goto L_0x011d
            java.lang.String r4 = r2.Y
            if (r4 == 0) goto L_0x011d
            iqe r0 = new iqe
            r0.<init>(r4)
            goto L_0x0124
        L_0x011d:
            int r4 = defpackage.yoc.R
            eqe r0 = new eqe
            r0.<init>(r4)
        L_0x0124:
            if (r2 == 0) goto L_0x0130
            java.lang.String r4 = r2.Z
            if (r4 == 0) goto L_0x0130
            iqe r1 = new iqe
            r1.<init>(r4)
            goto L_0x0137
        L_0x0130:
            int r4 = defpackage.yoc.Q
            eqe r1 = new eqe
            r1.<init>(r4)
        L_0x0137:
            st7 r4 = new st7
            r2 = 2
            r4.<init>(r0, r1, r2)
        L_0x013d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ote.s(pke):tt7");
    }

    public static jn t(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        jn jnVar;
        if (z(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new jn((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                jnVar = jn.l(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception unused) {
                jnVar = null;
            }
            if (jnVar != null) {
                return jnVar;
            }
        }
        return new jn((Shader) null, (ColorStateList) null, 0);
    }

    public static final PackageInfo u(PackageManager packageManager, String str) {
        return Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of((long) 0)) : packageManager.getPackageInfo(str, 0);
    }

    public static String x(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static boolean z(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public boolean C() {
        return false;
    }

    public abstract void H();

    public void I() {
    }

    public abstract void J(int i);

    public abstract void K(Typeface typeface, boolean z);

    public abstract boolean L(int i, KeyEvent keyEvent);

    public boolean M(KeyEvent keyEvent) {
        return false;
    }

    public boolean N() {
        return false;
    }

    public abstract void P(boolean z);

    public abstract void Q(boolean z);

    public abstract void U(CharSequence charSequence);

    public j7 W(imc imc) {
        return null;
    }

    public boolean a() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z);

    public abstract int l(View view, int i, int i2);

    public cg6 o() {
        return new cg6();
    }

    public abstract String p();

    public abstract int q();

    public abstract int r(View view, int i);

    public String toString() {
        switch (this.a) {
            case 10:
                return "Alignment:" + p();
            default:
                return super.toString();
        }
    }

    public int v(int i, int i2) {
        return i;
    }

    public abstract Context y();
}
