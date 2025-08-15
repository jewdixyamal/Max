package defpackage;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Looper;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.View;
import android.view.WindowManager;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import net.jpountz.lz4.LZ4Factory;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.externcalls.TracerLibraryManifest;

/* renamed from: nd7  reason: default package */
public abstract class nd7 {
    public static volatile LZ4Factory a;
    public static final String[] b = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final int[] c = new int[0];
    public static final long[] d = new long[0];
    public static final float[] e = new float[0];
    public static final String[] f = new String[0];
    public static final byte[] g = new byte[0];
    public static x6a h;
    public static final /* synthetic */ int i = 0;
    public static volatile wbd j;

    public static final void A(Context context, String str) {
        if (str.length() != 0) {
            try {
                Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(str);
                Linkify.addLinks(newSpannable, 1);
                URLSpan[] uRLSpanArr = (URLSpan[]) newSpannable.getSpans(0, newSpannable.length(), URLSpan.class);
                if (true ^ (uRLSpanArr.length == 0)) {
                    if (uRLSpanArr.length != 0) {
                        str = uRLSpanArr[0].getURL();
                    } else {
                        throw new NoSuchElementException("Array is empty.");
                    }
                }
            } catch (Throwable unused) {
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException e2) {
                e2.getMessage();
            }
        }
    }

    public static final boolean B(uu3 uu3) {
        return uu3.viewState != null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: wm3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: wm3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: wm3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: wm3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: wm3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: wm3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: wm3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v45, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.nab C(defpackage.gy8 r17) {
        /*
            java.lang.String r1 = "payloadCatching catch error"
            java.lang.String r2 = "ServerPayload/PayloadCatching"
            r3 = 1
            r4 = 0
            int r0 = defpackage.lz7.N(r17)     // Catch:{ all -> 0x000c }
            r5 = r0
            goto L_0x003c
        L_0x000c:
            r0 = move-exception
            r5 = r0
            defpackage.hm9.l0(r2, r1, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x002a
            java.lang.Object r6 = r0.next()
            r4a r6 = (defpackage.r4a) r6
            r6.getClass()
            defpackage.r4a.a(r5)
            goto L_0x0017
        L_0x002a:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x003b
            if (r0 == r3) goto L_0x003a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x003a:
            throw r5
        L_0x003b:
            r5 = r4
        L_0x003c:
            r6 = 0
            if (r5 != 0) goto L_0x0040
            return r6
        L_0x0040:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = r4
            r10 = r6
        L_0x004c:
            if (r9 >= r5) goto L_0x0286
            java.lang.String r0 = defpackage.lz7.P(r17)     // Catch:{ all -> 0x0053 }
            goto L_0x0083
        L_0x0053:
            r0 = move-exception
            r11 = r0
            defpackage.hm9.l0(r2, r1, r11)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x005e:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x0071
            java.lang.Object r12 = r0.next()
            r4a r12 = (defpackage.r4a) r12
            r12.getClass()
            defpackage.r4a.a(r11)
            goto L_0x005e
        L_0x0071:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0082
            if (r0 == r3) goto L_0x0081
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0081:
            throw r11
        L_0x0082:
            r0 = r6
        L_0x0083:
            if (r0 != 0) goto L_0x0089
        L_0x0085:
            r6 = r17
            goto L_0x0281
        L_0x0089:
            int r11 = r0.hashCode()
            r12 = -2078600011(0xffffffff841b14b5, float:-1.822967E-36)
            if (r11 == r12) goto L_0x01b9
            r12 = -1148295641(0xffffffffbb8e6627, float:-0.0043456736)
            if (r11 == r12) goto L_0x00e0
            r12 = 951526432(0x38b72420, float:8.732849E-5)
            if (r11 == r12) goto L_0x00a0
        L_0x009c:
            r6 = r17
            goto L_0x01c3
        L_0x00a0:
            java.lang.String r11 = "contact"
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x00a9
            goto L_0x009c
        L_0x00a9:
            wm3 r0 = defpackage.wm3.e(r17)     // Catch:{ all -> 0x00af }
            r10 = r0
            goto L_0x0085
        L_0x00af:
            r0 = move-exception
            r10 = r0
            defpackage.hm9.l0(r2, r1, r10)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x00ba:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00cd
            java.lang.Object r11 = r0.next()
            r4a r11 = (defpackage.r4a) r11
            r11.getClass()
            defpackage.r4a.a(r10)
            goto L_0x00ba
        L_0x00cd:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x00de
            if (r0 == r3) goto L_0x00dd
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00dd:
            throw r10
        L_0x00de:
            r10 = r6
            goto L_0x0085
        L_0x00e0:
            java.lang.String r11 = "restrictions"
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x00e9
            goto L_0x009c
        L_0x00e9:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            int r0 = defpackage.lz7.N(r17)     // Catch:{ all -> 0x00f6 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00f6 }
            goto L_0x0124
        L_0x00f6:
            r0 = move-exception
            defpackage.hm9.l0(r2, r1, r0)
            java.util.concurrent.CopyOnWriteArraySet r12 = defpackage.u7d.a
            java.util.Iterator r12 = r12.iterator()
        L_0x0100:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0113
            java.lang.Object r13 = r12.next()
            r4a r13 = (defpackage.r4a) r13
            r13.getClass()
            defpackage.r4a.a(r0)
            goto L_0x0100
        L_0x0113:
            int r12 = defpackage.k7d.a
            int r12 = defpackage.au1.s(r12)
            if (r12 == 0) goto L_0x0124
            if (r12 == r3) goto L_0x0123
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0123:
            throw r0
        L_0x0124:
            int r11 = r11.intValue()
            r12 = r4
        L_0x0129:
            if (r12 >= r11) goto L_0x0085
            int r0 = defpackage.lz7.L(r17)     // Catch:{ all -> 0x0135 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0135 }
            r13 = r0
            goto L_0x0164
        L_0x0135:
            r0 = move-exception
            defpackage.hm9.l0(r2, r1, r0)
            java.util.concurrent.CopyOnWriteArraySet r13 = defpackage.u7d.a
            java.util.Iterator r13 = r13.iterator()
        L_0x013f:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0152
            java.lang.Object r14 = r13.next()
            r4a r14 = (defpackage.r4a) r14
            r14.getClass()
            defpackage.r4a.a(r0)
            goto L_0x013f
        L_0x0152:
            int r13 = defpackage.k7d.a
            int r13 = defpackage.au1.s(r13)
            if (r13 == 0) goto L_0x0163
            if (r13 == r3) goto L_0x0162
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0162:
            throw r0
        L_0x0163:
            r13 = r6
        L_0x0164:
            if (r13 == 0) goto L_0x01b2
            r14 = 0
            java.lang.Long r16 = java.lang.Long.valueOf(r14)
            r6 = r17
            long r14 = defpackage.lz7.M(r6, r14)     // Catch:{ all -> 0x0177 }
            java.lang.Long r16 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0177 }
            goto L_0x01a5
        L_0x0177:
            r0 = move-exception
            defpackage.hm9.l0(r2, r1, r0)
            java.util.concurrent.CopyOnWriteArraySet r14 = defpackage.u7d.a
            java.util.Iterator r14 = r14.iterator()
        L_0x0181:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x0194
            java.lang.Object r15 = r14.next()
            r4a r15 = (defpackage.r4a) r15
            r15.getClass()
            defpackage.r4a.a(r0)
            goto L_0x0181
        L_0x0194:
            int r14 = defpackage.k7d.a
            int r14 = defpackage.au1.s(r14)
            if (r14 == 0) goto L_0x01a5
            if (r14 == r3) goto L_0x01a4
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01a4:
            throw r0
        L_0x01a5:
            long r14 = r16.longValue()
            kjc r0 = new kjc
            r0.<init>(r14)
            r7.put(r13, r0)
            goto L_0x01b4
        L_0x01b2:
            r6 = r17
        L_0x01b4:
            int r12 = r12 + 1
            r6 = 0
            goto L_0x0129
        L_0x01b9:
            r6 = r17
            java.lang.String r11 = "profileOptions"
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x01f7
        L_0x01c3:
            r17.z()     // Catch:{ all -> 0x01c8 }
            goto L_0x0281
        L_0x01c8:
            r0 = move-exception
            r11 = r0
            defpackage.hm9.l0(r2, r1, r11)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01d3:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x01e6
            java.lang.Object r12 = r0.next()
            r4a r12 = (defpackage.r4a) r12
            r12.getClass()
            defpackage.r4a.a(r11)
            goto L_0x01d3
        L_0x01e6:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0281
            if (r0 == r3) goto L_0x01f6
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01f6:
            throw r11
        L_0x01f7:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            int r0 = defpackage.lz7.G(r17)     // Catch:{ all -> 0x0204 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0204 }
            goto L_0x0232
        L_0x0204:
            r0 = move-exception
            defpackage.hm9.l0(r2, r1, r0)
            java.util.concurrent.CopyOnWriteArraySet r12 = defpackage.u7d.a
            java.util.Iterator r12 = r12.iterator()
        L_0x020e:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0221
            java.lang.Object r13 = r12.next()
            r4a r13 = (defpackage.r4a) r13
            r13.getClass()
            defpackage.r4a.a(r0)
            goto L_0x020e
        L_0x0221:
            int r12 = defpackage.k7d.a
            int r12 = defpackage.au1.s(r12)
            if (r12 == 0) goto L_0x0232
            if (r12 == r3) goto L_0x0231
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0231:
            throw r0
        L_0x0232:
            int r11 = r11.intValue()
            r12 = r4
        L_0x0237:
            if (r12 >= r11) goto L_0x0281
            int r0 = defpackage.lz7.L(r17)     // Catch:{ all -> 0x0242 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0242 }
            goto L_0x0271
        L_0x0242:
            r0 = move-exception
            defpackage.hm9.l0(r2, r1, r0)
            java.util.concurrent.CopyOnWriteArraySet r13 = defpackage.u7d.a
            java.util.Iterator r13 = r13.iterator()
        L_0x024c:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x025f
            java.lang.Object r14 = r13.next()
            r4a r14 = (defpackage.r4a) r14
            r14.getClass()
            defpackage.r4a.a(r0)
            goto L_0x024c
        L_0x025f:
            int r13 = defpackage.k7d.a
            int r13 = defpackage.au1.s(r13)
            if (r13 == 0) goto L_0x0270
            if (r13 == r3) goto L_0x026f
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x026f:
            throw r0
        L_0x0270:
            r0 = 0
        L_0x0271:
            if (r0 == 0) goto L_0x027e
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.add(r0)
        L_0x027e:
            int r12 = r12 + 1
            goto L_0x0237
        L_0x0281:
            int r9 = r9 + 1
            r6 = 0
            goto L_0x004c
        L_0x0286:
            nab r0 = new nab
            r0.<init>(r10, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd7.C(gy8):nab");
    }

    public static boolean D(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean E(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static ArrayList F(Collection collection, b66 b66) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object apply : collection) {
            try {
                arrayList.add(b66.apply(apply));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return arrayList;
    }

    public static qy5[] G(ArrayList arrayList) {
        int size = arrayList.size();
        qy5[] qy5Arr = new qy5[size];
        int i2 = 0;
        while (i2 < size) {
            qy5 qy5 = ((ua8) arrayList.get(i2)).a;
            if (qy5 != null) {
                qy5Arr[i2] = qy5;
                i2++;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return qy5Arr;
    }

    public static ipe L(int i2, yaf yaf, String str) {
        int h2 = yaf.h();
        if (yaf.h() == 1684108385 && h2 >= 22) {
            yaf.I(10);
            int A = yaf.A();
            if (A > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(A);
                String sb2 = sb.toString();
                int A2 = yaf.A();
                if (A2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(A2);
                    sb2 = sb3.toString();
                }
                return new ipe(str, (String) null, sb2);
            }
        }
        String valueOf2 = String.valueOf(oy.d(i2));
        if (valueOf2.length() != 0) {
            "Failed to parse index/count attribute: ".concat(valueOf2);
        }
        return null;
    }

    public static ipe M(int i2, yaf yaf, String str) {
        int h2 = yaf.h();
        if (yaf.h() == 1684108385) {
            yaf.I(8);
            return new ipe(str, (String) null, yaf.r(h2 - 16));
        }
        String valueOf = String.valueOf(oy.d(i2));
        if (valueOf.length() != 0) {
            "Failed to parse text attribute: ".concat(valueOf);
        }
        return null;
    }

    public static ct6 N(int i2, String str, yaf yaf, boolean z, boolean z2) {
        int i3;
        yaf.I(4);
        if (yaf.h() == 1684108385) {
            yaf.I(8);
            i3 = yaf.v();
        } else {
            i3 = -1;
        }
        if (z2) {
            i3 = Math.min(1, i3);
        }
        if (i3 >= 0) {
            return z ? new ipe(str, (String) null, Integer.toString(i3)) : new g73("und", str, Integer.toString(i3));
        }
        String valueOf = String.valueOf(oy.d(i2));
        if (valueOf.length() != 0) {
            "Failed to parse uint8 attribute: ".concat(valueOf);
        }
        return null;
    }

    public static void O(List list) {
        if (!list.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(list);
            list.clear();
            list.addAll(linkedHashSet);
        }
    }

    public static final yye P(String str) {
        Set q = q();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((wbd) q).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (tpa.f(((yye) next).namespace(), str)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 1) {
            StringBuilder m = au1.m("More then one manifest found for ", str, ": ");
            m.append(x53.n0(arrayList, (String) null, (String) null, (String) null, n71.x0, 31));
            throw new IllegalStateException(m.toString().toString());
        } else if (arrayList.size() == 1) {
            return (yye) arrayList.get(0);
        } else {
            try {
                String str2 = str + ".TracerLibraryManifest";
                yye yye = (yye) Class.forName(str2).newInstance();
                if (tpa.f(yye.namespace(), str)) {
                    return yye;
                }
                throw new IllegalStateException(("Unexpected " + str2 + ".namespace()").toString());
            } catch (Throwable th) {
                NoSuchElementException noSuchElementException = new NoSuchElementException("No manifest found for ".concat(str));
                noSuchElementException.initCause(th);
                throw noSuchElementException;
            }
        }
    }

    public static void Q(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            R(runnable, 0);
        }
    }

    public static zl4 R(Runnable runnable, long j2) {
        return ce.a().c(runnable, j2, TimeUnit.MILLISECONDS);
    }

    public static void S(CharSequence charSequence, Widget widget) {
        bc7[] bc7Arr = BottomSheetWidget.x0;
        gqe gqe = new gqe(qba.a, ys.m0(new Object[]{charSequence}));
        znc znc = null;
        lg3 a2 = od2.a(gqe, (Bundle) null, 6);
        a2.f(new eqe(qba.f));
        a2.b(oba.c, new eqe(qba.e));
        a2.d(oba.b, new eqe(qba.d));
        a2.a.putBoolean("memorize_keyboard", false);
        ConfirmationBottomSheet e2 = a2.e();
        e2.setTargetController(widget);
        uu3 uu3 = widget;
        while (uu3.getParentController() != null) {
            uu3 = uu3.getParentController();
        }
        foc foc = uu3 instanceof foc ? (foc) uu3 : null;
        if (foc != null) {
            znc = foc.T();
        }
        e2.z0(widget);
        if (znc != null) {
            coc coc = new coc(e2, (String) null, (zu3) null, (zu3) null, false, -1);
            wg0.l(false, coc, true, "BottomSheetWidget");
            znc.G(coc);
        }
    }

    public static ArrayList T(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        arrayList.addAll(collection);
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.size() <= 0 || arrayList.size() > 1000) {
            while (arrayList.size() != 0) {
                List subList = arrayList.subList(0, arrayList.size() <= 1000 ? arrayList.size() : 1000);
                ArrayList arrayList3 = new ArrayList(subList.size());
                arrayList3.addAll(subList);
                subList.clear();
                arrayList2.add(arrayList3);
            }
        } else {
            arrayList2.add(arrayList);
        }
        return arrayList2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void U(defpackage.qy9 r1, defpackage.qj3 r2, defpackage.qj3 r3, defpackage.f6 r4) {
        /*
            sd7 r0 = new sd7
            r0.<init>(r2, r3, r4)
            java.util.concurrent.LinkedBlockingQueue r2 = new java.util.concurrent.LinkedBlockingQueue
            r2.<init>()
            ra3 r3 = new ra3
            r4 = 1
            r3.<init>(r4, r2)
            r0.c(r3)
            r1.a(r3)
        L_0x0016:
            boolean r1 = r3.h()
            if (r1 == 0) goto L_0x001d
            goto L_0x0040
        L_0x001d:
            java.lang.Object r1 = r2.poll()
            if (r1 != 0) goto L_0x0030
            java.lang.Object r1 = r2.take()     // Catch:{ InterruptedException -> 0x0028 }
            goto L_0x0030
        L_0x0028:
            r1 = move-exception
            r3.g()
            r0.onError(r1)
            goto L_0x0040
        L_0x0030:
            boolean r4 = r3.h()
            if (r4 != 0) goto L_0x0040
            java.lang.Object r4 = defpackage.ra3.c
            if (r1 == r4) goto L_0x0040
            boolean r1 = defpackage.hv9.b(r0, r1)
            if (r1 == 0) goto L_0x0016
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd7.U(qy9, qj3, qj3, f6):void");
    }

    public static int V(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final void a(int i2, String str) {
        if (i2 < 0) {
            throw new RuntimeException(zr6.i("Unable to locate '", str, "' in program"));
        }
    }

    public static final void b(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            e(16);
            throw new RuntimeException(rh4.j(str, ": glError 0x", pag.N(16, ((long) glGetError) & 4294967295L)));
        }
    }

    public static boolean c(Iterable iterable, b7b b7b) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (Object test : iterable) {
            try {
                if (b7b.test(test)) {
                    return true;
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return false;
    }

    public static final int d(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        b("glCreateShader type=" + i2);
        GLES20.glShaderSource(glCreateShader, str);
        b("glShaderSource");
        GLES20.glCompileShader(glCreateShader);
        b("glCompileShader");
        int[] iArr = {1};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        hm9.p("j", "Could not compile shader " + i2 + ": " + glGetShaderInfoLog, (Throwable) null);
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static void e(int i2) {
        if (2 > i2 || i2 >= 37) {
            StringBuilder n = rh4.n(i2, "radix ", " was not in valid range ");
            n.append(new h37(2, 36, 1));
            throw new IllegalArgumentException(n.toString());
        }
    }

    public static sd7 h(View view, f6 f6Var) {
        r0a n = new hb3(7, view).t(300, TimeUnit.MILLISECONDS).n(ce.a());
        sd7 sd7 = new sd7(new aqc(f6Var), new p4c(14), ft.d);
        n.a(sd7);
        return sd7;
    }

    public static ArrayList i(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        return arrayList;
    }

    public static long[] j(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        long[] jArr = new long[size];
        for (int i2 = 0; i2 < size; i2++) {
            jArr[i2] = ((Long) list.get(i2)).longValue();
        }
        return jArr;
    }

    public static a20 k(RectF rectF) {
        if (rectF == null) {
            return null;
        }
        return new a20(rectF.left, rectF.top, rectF.right, rectF.bottom, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        if (defpackage.w9e.p0(r14, "test-keys", false) != false) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a6 A[LOOP:0: B:72:0x01a0->B:74:0x01a6, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.yie l(android.content.Context r21) {
        /*
            yie r16 = new yie
            qi8 r0 = defpackage.kye.c
            if (r0 == 0) goto L_0x0008
            r2 = r0
            goto L_0x0009
        L_0x0008:
            r2 = 0
        L_0x0009:
            java.lang.Object r2 = r2.a
            java.lang.String r2 = (java.lang.String) r2
            if (r0 == 0) goto L_0x0011
            r3 = r0
            goto L_0x0012
        L_0x0011:
            r3 = 0
        L_0x0012:
            long r3 = r3.o
            if (r0 == 0) goto L_0x0018
            r5 = r0
            goto L_0x0019
        L_0x0018:
            r5 = 0
        L_0x0019:
            java.lang.Object r5 = r5.b
            java.lang.String r5 = (java.lang.String) r5
            if (r0 == 0) goto L_0x0021
            r6 = r0
            goto L_0x0022
        L_0x0021:
            r6 = 0
        L_0x0022:
            java.lang.Object r6 = r6.X
            java.lang.String r6 = (java.lang.String) r6
            if (r0 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            java.lang.Object r0 = r0.c
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = defpackage.rbd.a
            java.lang.String r9 = android.os.Build.MODEL
            java.lang.String r10 = defpackage.dy7.u(r21)
            java.lang.String r11 = android.os.Build.MANUFACTURER
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r12 = java.lang.String.valueOf(r0)
            android.app.ActivityManager$RunningAppProcessInfo r13 = new android.app.ActivityManager$RunningAppProcessInfo
            r13.<init>()
            android.app.ActivityManager.getMyMemoryState(r13)
            int r13 = r13.importance
            r15 = 100
            r17 = 1
            if (r13 == r15) goto L_0x0056
            r15 = 200(0xc8, float:2.8E-43)
            if (r13 != r15) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r13 = 0
            goto L_0x0058
        L_0x0056:
            r13 = r17
        L_0x0058:
            r13 = r13 ^ 1
            android.content.ContentResolver r15 = r21.getContentResolver()
            java.lang.String r1 = "android_id"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r15, r1)
            java.lang.String r15 = android.os.Build.PRODUCT
            java.lang.String r14 = "sdk"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x007b
            java.lang.String r14 = "google_sdk"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x007b
            if (r1 != 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r1 = 0
            goto L_0x007d
        L_0x007b:
            r1 = r17
        L_0x007d:
            java.lang.String r14 = android.os.Build.TAGS
            if (r1 != 0) goto L_0x0091
            if (r14 == 0) goto L_0x0091
            java.lang.String r15 = "test-keys"
            r18 = r13
            r13 = 0
            boolean r14 = defpackage.w9e.p0(r14, r15, r13)
            if (r14 == 0) goto L_0x0093
        L_0x008e:
            r13 = r17
            goto L_0x00b2
        L_0x0091:
            r18 = r13
        L_0x0093:
            java.io.File r13 = new java.io.File
            java.lang.String r14 = "/system/app/Superuser.apk"
            r13.<init>(r14)
            boolean r13 = r13.exists()
            if (r13 == 0) goto L_0x00a1
            goto L_0x008e
        L_0x00a1:
            java.io.File r13 = new java.io.File
            java.lang.String r14 = "/system/xbin/su"
            r13.<init>(r14)
            if (r1 != 0) goto L_0x00b1
            boolean r1 = r13.exists()
            if (r1 == 0) goto L_0x00b1
            goto L_0x008e
        L_0x00b1:
            r13 = 0
        L_0x00b2:
            ky7 r1 = new ky7
            r1.<init>()
            r21.getApplicationContext()
            java.lang.String r14 = android.os.Build.BOARD
            java.lang.String r15 = "board"
            r1.put(r15, r14)
            java.lang.String r14 = android.os.Build.BRAND
            java.lang.String r15 = "brand"
            r1.put(r15, r14)
            java.lang.String r14 = ", "
            java.lang.String[] r15 = android.os.Build.SUPPORTED_ABIS
            java.lang.String r14 = android.text.TextUtils.join(r14, r15)
            java.lang.String r15 = "cpuABI"
            r1.put(r15, r14)
            java.lang.String r14 = android.os.Build.DEVICE
            java.lang.String r15 = "device"
            r1.put(r15, r14)
            java.lang.String r14 = "manufacturer"
            r1.put(r14, r11)
            java.lang.String r14 = "model"
            r1.put(r14, r9)
            java.lang.Runtime r14 = java.lang.Runtime.getRuntime()
            int r14 = r14.availableProcessors()
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r15 = "cpuCount"
            r1.put(r15, r14)
            java.lang.String r14 = java.lang.String.valueOf(r0)
            java.lang.String r15 = "osVersionSdkInt"
            r1.put(r15, r14)
            java.lang.String r14 = android.os.Build.VERSION.RELEASE
            java.lang.String r15 = "osVersionRelease"
            r1.put(r15, r14)
            java.lang.String r14 = defpackage.c37.q()
            java.lang.String r15 = r21.getPackageName()
            boolean r17 = r14.equals(r15)
            if (r17 == 0) goto L_0x011d
            r20 = r11
            r19 = r12
            r17 = r13
            r14 = 0
            goto L_0x013b
        L_0x011d:
            r17 = r13
            r13 = 58
            r19 = r12
            r12 = 6
            r20 = r11
            r11 = 0
            int r12 = defpackage.w9e.z0(r14, r13, r11, r11, r12)
            int r13 = r15.length()
            if (r12 != r13) goto L_0x013b
            boolean r11 = defpackage.eae.o0(r14, r15, r11)
            if (r11 == 0) goto L_0x013b
            java.lang.String r14 = r14.substring(r12)
        L_0x013b:
            if (r14 == 0) goto L_0x0145
            java.lang.String r11 = "processName"
            java.lang.Object r11 = r1.put(r11, r14)
            java.lang.String r11 = (java.lang.String) r11
        L_0x0145:
            java.lang.String r11 = "phone"
            r12 = r21
            java.lang.Object r11 = r12.getSystemService(r11)
            boolean r13 = r11 instanceof android.telephony.TelephonyManager
            if (r13 == 0) goto L_0x0154
            android.telephony.TelephonyManager r11 = (android.telephony.TelephonyManager) r11
            goto L_0x0155
        L_0x0154:
            r11 = 0
        L_0x0155:
            if (r11 == 0) goto L_0x015c
            java.lang.String r11 = r11.getNetworkOperatorName()
            goto L_0x015d
        L_0x015c:
            r11 = 0
        L_0x015d:
            if (r11 == 0) goto L_0x0167
            java.lang.String r13 = "operatorName"
            java.lang.Object r11 = r1.put(r13, r11)
            java.lang.String r11 = (java.lang.String) r11
        L_0x0167:
            android.content.pm.PackageManager r11 = r21.getPackageManager()
            java.lang.String r12 = r21.getPackageName()
            r13 = 30
            if (r0 < r13) goto L_0x017c
            android.content.pm.InstallSourceInfo r0 = r11.getInstallSourceInfo(r12)
            java.lang.String r0 = r0.getInstallingPackageName()
            goto L_0x0180
        L_0x017c:
            java.lang.String r0 = r11.getInstallerPackageName(r12)
        L_0x0180:
            if (r0 == 0) goto L_0x0187
            java.lang.String r11 = "installer"
            r1.put(r11, r0)
        L_0x0187:
            ky7 r14 = r1.b()
            java.util.Set r0 = q()
            java.util.ArrayList r1 = new java.util.ArrayList
            r11 = 10
            int r11 = defpackage.z53.S(r0, r11)
            r1.<init>(r11)
            wbd r0 = (defpackage.wbd) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x01a0:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x01c9
            java.lang.Object r11 = r0.next()
            yye r11 = (defpackage.yye) r11
            po6 r12 = new po6
            java.lang.String r13 = r11.namespace()
            java.lang.String r15 = r11.versionName()
            r21 = r0
            java.lang.String r0 = r11.buildUuid()
            java.lang.String r11 = r11.environment()
            r12.<init>(r13, r15, r0, r11)
            r1.add(r12)
            r0 = r21
            goto L_0x01a0
        L_0x01c9:
            java.util.Set r15 = defpackage.x53.H0(r1)
            r0 = r16
            r1 = r2
            r2 = r3
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r20
            r11 = r19
            r12 = r18
            r13 = r17
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd7.l(android.content.Context):yie");
    }

    public static final boolean o(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static List p(Iterable iterable, b7b b7b) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            try {
                if (b7b.test(next)) {
                    arrayList.add(next);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return arrayList;
    }

    public static final Set q() {
        wbd wbd = j;
        if (wbd != null) {
            return wbd;
        }
        wbd wbd2 = new wbd();
        try {
            for (Object add : Arrays.asList(new yye[]{new TracerLibraryManifest(), new ru.ok.android.externcalls.sdk.audio.TracerLibraryManifest(), new tye()})) {
                wbd2.add(add);
            }
            j = wbd2;
            return z7.a(wbd2);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static Object r(Iterable iterable) {
        if (iterable == null) {
            return null;
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final nx3 s(Executor executor) {
        nx3 nx3;
        pl4 pl4 = executor instanceof pl4 ? (pl4) executor : null;
        return (pl4 == null || (nx3 = pl4.a) == null) ? new z45(executor) : nx3;
    }

    public static Application t() {
        Application application = ApplicationProvider.a;
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public static LZ4Factory u() {
        if (a == null) {
            synchronized (nd7.class) {
                try {
                    if (a == null) {
                        a = LZ4Factory.fastestInstance();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a;
    }

    public static final int w(x43 x43, int i2) {
        int c2 = x43.c();
        x43.u(i2);
        int i3 = 1;
        while (x43.s() == i2) {
            x43.u(i2);
            i3++;
        }
        x43.t(c2);
        return i3;
    }

    public static final WindowManager z(Context context) {
        return (WindowManager) context.getSystemService("window");
    }

    public void H(View view, int i2) {
    }

    public void I(int i2) {
    }

    public abstract void J(View view, int i2, int i3);

    public abstract void K(View view, float f2, float f3);

    public abstract boolean W(View view, int i2);

    public int f(View view, int i2) {
        return 0;
    }

    public int g(View view, int i2) {
        return 0;
    }

    public f99 m(k99 k99) {
        ByteBuffer byteBuffer = k99.X;
        byteBuffer.getClass();
        fm9.f(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return n(k99, byteBuffer);
    }

    public abstract f99 n(k99 k99, ByteBuffer byteBuffer);

    public int v(int i2) {
        return i2;
    }

    public int x(View view) {
        return 0;
    }

    public int y(View view) {
        return 0;
    }
}
