package defpackage;

import android.view.Surface;
import androidx.camera.core.ImageCaptureException;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.messages.video.fetcher.FetcherException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: bdb  reason: default package */
public final class bdb implements mm0, a76, dke, gq1, obe, l3a {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ bdb(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v6, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r10v3, types: [f4g, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v46 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0114, code lost:
        if (")".equals(defpackage.d4g.b(r8, r11)) == false) goto L_0x00ae;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void G(byte[] r20, int r21, int r22, defpackage.nbe r23, defpackage.pj3 r24) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = 2
            r3 = 0
            r4 = -1
            r5 = 1
            int r6 = r1 + r22
            java.lang.Object r7 = r0.b
            wpa r7 = (defpackage.wpa) r7
            r8 = r20
            r7.E(r6, r8)
            r7.G(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            defpackage.v4g.d(r7)     // Catch:{ ParserException -> 0x040a }
        L_0x001e:
            java.nio.charset.Charset r6 = defpackage.b52.c
            java.lang.String r6 = r7.h(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x002b
            goto L_0x001e
        L_0x002b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0030:
            r9 = r3
            r8 = r4
        L_0x0032:
            if (r8 != r4) goto L_0x0056
            int r9 = r7.b
            java.nio.charset.Charset r8 = defpackage.b52.c
            java.lang.String r8 = r7.h(r8)
            if (r8 != 0) goto L_0x0040
            r8 = r3
            goto L_0x0032
        L_0x0040:
            java.lang.String r11 = "STYLE"
            boolean r11 = r11.equals(r8)
            if (r11 == 0) goto L_0x004a
            r8 = r2
            goto L_0x0032
        L_0x004a:
            java.lang.String r11 = "NOTE"
            boolean r8 = r8.startsWith(r11)
            if (r8 == 0) goto L_0x0054
            r8 = r5
            goto L_0x0032
        L_0x0054:
            r8 = 3
            goto L_0x0032
        L_0x0056:
            r7.G(r9)
            if (r8 == 0) goto L_0x03fd
            if (r8 != r5) goto L_0x006a
        L_0x005d:
            java.nio.charset.Charset r8 = defpackage.b52.c
            java.lang.String r8 = r7.h(r8)
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0030
            goto L_0x005d
        L_0x006a:
            r9 = 0
            if (r8 != r2) goto L_0x03ba
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L_0x03b2
            java.nio.charset.Charset r8 = defpackage.b52.c
            r7.h(r8)
            java.lang.Object r8 = r0.c
            d4g r8 = (defpackage.d4g) r8
            java.lang.StringBuilder r11 = r8.b
            r11.setLength(r3)
            int r12 = r7.b
        L_0x0083:
            java.nio.charset.Charset r13 = defpackage.b52.c
            java.lang.String r13 = r7.h(r13)
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x03ae
            byte[] r13 = r7.a
            int r14 = r7.b
            wpa r8 = r8.a
            r8.E(r14, r13)
            r8.G(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x00a0:
            defpackage.d4g.c(r8)
            int r13 = r8.a()
            java.lang.String r14 = "{"
            java.lang.String r15 = ""
            r10 = 5
            if (r13 >= r10) goto L_0x00b1
        L_0x00ae:
            r2 = r9
            goto L_0x0117
        L_0x00b1:
            java.nio.charset.Charset r13 = defpackage.b52.c
            java.lang.String r10 = r8.s(r10, r13)
            java.lang.String r13 = "::cue"
            boolean r10 = r13.equals(r10)
            if (r10 != 0) goto L_0x00c0
            goto L_0x00ae
        L_0x00c0:
            int r10 = r8.b
            java.lang.String r13 = defpackage.d4g.b(r8, r11)
            if (r13 != 0) goto L_0x00c9
            goto L_0x00ae
        L_0x00c9:
            boolean r16 = r14.equals(r13)
            if (r16 == 0) goto L_0x00d4
            r8.G(r10)
            r2 = r15
            goto L_0x0117
        L_0x00d4:
            java.lang.String r10 = "("
            boolean r10 = r10.equals(r13)
            if (r10 == 0) goto L_0x0109
            int r10 = r8.b
            int r13 = r8.c
            r16 = r3
        L_0x00e2:
            if (r10 >= r13) goto L_0x00fa
            if (r16 != 0) goto L_0x00fa
            byte[] r2 = r8.a
            int r17 = r10 + 1
            byte r2 = r2[r10]
            char r2 = (char) r2
            r10 = 41
            if (r2 != r10) goto L_0x00f3
            r2 = r5
            goto L_0x00f4
        L_0x00f3:
            r2 = r3
        L_0x00f4:
            r16 = r2
            r10 = r17
            r2 = 2
            goto L_0x00e2
        L_0x00fa:
            int r10 = r10 + r4
            int r2 = r8.b
            int r10 = r10 - r2
            java.nio.charset.Charset r2 = defpackage.b52.c
            java.lang.String r2 = r8.s(r10, r2)
            java.lang.String r2 = r2.trim()
            goto L_0x010a
        L_0x0109:
            r2 = r9
        L_0x010a:
            java.lang.String r10 = defpackage.d4g.b(r8, r11)
            java.lang.String r13 = ")"
            boolean r10 = r13.equals(r10)
            if (r10 != 0) goto L_0x0117
            goto L_0x00ae
        L_0x0117:
            if (r2 == 0) goto L_0x0123
            java.lang.String r10 = defpackage.d4g.b(r8, r11)
            boolean r10 = r14.equals(r10)
            if (r10 != 0) goto L_0x0127
        L_0x0123:
            r0 = r5
            r3 = 2
            goto L_0x03a3
        L_0x0127:
            f4g r10 = new f4g
            r10.<init>()
            r10.a = r15
            r10.b = r15
            java.util.Set r13 = java.util.Collections.emptySet()
            r10.c = r13
            r10.d = r15
            r10.e = r9
            r10.g = r3
            r10.i = r3
            r10.j = r4
            r10.k = r4
            r10.l = r4
            r10.m = r4
            r10.n = r4
            r10.p = r4
            r10.q = r3
            boolean r13 = r15.equals(r2)
            if (r13 == 0) goto L_0x0153
            goto L_0x01b8
        L_0x0153:
            r13 = 91
            int r13 = r2.indexOf(r13)
            if (r13 == r4) goto L_0x0178
            java.util.regex.Pattern r14 = defpackage.d4g.c
            java.lang.String r9 = r2.substring(r13)
            java.util.regex.Matcher r9 = r14.matcher(r9)
            boolean r14 = r9.matches()
            if (r14 == 0) goto L_0x0174
            java.lang.String r9 = r9.group(r5)
            r9.getClass()
            r10.d = r9
        L_0x0174:
            java.lang.String r2 = r2.substring(r3, r13)
        L_0x0178:
            int r9 = defpackage.oaf.a
            java.lang.String r9 = "\\."
            java.lang.String[] r2 = r2.split(r9, r4)
            r9 = r2[r3]
            r13 = 35
            int r13 = r9.indexOf(r13)
            if (r13 == r4) goto L_0x0198
            java.lang.String r14 = r9.substring(r3, r13)
            r10.b = r14
            int r13 = r13 + r5
            java.lang.String r9 = r9.substring(r13)
            r10.a = r9
            goto L_0x019a
        L_0x0198:
            r10.b = r9
        L_0x019a:
            int r9 = r2.length
            if (r9 <= r5) goto L_0x01b8
            int r9 = r2.length
            int r13 = r2.length
            if (r9 > r13) goto L_0x01a3
            r13 = r5
            goto L_0x01a4
        L_0x01a3:
            r13 = r3
        L_0x01a4:
            defpackage.fm9.f(r13)
            java.lang.Object[] r2 = java.util.Arrays.copyOfRange(r2, r5, r9)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.util.HashSet r9 = new java.util.HashSet
            java.util.List r2 = java.util.Arrays.asList(r2)
            r9.<init>(r2)
            r10.c = r9
        L_0x01b8:
            r2 = r3
            r9 = 0
        L_0x01ba:
            java.lang.String r13 = "}"
            if (r2 != 0) goto L_0x038f
            int r2 = r8.b
            java.lang.String r9 = defpackage.d4g.b(r8, r11)
            if (r9 == 0) goto L_0x01cf
            boolean r14 = r13.equals(r9)
            if (r14 == 0) goto L_0x01cd
            goto L_0x01cf
        L_0x01cd:
            r14 = r3
            goto L_0x01d0
        L_0x01cf:
            r14 = r5
        L_0x01d0:
            if (r14 != 0) goto L_0x0385
            r8.G(r2)
            defpackage.d4g.c(r8)
            java.lang.String r2 = defpackage.d4g.a(r8, r11)
            boolean r17 = r15.equals(r2)
            if (r17 == 0) goto L_0x01e4
            goto L_0x0385
        L_0x01e4:
            java.lang.String r3 = ":"
            java.lang.String r4 = defpackage.d4g.b(r8, r11)
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x01f2
            goto L_0x0385
        L_0x01f2:
            defpackage.d4g.c(r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
        L_0x01fb:
            java.lang.String r5 = ";"
            if (r4 != 0) goto L_0x0227
            int r0 = r8.b
            r22 = r4
            java.lang.String r4 = defpackage.d4g.b(r8, r11)
            if (r4 != 0) goto L_0x020b
            r0 = 0
            goto L_0x022b
        L_0x020b:
            boolean r18 = r13.equals(r4)
            if (r18 != 0) goto L_0x0220
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x0218
            goto L_0x0220
        L_0x0218:
            r3.append(r4)
            r0 = r19
            r4 = r22
            goto L_0x01fb
        L_0x0220:
            r8.G(r0)
            r4 = 1
            r0 = r19
            goto L_0x01fb
        L_0x0227:
            java.lang.String r0 = r3.toString()
        L_0x022b:
            if (r0 == 0) goto L_0x032c
            boolean r3 = r15.equals(r0)
            if (r3 == 0) goto L_0x0235
            goto L_0x032c
        L_0x0235:
            int r3 = r8.b
            java.lang.String r4 = defpackage.d4g.b(r8, r11)
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x0242
            goto L_0x024b
        L_0x0242:
            boolean r4 = r13.equals(r4)
            if (r4 == 0) goto L_0x032c
            r8.G(r3)
        L_0x024b:
            java.lang.String r3 = "color"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x025f
            r3 = 1
            int r0 = defpackage.k63.a(r0, r3)
            r10.f = r0
            r10.g = r3
        L_0x025c:
            r0 = r3
            goto L_0x0386
        L_0x025f:
            r3 = 1
            java.lang.String r4 = "background-color"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0271
            int r0 = defpackage.k63.a(r0, r3)
            r10.h = r0
            r10.i = r3
            goto L_0x025c
        L_0x0271:
            java.lang.String r4 = "ruby-position"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0292
            java.lang.String r2 = "over"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0285
            r10.p = r3
            goto L_0x032c
        L_0x0285:
            java.lang.String r2 = "under"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x032c
            r0 = 2
            r10.p = r0
            goto L_0x032c
        L_0x0292:
            java.lang.String r3 = "text-combine-upright"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x02b2
            java.lang.String r2 = "all"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x02ad
            java.lang.String r2 = "digits"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x02ab
            goto L_0x02ad
        L_0x02ab:
            r0 = 0
            goto L_0x02ae
        L_0x02ad:
            r0 = 1
        L_0x02ae:
            r10.q = r0
            goto L_0x032c
        L_0x02b2:
            java.lang.String r3 = "text-decoration"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x02c6
            java.lang.String r2 = "underline"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x032c
            r0 = 1
            r10.k = r0
            goto L_0x032c
        L_0x02c6:
            java.lang.String r3 = "font-family"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x02d5
            java.lang.String r0 = defpackage.lz7.T(r0)
            r10.e = r0
            goto L_0x032c
        L_0x02d5:
            java.lang.String r3 = "font-weight"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x02ea
            java.lang.String r2 = "bold"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x032c
            r3 = 1
            r10.l = r3
            goto L_0x025c
        L_0x02ea:
            r3 = 1
            java.lang.String r4 = "font-style"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x02fe
            java.lang.String r2 = "italic"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x025c
            r10.m = r3
            goto L_0x032c
        L_0x02fe:
            java.lang.String r3 = "font-size"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x032c
            java.lang.String r2 = defpackage.lz7.T(r0)
            java.util.regex.Pattern r3 = defpackage.d4g.d
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L_0x032e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid font-size: '"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "'."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            defpackage.z04.c0(r0)
        L_0x032c:
            r0 = 1
            goto L_0x0386
        L_0x032e:
            r0 = 2
            java.lang.String r3 = r2.group(r0)
            r3.getClass()
            int r0 = r3.hashCode()
            switch(r0) {
                case 37: goto L_0x0355;
                case 3240: goto L_0x034a;
                case 3592: goto L_0x033f;
                default: goto L_0x033d;
            }
        L_0x033d:
            r3 = -1
            goto L_0x035f
        L_0x033f:
            java.lang.String r0 = "px"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0348
            goto L_0x033d
        L_0x0348:
            r3 = 2
            goto L_0x035f
        L_0x034a:
            java.lang.String r0 = "em"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0353
            goto L_0x033d
        L_0x0353:
            r3 = 1
            goto L_0x035f
        L_0x0355:
            java.lang.String r0 = "%"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x035e
            goto L_0x033d
        L_0x035e:
            r3 = 0
        L_0x035f:
            switch(r3) {
                case 0: goto L_0x0372;
                case 1: goto L_0x036d;
                case 2: goto L_0x0368;
                default: goto L_0x0362;
            }
        L_0x0362:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0368:
            r0 = 1
            r10.n = r0
            r3 = 2
            goto L_0x0377
        L_0x036d:
            r0 = 1
            r3 = 2
            r10.n = r3
            goto L_0x0377
        L_0x0372:
            r0 = 1
            r3 = 2
            r4 = 3
            r10.n = r4
        L_0x0377:
            java.lang.String r2 = r2.group(r0)
            r2.getClass()
            float r2 = java.lang.Float.parseFloat(r2)
            r10.o = r2
            goto L_0x0387
        L_0x0385:
            r0 = r5
        L_0x0386:
            r3 = 2
        L_0x0387:
            r5 = r0
            r2 = r14
            r3 = 0
            r4 = -1
            r0 = r19
            goto L_0x01ba
        L_0x038f:
            r0 = r5
            r3 = 2
            boolean r2 = r13.equals(r9)
            if (r2 == 0) goto L_0x039a
            r12.add(r10)
        L_0x039a:
            r5 = r0
            r2 = r3
            r3 = 0
            r4 = -1
            r9 = 0
            r0 = r19
            goto L_0x00a0
        L_0x03a3:
            r1.addAll(r12)
        L_0x03a6:
            r5 = r0
            r2 = r3
            r3 = 0
            r4 = -1
            r0 = r19
            goto L_0x0030
        L_0x03ae:
            r0 = r19
            goto L_0x0083
        L_0x03b2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "A style block was found after the first cue."
            r0.<init>(r1)
            throw r0
        L_0x03ba:
            r3 = r2
            r0 = r5
            r2 = 3
            if (r8 != r2) goto L_0x03a6
            java.util.regex.Pattern r2 = defpackage.q4g.a
            java.nio.charset.Charset r2 = defpackage.b52.c
            java.lang.String r4 = r7.h(r2)
            if (r4 != 0) goto L_0x03cb
            r9 = 0
            goto L_0x03f7
        L_0x03cb:
            java.util.regex.Pattern r5 = defpackage.q4g.a
            java.util.regex.Matcher r8 = r5.matcher(r4)
            boolean r9 = r8.matches()
            if (r9 == 0) goto L_0x03dd
            r9 = 0
            h4g r9 = defpackage.q4g.d(r9, r8, r7, r1)
            goto L_0x03f7
        L_0x03dd:
            r9 = 0
            java.lang.String r2 = r7.h(r2)
            if (r2 != 0) goto L_0x03e5
            goto L_0x03f7
        L_0x03e5:
            java.util.regex.Matcher r2 = r5.matcher(r2)
            boolean r5 = r2.matches()
            if (r5 == 0) goto L_0x03f7
            java.lang.String r4 = r4.trim()
            h4g r9 = defpackage.q4g.d(r4, r2, r7, r1)
        L_0x03f7:
            if (r9 == 0) goto L_0x03a6
            r6.add(r9)
            goto L_0x03a6
        L_0x03fd:
            vq7 r0 = new vq7
            r0.<init>((java.util.ArrayList) r6)
            r1 = r23
            r2 = r24
            defpackage.z04.Y(r0, r1, r2)
            return
        L_0x040a:
            r0 = move-exception
            r1 = r0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdb.G(byte[], int, int, nbe, pj3):void");
    }

    public int J() {
        return 1;
    }

    public void a(Object obj) {
        n05 n05;
        switch (this.a) {
            case 2:
                n05 n052 = (n05) obj;
                Objects.toString(n052);
                if (n052 != null) {
                    adc adc = (adc) this.c;
                    ScheduledFuture scheduledFuture = adc.Y;
                    if (scheduledFuture != null && scheduledFuture.cancel(false) && (n05 = adc.F) != null && n05 == n052) {
                        adc.r(n05);
                    }
                    adc.b0 = (zm4) this.b;
                    adc.A((Surface) null);
                    adc.v(adc.o());
                    return;
                }
                return;
            default:
                Void voidR = (Void) obj;
                ((vje) this.c).b.E();
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.ybe b(long r19, java.util.ArrayList r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, defpackage.r7b r25, int r26) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            r9 = r23
            int r2 = r21.size()
            r3 = 1
            if (r2 != 0) goto L_0x0022
            ybe r10 = new ybe
            java.lang.String r6 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            r0 = r10
            r1 = r19
            r7 = r24
            r8 = r25
            r9 = r23
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)
            return r10
        L_0x0022:
            r2 = 0
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = defpackage.oag.t(r22)
            java.lang.Object r6 = r0.b
            b0d r6 = (defpackage.b0d) r6
            r7 = 0
            if (r5 != 0) goto L_0x003e
            r5 = r22
            boolean r8 = r6.h(r5, r9)
            if (r8 == 0) goto L_0x0040
            r10 = r5
            goto L_0x005f
        L_0x003e:
            r5 = r22
        L_0x0040:
            java.util.Iterator r8 = r21.iterator()
        L_0x0044:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x005e
            java.lang.Object r10 = r8.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r11 = defpackage.oag.d(r10, r4)
            if (r11 == 0) goto L_0x0057
            goto L_0x0044
        L_0x0057:
            boolean r11 = r6.h(r10, r9)
            if (r11 == 0) goto L_0x0044
            goto L_0x005f
        L_0x005e:
            r10 = r7
        L_0x005f:
            boolean r6 = defpackage.oag.t(r10)
            r8 = 1
            if (r6 == 0) goto L_0x0092
            boolean r6 = defpackage.oag.t(r22)
            if (r6 != 0) goto L_0x006e
            r7 = r5
            goto L_0x0093
        L_0x006e:
            java.util.Iterator r6 = r21.iterator()
        L_0x0072:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x008f
            java.lang.Object r10 = r6.next()
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0088 }
            boolean r11 = defpackage.oag.d(r11, r4)     // Catch:{ all -> 0x0088 }
            r11 = r11 ^ r8
            if (r11 == 0) goto L_0x0072
            r7 = r10
            goto L_0x008f
        L_0x0088:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x008f:
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0093
        L_0x0092:
            r7 = r10
        L_0x0093:
            boolean r6 = defpackage.oag.t(r22)
            if (r6 != 0) goto L_0x00a2
            r6 = r26
            if (r6 != r8) goto L_0x00a2
            java.lang.String r1 = r22.trim()
            goto L_0x00ac
        L_0x00a2:
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.trim()
        L_0x00ac:
            nu8 r2 = new nu8
            mu8 r14 = defpackage.mu8.a
            int r16 = r1.length()
            r13 = 0
            r15 = 0
            r17 = 0
            r10 = r2
            r11 = r19
            r10.<init>(r11, r13, r14, r15, r16, r17)
            boolean r5 = defpackage.oag.t(r22)
            if (r5 == 0) goto L_0x00d7
            boolean r5 = defpackage.oag.t(r1)
            if (r5 != 0) goto L_0x00d4
            java.lang.Object r0 = r0.c
            ida r0 = (defpackage.ida) r0
            java.lang.CharSequence r0 = r0.b(r1, r2, r8, r8)
        L_0x00d2:
            r6 = r0
            goto L_0x00d8
        L_0x00d4:
            java.lang.String r0 = ""
            goto L_0x00d2
        L_0x00d7:
            r6 = r1
        L_0x00d8:
            ybe r10 = new ybe
            r0 = r10
            r1 = r19
            r5 = r7
            r7 = r24
            r8 = r25
            r9 = r23
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdb.b(long, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, r7b, int):ybe");
    }

    public void c(JSONObject jSONObject) {
        ylc ylc;
        l7b l7b = (l7b) this.c;
        l7b.getClass();
        jpd jpd = null;
        try {
            bg1 a2 = bg1.a(jSONObject.getString("initiatorId"));
            String t = f8.t(jSONObject, "sharedUrl");
            ((yb9) l7b.c).getClass();
            ylc = new ylc(a2, t, yb9.e(jSONObject));
        } catch (JSONException e) {
            ((a4c) l7b.b).logException("UrlSharingParser", "Can't parse url sharing", e);
            ylc = null;
        }
        if (ylc != null) {
            String str = ylc.b;
            if (str != null) {
                jpd = new jpd(ylc.a, str);
            }
            ((j9f) this.b).onUrlSharingInfoUpdated(new zn1(ylc.c, jpd));
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.camera.core.ImageCaptureException, java.lang.Exception] */
    public void d(Throwable th) {
        switch (this.a) {
            case 2:
                Objects.toString(th);
                return;
            default:
                h7b h7b = (h7b) this.b;
                if (!((yhc) h7b.c).g) {
                    int a2 = ((kz1) ((List) h7b.b).get(0)).a();
                    boolean z = th instanceof ImageCaptureException;
                    vje vje = (vje) this.c;
                    if (z) {
                        jc6 jc6 = vje.c;
                        ec0 ec0 = new ec0(a2, (ImageCaptureException) th);
                        jc6.getClass();
                        kq0.e();
                        ((y90) jc6.X).k.accept(ec0);
                    } else {
                        jc6 jc62 = vje.c;
                        ec0 ec02 = new ec0(a2, new Exception("Failed to submit capture request", th));
                        jc62.getClass();
                        kq0.e();
                        ((y90) jc62.X).k.accept(ec02);
                    }
                    vje.b.E();
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v41, types: [gle, z9c] */
    public void e(gle gle) {
        z9c z9c;
        int indexOf;
        int indexOf2;
        gle gle2 = gle;
        yoa yoa = (yoa) this.b;
        short s = yoa.d;
        yb9 yb9 = sla.c;
        v9d v9d = (v9d) this.c;
        if (s == 1) {
            wle wle = (wle) v9d.b.u;
            wle.getClass();
            hm9.m("wle", "onPing", new Object[0]);
            mle mle = wle.o;
            if (mle != null) {
                ((yle) ((tle) mle).x0.getValue()).h();
            }
            x9d.c(v9d.b, new yoa((byte) 1, yoa.c, yoa.d, yoa.h, 0));
        } else if (s == 2) {
            wle wle2 = (wle) v9d.b.u;
            wle2.getClass();
            wle2.a(new vle(wle2, 2, (s44) gle2));
        } else if (s == 20) {
            wle wle3 = (wle) v9d.b.u;
            if (wle3.o != null) {
                hm9.m("wle", "onLogout", new Object[0]);
                ((ExecutorService) ((tle) wle3.o).y0.getValue()).execute(new ule(0, wle3));
            }
        } else if (s == 3) {
            boolean z = gle2 == gle.b;
            bs9 bs9 = v9d.b.u;
            if (z) {
                ? gle3 = new gle();
                gle3.o = true;
                z9c = gle3;
            } else {
                z9c = (z9c) gle2;
            }
            wle wle4 = (wle) bs9;
            wle4.getClass();
            String str = null;
            hm9.m("wle", "onReconnect: host=%s port=%s", (oag.t(z9c.c) || (indexOf2 = z9c.c.indexOf(":")) <= 0) ? null : z9c.c.substring(0, indexOf2), z9c.c());
            if (!oag.t(z9c.c)) {
                p7b p7b = (p7b) wle4.a;
                t33 t33 = p7b.a;
                if (!oag.t(z9c.c) && (indexOf = z9c.c.indexOf(":")) > 0) {
                    str = z9c.c.substring(0, indexOf);
                }
                t33.m("server.host", str);
                p7b.a.m("server.port", z9c.c());
                p7b.a.j("server.useTls", z9c.o);
            }
            tle tle = (tle) wle4.o;
            tle.getClass();
            hm9.m(tle.B0, "restart", new Object[0]);
            x9d x9d = (x9d) ((yle) tle.x0.getValue()).Y.get();
            if (x9d != null) {
                x9d.q(false);
            }
            ((ExecutorService) tle.z0.getValue()).execute(new u3c(29, tle));
        } else {
            sla sla = sla.NOTIF_MESSAGE;
            if (s == sla.a) {
                uxc uxc = v9d.b.o;
                uxc.getClass();
                if (!((t33) ((q33) uxc.a.c(q33.class))).G()) {
                    hs9 hs9 = (hs9) gle2;
                    x9d x9d2 = v9d.b;
                    gs9 gs9 = new gs9(sla, 0);
                    gs9.i(hs9.c, ApiProtocol.PARAM_CHAT_ID);
                    fs8 fs8 = hs9.X;
                    gs9.i(fs8.a, "messageId");
                    if (fs8.u0 == fy8.GROUP) {
                        gs9.p("chatType", "GROUP_CHAT");
                    }
                    x9d.c(x9d2, yoa.a(gs9, (byte) 1, yoa.c));
                    wle wle5 = (wle) v9d.b.u;
                    wle5.getClass();
                    wle5.a(new p00(wle5, 27, hs9));
                }
            } else if (s == sla.NOTIF_MARK.a) {
                wle wle6 = (wle) v9d.b.u;
                wle6.getClass();
                wle6.a(new p00(wle6, 25, (es9) gle2));
                ((yle) ((tle) wle6.o).x0.getValue()).h();
            } else if (s == sla.NOTIF_TYPING.a) {
                wle wle7 = (wle) v9d.b.u;
                wle7.getClass();
                wle7.a(new p00(wle7, 21, (at9) gle2));
            } else if (s == sla.NOTIF_PRESENCE.a) {
                wle wle8 = (wle) v9d.b.u;
                wle8.getClass();
                wle8.a(new p00(wle8, 29, (xs9) gle2));
            } else if (s == sla.NOTIF_CONTACT.a) {
                wle wle9 = (wle) v9d.b.u;
                wle9.getClass();
                wle9.a(new p00(wle9, 16, (vr9) gle2));
            } else if (s == sla.NOTIF_CONFIG.a) {
                wle wle10 = (wle) v9d.b.u;
                wle10.getClass();
                wle10.a(new p00(wle10, 17, (tr9) gle2));
            } else if (s == sla.NOTIF_CHAT.a) {
                wle wle11 = (wle) v9d.b.u;
                wle11.getClass();
                wle11.a(new p00(wle11, 20, (rr9) gle2));
            } else if (s == sla.NOTIF_ATTACH.a) {
                wle wle12 = (wle) v9d.b.u;
                wle12.getClass();
                wle12.a(new p00(wle12, 26, (nr9) gle2));
            } else if (s == sla.NOTIF_CALL_START.a) {
                or9 or9 = (or9) gle2;
                wle wle13 = (wle) v9d.b.u;
                if (!((n6a) wle13.j.getValue()).a()) {
                    wle13.a(new vle(wle13, 3, new yg1(or9.X, or9.Y, or9.c, "", "", or9.t0 == 3, or9.o)));
                }
            } else if (s == sla.NOTIF_CONTACT_SORT.a) {
                wle wle14 = (wle) v9d.b.u;
                wle14.getClass();
                wle14.a(new p00(wle14, 22, (wr9) gle2));
            } else if (s == sla.NOTIF_MSG_DELETE_RANGE.a) {
                wle wle15 = (wle) v9d.b.u;
                wle15.getClass();
                wle15.a(new vle(wle15, 4, (ss9) gle2));
            } else if (s == sla.NOTIF_MSG_DELETE.a) {
                wle wle16 = (wle) v9d.b.u;
                wle16.getClass();
                wle16.a(new p00(wle16, 18, (qs9) gle2));
            } else if (s == sla.NOTIF_MSG_REACTIONS_CHANGED.a) {
                wle wle17 = (wle) v9d.b.u;
                wle17.getClass();
                wle17.a(new vle(wle17, 0, (us9) gle2));
            } else if (s == sla.NOTIF_MSG_YOU_REACTED.a) {
                wle wle18 = (wle) v9d.b.u;
                wle18.getClass();
                wle18.a(new p00(wle18, 13, (ws9) gle2));
            } else if (s == sla.NOTIF_CALLBACK_ANSWER.a) {
                wle wle19 = (wle) v9d.b.u;
                wle19.getClass();
                wle19.a(new p00(wle19, 24, (pr9) gle2));
            } else if (s == sla.NOTIF_LOCATION_REQUEST.a) {
                wle wle20 = (wle) v9d.b.u;
                wle20.getClass();
                wle20.a(new e5(17, wle20));
            } else if (s == sla.NOTIF_LOCATION.a) {
                wle wle21 = (wle) v9d.b.u;
                wle21.getClass();
                wle21.a(new p00(wle21, 15, (cs9) gle2));
            } else if (s == sla.NOTIF_ASSETS_UPDATE.a) {
                wle wle22 = (wle) v9d.b.u;
                wle22.getClass();
                wle22.a(new p00(wle22, 28, (mr9) gle2));
            } else if (s == sla.NOTIF_DRAFT.a) {
                wle wle23 = (wle) v9d.b.u;
                wle23.getClass();
                wle23.a(new vle(wle23, 1, (yr9) gle2));
            } else if (s == sla.NOTIF_DRAFT_DISCARD.a) {
                wle wle24 = (wle) v9d.b.u;
                wle24.getClass();
                wle24.a(new p00(wle24, 19, (zr9) gle2));
            } else if (s == sla.NOTIF_MSG_DELAYED.a) {
                wle wle25 = (wle) v9d.b.u;
                wle25.getClass();
                wle25.a(new p00(wle25, 14, (ks9) gle2));
            } else if (s == sla.NOTIF_PROFILE.a) {
                wle wle26 = (wle) v9d.b.u;
                wle26.getClass();
                wle26.a(new p00(wle26, 23, (ys9) gle2));
            } else {
                sla.c.getClass();
                String concat = "Illegal state in handleNotif, unknown opcode ".concat(yb9.c(s));
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(concat);
                hm9.p(v9d.b.a, concat, illegalArgumentException);
                v9d.b.o(illegalArgumentException);
            }
        }
    }

    public void f() {
        byte[] bArr = maf.f;
        yaf yaf = (yaf) this.c;
        yaf.getClass();
        yaf.F(bArr.length, bArr);
    }

    public void g(pke pke) {
        IllegalStateException illegalStateException = new IllegalStateException("illegal state in handleNotif, onFail", pke.X);
        v9d v9d = (v9d) this.c;
        hm9.p(v9d.b.a, "illegal state in handleNotif, onFail", illegalStateException);
        v9d.b.o(illegalStateException);
    }

    public lm0 h(ra4 ra4, long j) {
        int f;
        lm0 lm0;
        ra4 ra42 = ra4;
        long j2 = ra42.o;
        int min = (int) Math.min(20000, ra42.c - j2);
        yaf yaf = (yaf) this.c;
        yaf.E(min);
        ra42.q(yaf.a, 0, min, false);
        int i = -1;
        int i2 = -1;
        long j3 = -9223372036854775807L;
        while (yaf.c() >= 4) {
            if (jm5.f(yaf.b, yaf.a) != 442) {
                yaf.I(1);
            } else {
                yaf.I(4);
                long f2 = opb.f(yaf);
                if (f2 != -9223372036854775807L) {
                    long b2 = ((sue) this.b).b(f2);
                    if (b2 > j) {
                        if (j3 == -9223372036854775807L) {
                            return new lm0(-1, b2, j2);
                        }
                        lm0 = new lm0(0, -9223372036854775807L, j2 + ((long) i2));
                    } else if (100000 + b2 > j) {
                        lm0 = new lm0(0, -9223372036854775807L, j2 + ((long) yaf.b));
                    } else {
                        i2 = yaf.b;
                        j3 = b2;
                    }
                    return lm0;
                }
                int i3 = yaf.c;
                if (yaf.c() >= 10) {
                    yaf.I(9);
                    int v = yaf.v() & 7;
                    if (yaf.c() >= v) {
                        yaf.I(v);
                        if (yaf.c() >= 4) {
                            if (jm5.f(yaf.b, yaf.a) == 443) {
                                yaf.I(4);
                                int A = yaf.A();
                                if (yaf.c() < A) {
                                    yaf.H(i3);
                                } else {
                                    yaf.I(A);
                                }
                            }
                            while (true) {
                                if (yaf.c() < 4 || (f = jm5.f(yaf.b, yaf.a)) == 442 || f == 441 || (f >>> 8) != 1) {
                                    break;
                                }
                                yaf.I(4);
                                if (yaf.c() < 2) {
                                    yaf.H(i3);
                                    break;
                                }
                                yaf.H(Math.min(yaf.c, yaf.b + yaf.A()));
                            }
                        } else {
                            yaf.H(i3);
                        }
                    } else {
                        yaf.H(i3);
                    }
                } else {
                    yaf.H(i3);
                }
                i = yaf.b;
            }
        }
        return j3 != -9223372036854775807L ? new lm0(-2, j3, j2 + ((long) i)) : lm0.d;
    }

    public long i() {
        return 0;
    }

    public yzd j(l7g l7g) {
        yzd yzd;
        synchronized (this.b) {
            yzd = (yzd) ((LinkedHashMap) this.c).remove(l7g);
        }
        return yzd;
    }

    public List k(String str) {
        List D0;
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
                    if (tpa.f(((l7g) entry.getKey()).a, str)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (l7g remove : linkedHashMap.keySet()) {
                    ((LinkedHashMap) this.c).remove(remove);
                }
                D0 = x53.D0(linkedHashMap.values());
            } finally {
            }
        }
        return D0;
    }

    public void l(Task task) {
        mkg mkg = (mkg) this.b;
        qne qne = (qne) this.c;
        synchronized (mkg.f) {
            mkg.e.remove(qne);
        }
    }

    public void m(b8c b8c, yic yic) {
        int i;
        boolean m = yic.m();
        l7b l7b = (l7b) this.b;
        if (m) {
            String U = yic.Z.U();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(U);
                JSONObject jSONObject2 = jSONObject.getJSONObject(MediaStreamTrack.VIDEO_TRACK_KIND);
                jSONObject2.getLong("duration");
                jSONObject2.getString("title");
                JSONObject jSONObject3 = jSONObject2.getJSONObject("owner");
                jSONObject3.optString("account_type");
                jSONObject3.optString("name");
                jSONObject3.optString("img");
                jSONObject3.optString("img_2x");
                jSONObject3.optString("url");
                jSONObject3.optLong("id");
                JSONObject jSONObject4 = jSONObject2.getJSONObject("thumbs");
                Iterator<String> keys = jSONObject4.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap2.put(next, jSONObject4.getString(next));
                }
                JSONArray jSONArray = jSONObject.getJSONObject("request").getJSONObject("files").getJSONArray("progressive");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject5 = jSONArray.getJSONObject(i2);
                    hashMap.put(jSONObject5.getString("quality"), jSONObject5.getString("url"));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            nqd nqd = (nqd) ((sqd) l7b.b);
            if (!nqd.h()) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    try {
                        i = Integer.parseInt(str.replace("p", ""));
                    } catch (Exception e2) {
                        hm9.p("ypf", "failed to parse quality string: " + str, e2);
                        i = 0;
                    }
                    arrayList.add(new df5(3, -1, i, 0, (String) entry.getValue()));
                }
                if (arrayList.isEmpty()) {
                    nqd.onError(new FetcherException(4, "No supported quality"));
                }
                ((ypf) l7b.c).getClass();
                nqd.a(new ff5("Vimeo", arrayList));
                return;
            }
            return;
        }
        ((qq9) this.c).getClass();
        int i3 = yic.o;
        if (i3 == 403) {
            new IOException("Video has restricted playback");
        } else if (i3 != 404) {
            new IOException("An unknown error occurred");
        } else {
            new IOException("Video could not be found");
        }
        l7b.j();
    }

    public yzd o(l7g l7g) {
        yzd yzd;
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                Object obj = linkedHashMap.get(l7g);
                if (obj == null) {
                    obj = new yzd(l7g);
                    linkedHashMap.put(l7g, obj);
                }
                yzd = (yzd) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return yzd;
    }

    public void q(b8c b8c, IOException iOException) {
        ((l7b) this.b).j();
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return ((String) this.b) + ", " + ((String) this.c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ bdb(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public bdb(pkg pkg, rw4 rw4, int i) {
        this.a = 15;
        this.c = pkg;
        this.b = rw4;
    }

    public bdb(q6d q6d) {
        this.a = 12;
        this.b = q6d;
        this.c = new AtomicInteger(0);
    }

    public bdb(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.b = new Object();
                this.c = new LinkedHashMap();
                return;
            case 9:
                this.b = new ConcurrentHashMap();
                this.c = new ReferenceQueue();
                return;
            case Protos.Attaches.Attach.LOCATION:
                this.b = new wpa();
                this.c = new d4g();
                return;
            default:
                return;
        }
    }

    public bdb(sue sue) {
        this.a = 1;
        this.b = sue;
        this.c = new yaf(3, false);
    }
}
