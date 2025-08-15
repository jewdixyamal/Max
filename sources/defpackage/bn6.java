package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$DeltaUpdateException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.protocol.HTTP;

/* renamed from: bn6  reason: default package */
public final class bn6 implements ypa {
    public static final Pattern A0 = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern B0 = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern C0 = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern D0 = a("CAN-SKIP-DATERANGES");
    public static final Pattern E0 = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern F0 = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern G0 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern H0 = a("CAN-BLOCK-RELOAD");
    public static final Pattern I0 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern J0 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern K0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern L0 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern M0 = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern N0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern O0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern P0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern Q0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern R0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern S0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern T0 = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern U0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern V0 = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern W0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern X = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern X0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern Y = Pattern.compile("SUBTITLES=\"(.+?)\"");
    public static final Pattern Y0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern Z = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern Z0 = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern a1 = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern b1 = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern c1 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern d1 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern e1 = a("AUTOSELECT");
    public static final Pattern f1 = a("DEFAULT");
    public static final Pattern g1 = a("FORCED");
    public static final Pattern h1 = a("INDEPENDENT");
    public static final Pattern i1 = a("GAP");
    public static final Pattern j1 = a("PRECISE");
    public static final Pattern k1 = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern l1 = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern m1 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern o = Pattern.compile("VIDEO=\"(.+?)\"");
    public static final Pattern s0 = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern t0 = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern u0 = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern v0 = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern w0 = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern x0 = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern y0 = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern z0 = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public final xm6 a;
    public final pm6 b;

    public bn6(xm6 xm6, pm6 pm6) {
        this.a = xm6;
        this.b = pm6;
    }

    public static Pattern a(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 9);
        sb.append(str);
        sb.append("=(NO|YES)");
        return Pattern.compile(sb.toString());
    }

    public static cr4 b(String str, ar4[] ar4Arr) {
        ar4[] ar4Arr2 = new ar4[ar4Arr.length];
        for (int i = 0; i < ar4Arr.length; i++) {
            ar4 ar4 = ar4Arr[i];
            ar4Arr2[i] = new ar4(ar4.b, ar4.c, ar4.o, (byte[]) null);
        }
        return new cr4(str, true, ar4Arr2);
    }

    public static ar4 c(String str, String str2, HashMap hashMap) {
        String j = j(str, U0, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = V0;
        if (equals) {
            String k = k(str, pattern, hashMap);
            return new ar4(bw0.d, (String) null, "video/mp4", Base64.decode(k.substring(k.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            UUID uuid = bw0.d;
            int i = maf.a;
            return new ar4(uuid, (String) null, "hls", str.getBytes(b52.c));
        } else if (!"com.microsoft.playready".equals(str2) || !"1".equals(j)) {
            return null;
        } else {
            String k2 = k(str, pattern, hashMap);
            byte[] decode = Base64.decode(k2.substring(k2.indexOf(44)), 0);
            UUID uuid2 = bw0.e;
            return new ar4(uuid2, (String) null, "video/mp4", wmd.e(uuid2, (UUID[]) null, decode));
        }
    }

    public static pm6 d(xm6 xm6, pm6 pm6, pl8 pl8, String str) {
        int i;
        String str2;
        gm6 gm6;
        HashMap hashMap;
        ArrayList arrayList;
        String str3;
        HashMap hashMap2;
        ArrayList arrayList2;
        long j;
        HashMap hashMap3;
        km6 km6;
        cr4 cr4;
        long j2;
        int i2;
        gm6 gm62;
        String str4;
        int i3;
        HashMap hashMap4;
        xm6 xm62 = xm6;
        pm6 pm62 = pm6;
        boolean z = xm62.c;
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        om6 om6 = new om6(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str5 = "";
        boolean z2 = z;
        om6 om62 = om6;
        String str6 = str5;
        long j3 = -1;
        int i4 = 0;
        boolean z3 = false;
        long j4 = -9223372036854775807L;
        long j5 = 0;
        boolean z4 = false;
        int i5 = 0;
        long j6 = 0;
        int i6 = 1;
        long j7 = -9223372036854775807L;
        long j8 = -9223372036854775807L;
        boolean z5 = false;
        cr4 cr42 = null;
        long j9 = 0;
        cr4 cr43 = null;
        long j10 = 0;
        long j11 = 0;
        boolean z6 = false;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i7 = 0;
        long j12 = 0;
        boolean z7 = false;
        km6 km62 = null;
        long j13 = 0;
        long j14 = 0;
        ArrayList arrayList7 = arrayList4;
        gm6 gm63 = null;
        while (pl8.B()) {
            String D = pl8.D();
            if (D.startsWith("#EXT")) {
                arrayList6.add(D);
            }
            if (D.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String k = k(D, B0, hashMap5);
                if ("VOD".equals(k)) {
                    i4 = 1;
                } else if ("EVENT".equals(k)) {
                    i4 = 2;
                }
            } else if (D.equals("#EXT-X-I-FRAMES-ONLY")) {
                z7 = true;
            } else {
                if (D.startsWith("#EXT-X-START")) {
                    Map emptyMap = Collections.emptyMap();
                    str2 = str5;
                    z3 = f(D, j1);
                    j4 = (long) (Double.parseDouble(k(D, N0, emptyMap)) * 1000000.0d);
                } else {
                    str2 = str5;
                    if (D.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double h = h(D, C0);
                        long j15 = h == -9.223372036854776E18d ? -9223372036854775807L : (long) (h * 1000000.0d);
                        boolean f = f(D, D0);
                        double h2 = h(D, F0);
                        long j16 = h2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (h2 * 1000000.0d);
                        double h3 = h(D, G0);
                        om62 = new om6(j15, f, j16, h3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (h3 * 1000000.0d), f(D, H0));
                    } else if (D.startsWith("#EXT-X-PART-INF")) {
                        j8 = (long) (Double.parseDouble(k(D, z0, Collections.emptyMap())) * 1000000.0d);
                    } else {
                        boolean startsWith = D.startsWith("#EXT-X-MAP");
                        Pattern pattern = P0;
                        boolean z8 = z3;
                        Pattern pattern2 = V0;
                        if (startsWith) {
                            String k2 = k(D, pattern2, hashMap5);
                            String j17 = j(D, pattern, (String) null, hashMap5);
                            if (j17 != null) {
                                int i8 = maf.a;
                                String[] split = j17.split("@", -1);
                                j3 = Long.parseLong(split[0]);
                                if (split.length > 1) {
                                    j9 = Long.parseLong(split[1]);
                                }
                            }
                            int i9 = (j3 > -1 ? 1 : (j3 == -1 ? 0 : -1));
                            if (i9 == 0) {
                                j9 = 0;
                            }
                            if (str7 == null || str8 != null) {
                                km62 = new km6(j9, j3, k2, str7, str8);
                                if (i9 != 0) {
                                    j9 += j3;
                                }
                                j3 = -1;
                                str5 = str2;
                                z3 = z8;
                            } else {
                                throw ParserException.b((Exception) null, "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                            }
                        } else {
                            ArrayList arrayList8 = arrayList7;
                            ArrayList arrayList9 = arrayList6;
                            if (D.startsWith("#EXT-X-TARGETDURATION")) {
                                j7 = ((long) Integer.parseInt(k(D, x0, Collections.emptyMap()))) * 1000000;
                            } else if (D.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j10 = Long.parseLong(k(D, I0, Collections.emptyMap()));
                                j6 = j10;
                            } else if (D.startsWith("#EXT-X-VERSION")) {
                                i6 = Integer.parseInt(k(D, A0, Collections.emptyMap()));
                            } else {
                                if (D.startsWith("#EXT-X-DEFINE")) {
                                    String j18 = j(D, l1, (String) null, hashMap5);
                                    if (j18 != null) {
                                        String str10 = (String) xm62.l.get(j18);
                                        if (str10 != null) {
                                            hashMap5.put(j18, str10);
                                        }
                                    } else {
                                        hashMap5.put(k(D, a1, hashMap5), k(D, k1, hashMap5));
                                    }
                                    hashMap = hashMap5;
                                    hashMap2 = hashMap6;
                                    gm6 = gm63;
                                    arrayList = arrayList8;
                                    str3 = str9;
                                    String str11 = str;
                                    xm62 = xm6;
                                    pm62 = pm6;
                                    hashMap6 = hashMap2;
                                    str9 = str3;
                                    arrayList2 = arrayList;
                                    hashMap5 = hashMap;
                                } else if (D.startsWith("#EXTINF")) {
                                    j13 = new BigDecimal(k(D, J0, Collections.emptyMap())).multiply(new BigDecimal(1000000)).longValue();
                                    String str12 = str2;
                                    str6 = j(D, K0, str12, hashMap5);
                                    str5 = str12;
                                    arrayList7 = arrayList8;
                                    z3 = z8;
                                    arrayList6 = arrayList9;
                                } else {
                                    String str13 = str2;
                                    if (D.startsWith("#EXT-X-SKIP")) {
                                        int parseInt = Integer.parseInt(k(D, E0, Collections.emptyMap()));
                                        np8.f(pm62 != null && arrayList3.isEmpty());
                                        int i10 = maf.a;
                                        int i11 = (int) (j6 - pm62.k);
                                        int i12 = parseInt + i11;
                                        if (i11 >= 0) {
                                            zw6 zw6 = pm62.r;
                                            if (i12 <= zw6.size()) {
                                                while (i11 < i12) {
                                                    km6 km63 = (km6) zw6.get(i11);
                                                    if (j6 != pm62.k) {
                                                        int i13 = (pm62.j - i5) + km63.o;
                                                        ArrayList arrayList10 = new ArrayList();
                                                        long j19 = j12;
                                                        int i14 = 0;
                                                        while (true) {
                                                            zw6 zw62 = km63.x0;
                                                            i3 = i12;
                                                            if (i14 >= zw62.size()) {
                                                                break;
                                                            }
                                                            gm6 gm64 = (gm6) zw62.get(i14);
                                                            arrayList10.add(new gm6(gm64.a, gm64.b, gm64.c, i13, j19, gm64.Y, gm64.Z, gm64.s0, gm64.t0, gm64.u0, gm64.v0, gm64.w0, gm64.x0));
                                                            j19 += gm64.c;
                                                            i14++;
                                                            hashMap6 = hashMap6;
                                                            i12 = i3;
                                                            str13 = str13;
                                                            gm63 = gm63;
                                                        }
                                                        gm62 = gm63;
                                                        str4 = str13;
                                                        hashMap4 = hashMap6;
                                                        km63 = new km6(km63.a, km63.b, km63.w0, km63.c, i13, j12, km63.Y, km63.Z, km63.s0, km63.t0, km63.u0, km63.v0, arrayList10);
                                                    } else {
                                                        gm62 = gm63;
                                                        i3 = i12;
                                                        str4 = str13;
                                                        hashMap4 = hashMap6;
                                                    }
                                                    arrayList3.add(km63);
                                                    j12 += km63.c;
                                                    long j20 = km63.u0;
                                                    if (j20 != -1) {
                                                        j9 = km63.t0 + j20;
                                                    }
                                                    String str14 = km63.s0;
                                                    if (str14 == null || !str14.equals(Long.toHexString(j10))) {
                                                        str8 = str14;
                                                    }
                                                    j10++;
                                                    i11++;
                                                    i7 = km63.o;
                                                    km62 = km63.b;
                                                    cr43 = km63.Y;
                                                    str7 = km63.Z;
                                                    hashMap6 = hashMap4;
                                                    i12 = i3;
                                                    j11 = j12;
                                                    str13 = str4;
                                                    gm63 = gm62;
                                                    xm6 xm63 = xm6;
                                                    pm62 = pm6;
                                                }
                                                gm6 gm65 = gm63;
                                                str2 = str13;
                                                xm62 = xm6;
                                                pm62 = pm6;
                                            }
                                        }
                                        throw new HlsPlaylistParser$DeltaUpdateException();
                                    }
                                    gm6 = gm63;
                                    str2 = str13;
                                    hashMap2 = hashMap6;
                                    if (D.startsWith("#EXT-X-KEY")) {
                                        String k3 = k(D, S0, hashMap5);
                                        String j21 = j(D, T0, HTTP.IDENTITY_CODING, hashMap5);
                                        if ("NONE".equals(k3)) {
                                            treeMap.clear();
                                            cr43 = null;
                                            str7 = null;
                                            str8 = null;
                                        } else {
                                            String j22 = j(D, W0, (String) null, hashMap5);
                                            if (!HTTP.IDENTITY_CODING.equals(j21)) {
                                                String str15 = str9;
                                                if (str15 == null) {
                                                    str9 = ("SAMPLE-AES-CENC".equals(k3) || "SAMPLE-AES-CTR".equals(k3)) ? "cenc" : "cbcs";
                                                } else {
                                                    str9 = str15;
                                                }
                                                ar4 c2 = c(D, j21, hashMap5);
                                                if (c2 != null) {
                                                    treeMap.put(j21, c2);
                                                    str8 = j22;
                                                    cr43 = null;
                                                    str7 = null;
                                                }
                                            } else if ("AES-128".equals(k3)) {
                                                str7 = k(D, pattern2, hashMap5);
                                                str8 = j22;
                                            }
                                            str8 = j22;
                                            str7 = null;
                                        }
                                        xm62 = xm6;
                                        pm62 = pm6;
                                        hashMap6 = hashMap2;
                                    } else {
                                        str3 = str9;
                                        if (D.startsWith("#EXT-X-BYTERANGE")) {
                                            String k4 = k(D, O0, hashMap5);
                                            int i15 = maf.a;
                                            String[] split2 = k4.split("@", -1);
                                            j3 = Long.parseLong(split2[0]);
                                            if (split2.length > 1) {
                                                j9 = Long.parseLong(split2[1]);
                                            }
                                        } else if (D.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i5 = Integer.parseInt(D.substring(D.indexOf(58) + 1));
                                            xm62 = xm6;
                                            pm62 = pm6;
                                            z4 = true;
                                            hashMap6 = hashMap2;
                                            str9 = str3;
                                        } else if (D.equals("#EXT-X-DISCONTINUITY")) {
                                            i7++;
                                        } else {
                                            if (D.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (j5 == 0) {
                                                    j5 = maf.D(maf.G(D.substring(D.indexOf(58) + 1))) - j12;
                                                } else {
                                                    String str16 = str;
                                                }
                                            } else if (D.equals("#EXT-X-GAP")) {
                                                xm62 = xm6;
                                                pm62 = pm6;
                                                hashMap6 = hashMap2;
                                                str9 = str3;
                                                arrayList7 = arrayList8;
                                                str5 = str2;
                                                z3 = z8;
                                                arrayList6 = arrayList9;
                                                gm63 = gm6;
                                                z6 = true;
                                            } else if (D.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                xm62 = xm6;
                                                pm62 = pm6;
                                                hashMap6 = hashMap2;
                                                str9 = str3;
                                                arrayList7 = arrayList8;
                                                str5 = str2;
                                                z3 = z8;
                                                arrayList6 = arrayList9;
                                                gm63 = gm6;
                                                z2 = true;
                                            } else if (D.equals("#EXT-X-ENDLIST")) {
                                                xm62 = xm6;
                                                pm62 = pm6;
                                                hashMap6 = hashMap2;
                                                str9 = str3;
                                                arrayList7 = arrayList8;
                                                str5 = str2;
                                                z3 = z8;
                                                arrayList6 = arrayList9;
                                                gm63 = gm6;
                                                z5 = true;
                                            } else if (D.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long i16 = i(D, L0);
                                                Matcher matcher = M0.matcher(D);
                                                if (matcher.find()) {
                                                    String group = matcher.group(1);
                                                    group.getClass();
                                                    i2 = Integer.parseInt(group);
                                                } else {
                                                    i2 = -1;
                                                }
                                                arrayList5.add(new im6(Uri.parse(kq0.D(str, k(D, pattern2, hashMap5))), i16, i2));
                                            } else {
                                                String str17 = str;
                                                if (D.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                    if (gm6 == null && "PART".equals(k(D, Y0, hashMap5))) {
                                                        String k5 = k(D, pattern2, hashMap5);
                                                        long i17 = i(D, Q0);
                                                        long i18 = i(D, R0);
                                                        String hexString = str7 == null ? null : str8 != null ? str8 : Long.toHexString(j10);
                                                        if (cr43 == null && !treeMap.isEmpty()) {
                                                            ar4[] ar4Arr = (ar4[]) treeMap.values().toArray(new ar4[0]);
                                                            cr4 cr44 = new cr4(str3, true, ar4Arr);
                                                            if (cr42 == null) {
                                                                cr42 = b(str3, ar4Arr);
                                                            }
                                                            cr43 = cr44;
                                                        }
                                                        int i19 = (i17 > -1 ? 1 : (i17 == -1 ? 0 : -1));
                                                        if (i19 == 0 || i18 != -1) {
                                                            gm6 = new gm6(k5, km62, 0, i7, j11, cr43, str7, hexString, i19 != 0 ? i17 : 0, i18, false, false, true);
                                                        }
                                                    }
                                                } else if (D.startsWith("#EXT-X-PART")) {
                                                    String hexString2 = str7 == null ? null : str8 != null ? str8 : Long.toHexString(j10);
                                                    String k6 = k(D, pattern2, hashMap5);
                                                    long parseDouble = (long) (Double.parseDouble(k(D, y0, Collections.emptyMap())) * 1000000.0d);
                                                    boolean f2 = f(D, h1) | (z2 && arrayList8.isEmpty());
                                                    boolean f3 = f(D, i1);
                                                    String j23 = j(D, pattern, (String) null, hashMap5);
                                                    if (j23 != null) {
                                                        int i20 = maf.a;
                                                        String[] split3 = j23.split("@", -1);
                                                        j2 = Long.parseLong(split3[0]);
                                                        if (split3.length > 1) {
                                                            j14 = Long.parseLong(split3[1]);
                                                        }
                                                    } else {
                                                        j2 = -1;
                                                    }
                                                    int i21 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
                                                    if (i21 == 0) {
                                                        j14 = 0;
                                                    }
                                                    if (cr43 == null && !treeMap.isEmpty()) {
                                                        ar4[] ar4Arr2 = (ar4[]) treeMap.values().toArray(new ar4[0]);
                                                        cr4 cr45 = new cr4(str3, true, ar4Arr2);
                                                        if (cr42 == null) {
                                                            cr42 = b(str3, ar4Arr2);
                                                        }
                                                        cr43 = cr45;
                                                    }
                                                    ArrayList arrayList11 = arrayList8;
                                                    arrayList11.add(new gm6(k6, km62, parseDouble, i7, j11, cr43, str7, hexString2, j14, j2, f3, f2, false));
                                                    j11 += parseDouble;
                                                    if (i21 != 0) {
                                                        j14 += j2;
                                                    }
                                                    xm62 = xm6;
                                                    pm62 = pm6;
                                                    hashMap6 = hashMap2;
                                                    str9 = str3;
                                                    arrayList2 = arrayList11;
                                                } else {
                                                    arrayList = arrayList8;
                                                    if (!D.startsWith("#")) {
                                                        String hexString3 = str7 == null ? null : str8 != null ? str8 : Long.toHexString(j10);
                                                        long j24 = j10 + 1;
                                                        String l = l(D, hashMap5);
                                                        km6 km64 = (km6) hashMap2.get(l);
                                                        int i22 = (j3 > -1 ? 1 : (j3 == -1 ? 0 : -1));
                                                        if (i22 == 0) {
                                                            j = 0;
                                                        } else {
                                                            if (z7 && km62 == null && km64 == null) {
                                                                km64 = new km6(0, j9, l, (String) null, (String) null);
                                                                hashMap2.put(l, km64);
                                                            }
                                                            j = j9;
                                                        }
                                                        if (cr43 != null || treeMap.isEmpty()) {
                                                            hashMap3 = hashMap5;
                                                            km6 = km64;
                                                            cr4 = cr43;
                                                        } else {
                                                            hashMap3 = hashMap5;
                                                            km6 = km64;
                                                            ar4[] ar4Arr3 = (ar4[]) treeMap.values().toArray(new ar4[0]);
                                                            cr4 = new cr4(str3, true, ar4Arr3);
                                                            if (cr42 == null) {
                                                                cr42 = b(str3, ar4Arr3);
                                                            }
                                                        }
                                                        arrayList3.add(new km6(l, km62 != null ? km62 : km6, str6, j13, i7, j12, cr4, str7, hexString3, j, j3, z6, arrayList));
                                                        j11 = j12 + j13;
                                                        ArrayList arrayList12 = new ArrayList();
                                                        if (i22 != 0) {
                                                            j += j3;
                                                        }
                                                        j9 = j;
                                                        pm62 = pm6;
                                                        arrayList7 = arrayList12;
                                                        hashMap6 = hashMap2;
                                                        str9 = str3;
                                                        cr43 = cr4;
                                                        j3 = -1;
                                                        j12 = j11;
                                                        j10 = j24;
                                                        hashMap5 = hashMap3;
                                                        str5 = str2;
                                                        str6 = str5;
                                                        z3 = z8;
                                                        arrayList6 = arrayList9;
                                                        gm63 = gm6;
                                                        z6 = false;
                                                        j13 = 0;
                                                        xm62 = xm6;
                                                    } else {
                                                        hashMap = hashMap5;
                                                        xm62 = xm6;
                                                        pm62 = pm6;
                                                        hashMap6 = hashMap2;
                                                        str9 = str3;
                                                        arrayList2 = arrayList;
                                                        hashMap5 = hashMap;
                                                    }
                                                }
                                            }
                                            hashMap = hashMap5;
                                            arrayList = arrayList8;
                                            xm62 = xm6;
                                            pm62 = pm6;
                                            hashMap6 = hashMap2;
                                            str9 = str3;
                                            arrayList2 = arrayList;
                                            hashMap5 = hashMap;
                                        }
                                        xm62 = xm6;
                                        pm62 = pm6;
                                        hashMap6 = hashMap2;
                                        str9 = str3;
                                    }
                                    arrayList2 = arrayList8;
                                }
                                str5 = str2;
                                z3 = z8;
                                arrayList6 = arrayList9;
                                gm63 = gm6;
                            }
                            arrayList7 = arrayList8;
                            str5 = str2;
                            z3 = z8;
                            arrayList6 = arrayList9;
                        }
                    }
                }
                str5 = str2;
            }
        }
        gm6 gm66 = gm63;
        ArrayList arrayList13 = arrayList7;
        ArrayList arrayList14 = arrayList6;
        boolean z9 = z3;
        String str18 = str;
        HashMap hashMap7 = new HashMap();
        int i23 = 0;
        while (i23 < arrayList5.size()) {
            im6 im6 = (im6) arrayList5.get(i23);
            long j25 = im6.b;
            if (j25 == -1) {
                j25 = (j6 + ((long) arrayList3.size())) - (arrayList13.isEmpty() ? 1 : 0);
            }
            int i24 = im6.c;
            if (i24 != -1 || j8 == -9223372036854775807L) {
                i = 1;
            } else {
                i = 1;
                i24 = (arrayList13.isEmpty() ? ((km6) mqd.m(arrayList3)).x0 : arrayList13).size() - 1;
            }
            Uri uri = im6.a;
            hashMap7.put(uri, new im6(uri, j25, i24));
            i23 += i;
        }
        if (gm66 != null) {
            arrayList13.add(gm66);
        }
        return new pm6(i4, str, arrayList14, j4, z9, j5, z4, i5, j6, i6, j7, j8, z2, z5, j5 != 0, cr42, arrayList3, arrayList13, om62, hashMap7);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04b9, code lost:
        r10 = r30;
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0552, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0553, code lost:
        r7 = r7 + r0;
        r1 = r39;
        r31 = r3;
        r30 = r10;
        r32 = r14;
        r0 = r22;
        r3 = r23;
        r15 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x015b, code lost:
        if (r8 > 0) goto L_0x0162;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.xm6 e(defpackage.pl8 r38, java.lang.String r39) {
        /*
            r1 = r39
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r16 = 0
            r17 = 0
        L_0x0038:
            boolean r18 = r38.B()
            java.lang.String r0 = "application/x-mpegURL"
            java.util.regex.Pattern r3 = V0
            java.util.regex.Pattern r15 = a1
            if (r18 == 0) goto L_0x022d
            java.lang.String r2 = r38.D()
            java.lang.String r4 = "#EXT"
            boolean r4 = r2.startsWith(r4)
            if (r4 == 0) goto L_0x0053
            r14.add(r2)
        L_0x0053:
            java.lang.String r4 = "#EXT-X-I-FRAME-STREAM-INF"
            boolean r4 = r2.startsWith(r4)
            r20 = r10
            java.lang.String r10 = "#EXT-X-DEFINE"
            boolean r10 = r2.startsWith(r10)
            if (r10 == 0) goto L_0x0072
            java.lang.String r0 = k(r2, r15, r11)
            java.util.regex.Pattern r3 = k1
            java.lang.String r2 = k(r2, r3, r11)
            r11.put(r0, r2)
            goto L_0x00e2
        L_0x0072:
            java.lang.String r10 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r10 = r2.equals(r10)
            if (r10 == 0) goto L_0x008b
            r4 = r5
            r32 = r7
            r31 = r8
            r30 = r9
            r33 = r12
            r21 = r13
            r29 = r14
            r16 = 1
            goto L_0x0214
        L_0x008b:
            java.lang.String r10 = "#EXT-X-MEDIA"
            boolean r10 = r2.startsWith(r10)
            if (r10 == 0) goto L_0x0097
            r12.add(r2)
            goto L_0x00e2
        L_0x0097:
            java.lang.String r10 = "#EXT-X-SESSION-KEY"
            boolean r10 = r2.startsWith(r10)
            if (r10 == 0) goto L_0x00d7
            java.util.regex.Pattern r0 = T0
            java.lang.String r3 = "identity"
            java.lang.String r0 = j(r2, r0, r3, r11)
            ar4 r0 = c(r2, r0, r11)
            if (r0 == 0) goto L_0x00e2
            java.util.regex.Pattern r3 = S0
            java.lang.String r2 = k(r2, r3, r11)
            java.lang.String r3 = "SAMPLE-AES-CENC"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x00c7
            java.lang.String r3 = "SAMPLE-AES-CTR"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00c4
            goto L_0x00c7
        L_0x00c4:
            java.lang.String r2 = "cbcs"
            goto L_0x00c9
        L_0x00c7:
            java.lang.String r2 = "cenc"
        L_0x00c9:
            cr4 r3 = new cr4
            ar4[] r0 = new defpackage.ar4[]{r0}
            r4 = 1
            r3.<init>(r2, r4, r0)
            r13.add(r3)
            goto L_0x00e2
        L_0x00d7:
            java.lang.String r10 = "#EXT-X-STREAM-INF"
            boolean r10 = r2.startsWith(r10)
            if (r10 != 0) goto L_0x00f1
            if (r4 == 0) goto L_0x00e2
            goto L_0x00f1
        L_0x00e2:
            r4 = r5
            r32 = r7
            r31 = r8
            r30 = r9
            r33 = r12
            r21 = r13
            r29 = r14
            goto L_0x0214
        L_0x00f1:
            java.lang.String r10 = "CLOSED-CAPTIONS=NONE"
            boolean r10 = r2.contains(r10)
            r17 = r17 | r10
            if (r4 == 0) goto L_0x00fe
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00ff
        L_0x00fe:
            r10 = 0
        L_0x00ff:
            java.util.Map r15 = java.util.Collections.emptyMap()
            r21 = r13
            java.util.regex.Pattern r13 = s0
            java.lang.String r13 = k(r2, r13, r15)
            int r13 = java.lang.Integer.parseInt(r13)
            java.util.regex.Pattern r15 = c
            java.util.regex.Matcher r15 = r15.matcher(r2)
            boolean r22 = r15.find()
            if (r22 == 0) goto L_0x012a
            r29 = r14
            r14 = 1
            java.lang.String r15 = r15.group(r14)
            r15.getClass()
            int r14 = java.lang.Integer.parseInt(r15)
            goto L_0x012d
        L_0x012a:
            r29 = r14
            r14 = -1
        L_0x012d:
            java.util.regex.Pattern r15 = u0
            r30 = r9
            r9 = 0
            java.lang.String r15 = j(r2, r15, r9, r11)
            r31 = r8
            java.util.regex.Pattern r8 = v0
            java.lang.String r8 = j(r2, r8, r9, r11)
            if (r8 == 0) goto L_0x015e
            int r9 = defpackage.maf.a
            java.lang.String r9 = "x"
            r32 = r7
            r7 = -1
            java.lang.String[] r8 = r8.split(r9, r7)
            r7 = 0
            r9 = r8[r7]
            int r7 = java.lang.Integer.parseInt(r9)
            r9 = 1
            r8 = r8[r9]
            int r8 = java.lang.Integer.parseInt(r8)
            if (r7 <= 0) goto L_0x0160
            if (r8 > 0) goto L_0x0162
            goto L_0x0160
        L_0x015e:
            r32 = r7
        L_0x0160:
            r7 = -1
            r8 = -1
        L_0x0162:
            java.util.regex.Pattern r9 = w0
            r33 = r12
            r12 = 0
            java.lang.String r9 = j(r2, r9, r12, r11)
            if (r9 == 0) goto L_0x0174
            float r9 = java.lang.Float.parseFloat(r9)
        L_0x0171:
            r34 = r5
            goto L_0x0177
        L_0x0174:
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0171
        L_0x0177:
            java.util.regex.Pattern r5 = o
            java.lang.String r5 = j(r2, r5, r12, r11)
            r35 = r5
            java.util.regex.Pattern r5 = X
            java.lang.String r5 = j(r2, r5, r12, r11)
            r36 = r5
            java.util.regex.Pattern r5 = Y
            java.lang.String r5 = j(r2, r5, r12, r11)
            r37 = r5
            java.util.regex.Pattern r5 = Z
            java.lang.String r5 = j(r2, r5, r12, r11)
            if (r4 == 0) goto L_0x01a0
            java.lang.String r2 = k(r2, r3, r11)
            android.net.Uri r2 = defpackage.kq0.F(r1, r2)
            goto L_0x01b2
        L_0x01a0:
            boolean r2 = r38.B()
            if (r2 == 0) goto L_0x0225
            java.lang.String r2 = r38.D()
            java.lang.String r2 = l(r2, r11)
            android.net.Uri r2 = defpackage.kq0.F(r1, r2)
        L_0x01b2:
            my5 r3 = new my5
            r3.<init>()
            int r4 = r6.size()
            java.lang.String r4 = java.lang.Integer.toString(r4)
            r3.a = r4
            r3.j = r0
            r3.h = r15
            r3.f = r14
            r3.g = r13
            r3.p = r7
            r3.q = r8
            r3.r = r9
            r3.e = r10
            oy5 r0 = new oy5
            r0.<init>(r3)
            vm6 r3 = new vm6
            r22 = r3
            r23 = r2
            r24 = r0
            r25 = r35
            r26 = r36
            r27 = r37
            r28 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r6.add(r3)
            r4 = r34
            java.lang.Object r0 = r4.get(r2)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L_0x01fe
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.put(r2, r0)
        L_0x01fe:
            un6 r2 = new un6
            r22 = r2
            r23 = r35
            r24 = r14
            r25 = r13
            r26 = r36
            r27 = r37
            r28 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r0.add(r2)
        L_0x0214:
            r5 = r4
            r10 = r20
            r13 = r21
            r14 = r29
            r9 = r30
            r8 = r31
            r7 = r32
            r12 = r33
            goto L_0x0038
        L_0x0225:
            java.lang.String r0 = "#EXT-X-STREAM-INF must be followed by another line"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.b(r1, r0)
            throw r0
        L_0x022d:
            r4 = r5
            r32 = r7
            r31 = r8
            r30 = r9
            r20 = r10
            r33 = r12
            r21 = r13
            r29 = r14
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r7 = 0
        L_0x0247:
            int r8 = r6.size()
            if (r7 >= r8) goto L_0x02b9
            java.lang.Object r8 = r6.get(r7)
            vm6 r8 = (defpackage.vm6) r8
            android.net.Uri r9 = r8.a
            boolean r9 = r2.add(r9)
            if (r9 == 0) goto L_0x02b2
            oy5 r9 = r8.b
            e99 r10 = r9.u0
            if (r10 != 0) goto L_0x0263
            r10 = 1
            goto L_0x0264
        L_0x0263:
            r10 = 0
        L_0x0264:
            defpackage.np8.f(r10)
            wn6 r10 = new wn6
            android.net.Uri r12 = r8.a
            java.lang.Object r12 = r4.get(r12)
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            r12.getClass()
            r13 = 0
            r10.<init>(r13, r13, r12)
            e99 r12 = new e99
            r13 = 1
            c99[] r14 = new defpackage.c99[r13]
            r13 = 0
            r14[r13] = r10
            r12.<init>((defpackage.c99[]) r14)
            my5 r9 = r9.a()
            r9.i = r12
            oy5 r10 = new oy5
            r10.<init>(r9)
            vm6 r9 = new vm6
            java.lang.String r12 = r8.e
            java.lang.String r13 = r8.f
            android.net.Uri r14 = r8.a
            r38 = r2
            java.lang.String r2 = r8.c
            java.lang.String r8 = r8.d
            r22 = r9
            r23 = r14
            r24 = r10
            r25 = r2
            r26 = r8
            r27 = r12
            r28 = r13
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r5.add(r9)
        L_0x02b0:
            r2 = 1
            goto L_0x02b5
        L_0x02b2:
            r38 = r2
            goto L_0x02b0
        L_0x02b5:
            int r7 = r7 + r2
            r2 = r38
            goto L_0x0247
        L_0x02b9:
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x02bc:
            int r2 = r33.size()
            if (r7 >= r2) goto L_0x0564
            r2 = r33
            java.lang.Object r4 = r2.get(r7)
            java.lang.String r4 = (java.lang.String) r4
            java.util.regex.Pattern r10 = b1
            java.lang.String r10 = k(r4, r10, r11)
            java.lang.String r12 = k(r4, r15, r11)
            my5 r13 = new my5
            r13.<init>()
            int r14 = r10.length()
            r19 = 1
            int r14 = r14 + 1
            int r22 = r12.length()
            int r14 = r22 + r14
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r14)
            r2.append(r10)
            java.lang.String r14 = ":"
            r2.append(r14)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            r13.a = r2
            r13.b = r12
            r13.j = r0
            java.util.regex.Pattern r2 = f1
            boolean r2 = f(r4, r2)
            java.util.regex.Pattern r14 = g1
            boolean r14 = f(r4, r14)
            if (r14 == 0) goto L_0x0311
            r14 = 2
            r2 = r2 | r14
        L_0x0311:
            java.util.regex.Pattern r14 = e1
            boolean r14 = f(r4, r14)
            if (r14 == 0) goto L_0x031b
            r2 = r2 | 4
        L_0x031b:
            r13.d = r2
            java.util.regex.Pattern r2 = c1
            r14 = 0
            java.lang.String r2 = j(r4, r2, r14, r11)
            boolean r14 = android.text.TextUtils.isEmpty(r2)
            if (r14 == 0) goto L_0x032e
            r22 = r0
            r14 = 0
            goto L_0x0364
        L_0x032e:
            int r14 = defpackage.maf.a
            java.lang.String r14 = ","
            r22 = r0
            r0 = -1
            java.lang.String[] r2 = r2.split(r14, r0)
            java.lang.String r14 = "public.accessibility.describes-video"
            boolean r14 = defpackage.maf.l(r2, r14)
            if (r14 == 0) goto L_0x0344
            r14 = 512(0x200, float:7.175E-43)
            goto L_0x0345
        L_0x0344:
            r14 = 0
        L_0x0345:
            java.lang.String r0 = "public.accessibility.transcribes-spoken-dialog"
            boolean r0 = defpackage.maf.l(r2, r0)
            if (r0 == 0) goto L_0x034f
            r14 = r14 | 4096(0x1000, float:5.74E-42)
        L_0x034f:
            java.lang.String r0 = "public.accessibility.describes-music-and-sound"
            boolean r0 = defpackage.maf.l(r2, r0)
            if (r0 == 0) goto L_0x0359
            r14 = r14 | 1024(0x400, float:1.435E-42)
        L_0x0359:
            java.lang.String r0 = "public.easy-to-read"
            boolean r0 = defpackage.maf.l(r2, r0)
            if (r0 == 0) goto L_0x0364
            r0 = r14 | 8192(0x2000, float:1.14794E-41)
            r14 = r0
        L_0x0364:
            r13.e = r14
            java.util.regex.Pattern r0 = Z0
            r2 = 0
            java.lang.String r0 = j(r4, r0, r2, r11)
            r13.c = r0
            java.lang.String r0 = j(r4, r3, r2, r11)
            if (r0 != 0) goto L_0x0377
            r0 = 0
            goto L_0x037b
        L_0x0377:
            android.net.Uri r0 = defpackage.kq0.F(r1, r0)
        L_0x037b:
            e99 r2 = new e99
            wn6 r14 = new wn6
            java.util.List r1 = java.util.Collections.emptyList()
            r14.<init>(r10, r12, r1)
            r23 = r3
            r1 = 1
            c99[] r3 = new defpackage.c99[r1]
            r1 = 0
            r3[r1] = r14
            r2.<init>((defpackage.c99[]) r3)
            java.util.regex.Pattern r1 = X0
            java.lang.String r1 = k(r4, r1, r11)
            int r3 = r1.hashCode()
            switch(r3) {
                case -959297733: goto L_0x03c1;
                case -333210994: goto L_0x03b6;
                case 62628790: goto L_0x03ab;
                case 81665115: goto L_0x03a0;
                default: goto L_0x039e;
            }
        L_0x039e:
            r1 = -1
            goto L_0x03cb
        L_0x03a0:
            java.lang.String r3 = "VIDEO"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03a9
            goto L_0x039e
        L_0x03a9:
            r1 = 3
            goto L_0x03cb
        L_0x03ab:
            java.lang.String r3 = "AUDIO"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03b4
            goto L_0x039e
        L_0x03b4:
            r1 = 2
            goto L_0x03cb
        L_0x03b6:
            java.lang.String r3 = "CLOSED-CAPTIONS"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03bf
            goto L_0x039e
        L_0x03bf:
            r1 = 1
            goto L_0x03cb
        L_0x03c1:
            java.lang.String r3 = "SUBTITLES"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03ca
            goto L_0x039e
        L_0x03ca:
            r1 = 0
        L_0x03cb:
            switch(r1) {
                case 0: goto L_0x0500;
                case 1: goto L_0x04bf;
                case 2: goto L_0x042d;
                case 3: goto L_0x03d9;
                default: goto L_0x03ce;
            }
        L_0x03ce:
            r24 = r15
            r10 = r30
            r3 = r31
            r14 = r32
        L_0x03d6:
            r4 = 3
            goto L_0x0552
        L_0x03d9:
            r1 = 0
        L_0x03da:
            int r3 = r6.size()
            if (r1 >= r3) goto L_0x03f2
            java.lang.Object r3 = r6.get(r1)
            vm6 r3 = (defpackage.vm6) r3
            java.lang.String r4 = r3.c
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x03ef
            goto L_0x03f3
        L_0x03ef:
            r3 = 1
            int r1 = r1 + r3
            goto L_0x03da
        L_0x03f2:
            r3 = 0
        L_0x03f3:
            if (r3 == 0) goto L_0x0412
            oy5 r1 = r3.b
            java.lang.String r3 = r1.t0
            r4 = 2
            java.lang.String r3 = defpackage.maf.q(r4, r3)
            r13.h = r3
            java.lang.String r3 = defpackage.ha9.c(r3)
            r13.k = r3
            int r3 = r1.B0
            r13.p = r3
            int r3 = r1.C0
            r13.q = r3
            float r1 = r1.D0
            r13.r = r1
        L_0x0412:
            if (r0 != 0) goto L_0x0415
            goto L_0x03ce
        L_0x0415:
            r13.i = r2
            tm6 r1 = new tm6
            oy5 r2 = new oy5
            r2.<init>(r13)
            r1.<init>(r0, r2, r12)
            r14 = r32
            r14.add(r1)
            r24 = r15
            r10 = r30
            r3 = r31
            goto L_0x03d6
        L_0x042d:
            r14 = r32
            r1 = 0
        L_0x0430:
            int r3 = r6.size()
            if (r1 >= r3) goto L_0x044e
            java.lang.Object r3 = r6.get(r1)
            vm6 r3 = (defpackage.vm6) r3
            r24 = r15
            java.lang.String r15 = r3.d
            boolean r15 = r10.equals(r15)
            if (r15 == 0) goto L_0x0449
            r1 = r3
            r3 = 1
            goto L_0x0452
        L_0x0449:
            r3 = 1
            int r1 = r1 + r3
            r15 = r24
            goto L_0x0430
        L_0x044e:
            r24 = r15
            r3 = 1
            r1 = 0
        L_0x0452:
            if (r1 == 0) goto L_0x0463
            oy5 r10 = r1.b
            java.lang.String r10 = r10.t0
            java.lang.String r10 = defpackage.maf.q(r3, r10)
            r13.h = r10
            java.lang.String r3 = defpackage.ha9.c(r10)
            goto L_0x0464
        L_0x0463:
            r3 = 0
        L_0x0464:
            java.util.regex.Pattern r10 = t0
            r15 = 0
            java.lang.String r4 = j(r4, r10, r15, r11)
            if (r4 == 0) goto L_0x0496
            int r10 = defpackage.maf.a
            java.lang.String r10 = "/"
            r15 = 2
            java.lang.String[] r10 = r4.split(r10, r15)
            r15 = 0
            r10 = r10[r15]
            int r10 = java.lang.Integer.parseInt(r10)
            r13.x = r10
            java.lang.String r10 = "audio/eac3"
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L_0x0497
            java.lang.String r10 = "/JOC"
            boolean r4 = r4.endsWith(r10)
            if (r4 == 0) goto L_0x0497
            java.lang.String r3 = "ec+3"
            r13.h = r3
            java.lang.String r3 = "audio/eac3-joc"
            goto L_0x0497
        L_0x0496:
            r15 = 0
        L_0x0497:
            r13.k = r3
            if (r0 == 0) goto L_0x04b0
            r13.i = r2
            tm6 r1 = new tm6
            oy5 r2 = new oy5
            r2.<init>(r13)
            r1.<init>(r0, r2, r12)
            r3 = r31
            r3.add(r1)
        L_0x04ac:
            r10 = r30
            goto L_0x03d6
        L_0x04b0:
            r3 = r31
            if (r1 == 0) goto L_0x04ac
            oy5 r8 = new oy5
            r8.<init>(r13)
        L_0x04b9:
            r10 = r30
            r0 = 1
            r4 = 3
            goto L_0x0553
        L_0x04bf:
            r24 = r15
            r3 = r31
            r14 = r32
            r15 = 0
            java.util.regex.Pattern r0 = d1
            java.lang.String r0 = k(r4, r0, r11)
            java.lang.String r1 = "CC"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x04e0
            r1 = 2
            java.lang.String r0 = r0.substring(r1)
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.String r2 = "application/cea-608"
            goto L_0x04ec
        L_0x04e0:
            r1 = 2
            r2 = 7
            java.lang.String r0 = r0.substring(r2)
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.String r2 = "application/cea-708"
        L_0x04ec:
            if (r9 != 0) goto L_0x04f3
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x04f3:
            r13.k = r2
            r13.C = r0
            oy5 r0 = new oy5
            r0.<init>(r13)
            r9.add(r0)
            goto L_0x04b9
        L_0x0500:
            r24 = r15
            r3 = r31
            r14 = r32
            r15 = 0
            r4 = r15
        L_0x0508:
            int r1 = r6.size()
            if (r4 >= r1) goto L_0x0521
            java.lang.Object r1 = r6.get(r4)
            vm6 r1 = (defpackage.vm6) r1
            java.lang.String r15 = r1.e
            boolean r15 = r10.equals(r15)
            if (r15 == 0) goto L_0x051d
            goto L_0x0522
        L_0x051d:
            r1 = 1
            int r4 = r4 + r1
            r15 = 0
            goto L_0x0508
        L_0x0521:
            r1 = 0
        L_0x0522:
            if (r1 == 0) goto L_0x0534
            oy5 r1 = r1.b
            java.lang.String r1 = r1.t0
            r4 = 3
            java.lang.String r1 = defpackage.maf.q(r4, r1)
            r13.h = r1
            java.lang.String r1 = defpackage.ha9.c(r1)
            goto L_0x0536
        L_0x0534:
            r4 = 3
            r1 = 0
        L_0x0536:
            if (r1 != 0) goto L_0x053a
            java.lang.String r1 = "text/vtt"
        L_0x053a:
            r13.k = r1
            r13.i = r2
            if (r0 == 0) goto L_0x0550
            tm6 r1 = new tm6
            oy5 r2 = new oy5
            r2.<init>(r13)
            r1.<init>(r0, r2, r12)
            r10 = r30
            r10.add(r1)
            goto L_0x0552
        L_0x0550:
            r10 = r30
        L_0x0552:
            r0 = 1
        L_0x0553:
            int r7 = r7 + r0
            r1 = r39
            r31 = r3
            r30 = r10
            r32 = r14
            r0 = r22
            r3 = r23
            r15 = r24
            goto L_0x02bc
        L_0x0564:
            r10 = r30
            r3 = r31
            r14 = r32
            if (r17 == 0) goto L_0x0571
            java.util.List r0 = java.util.Collections.emptyList()
            r9 = r0
        L_0x0571:
            xm6 r13 = new xm6
            r0 = r13
            r1 = r39
            r2 = r29
            r6 = r3
            r3 = r5
            r4 = r14
            r5 = r6
            r6 = r10
            r7 = r20
            r10 = r16
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn6.e(pl8, java.lang.String):xm6");
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String group = matcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static long i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String j(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map);
    }

    public static String k(String str, Pattern pattern, Map map) {
        String j = j(str, pattern, (String) null, map);
        if (j != null) {
            return j;
        }
        String pattern2 = pattern.pattern();
        StringBuilder sb = new StringBuilder(rh4.e(rh4.e(19, pattern2), str));
        sb.append("Couldn't match ");
        sb.append(pattern2);
        sb.append(" in ");
        sb.append(str);
        throw ParserException.b((Exception) null, sb.toString());
    }

    public static String l(String str, Map map) {
        Matcher matcher = m1.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0073 A[Catch:{ all -> 0x00a0 }, LOOP:3: B:39:0x0073->B:88:0x0073, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(android.net.Uri r9, defpackage.w24 r10) {
        /*
            r8 = this;
            r0 = 1
            java.io.BufferedReader r1 = new java.io.BufferedReader
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r2.<init>(r10)
            r1.<init>(r2)
            java.util.ArrayDeque r10 = new java.util.ArrayDeque
            r10.<init>()
            int r2 = r1.read()     // Catch:{ all -> 0x00a0 }
            r3 = 239(0xef, float:3.35E-43)
            r4 = 0
            if (r2 != r3) goto L_0x002e
            int r2 = r1.read()     // Catch:{ all -> 0x00a0 }
            r3 = 187(0xbb, float:2.62E-43)
            if (r2 != r3) goto L_0x0070
            int r2 = r1.read()     // Catch:{ all -> 0x00a0 }
            r3 = 191(0xbf, float:2.68E-43)
            if (r2 == r3) goto L_0x002a
            goto L_0x0070
        L_0x002a:
            int r2 = r1.read()     // Catch:{ all -> 0x00a0 }
        L_0x002e:
            r3 = -1
            if (r2 == r3) goto L_0x003c
            boolean r5 = java.lang.Character.isWhitespace(r2)     // Catch:{ all -> 0x00a0 }
            if (r5 == 0) goto L_0x003c
            int r2 = r1.read()     // Catch:{ all -> 0x00a0 }
            goto L_0x002e
        L_0x003c:
            r5 = r4
        L_0x003d:
            r6 = 7
            if (r5 >= r6) goto L_0x004f
            java.lang.String r6 = "#EXTM3U"
            char r6 = r6.charAt(r5)     // Catch:{ all -> 0x00a0 }
            if (r2 == r6) goto L_0x0049
            goto L_0x0070
        L_0x0049:
            int r2 = r1.read()     // Catch:{ all -> 0x00a0 }
            int r5 = r5 + r0
            goto L_0x003d
        L_0x004f:
            r5 = 13
            r6 = 10
            if (r2 == r3) goto L_0x0067
            boolean r7 = java.lang.Character.isWhitespace(r2)     // Catch:{ all -> 0x00a0 }
            if (r7 == 0) goto L_0x0067
            int r7 = defpackage.maf.a     // Catch:{ all -> 0x00a0 }
            if (r2 == r6) goto L_0x0067
            if (r2 != r5) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            int r2 = r1.read()     // Catch:{ all -> 0x00a0 }
            goto L_0x004f
        L_0x0067:
            int r3 = defpackage.maf.a     // Catch:{ all -> 0x00a0 }
            if (r2 == r6) goto L_0x006f
            if (r2 != r5) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r0 = r4
        L_0x006f:
            r4 = r0
        L_0x0070:
            r0 = 0
            if (r4 == 0) goto L_0x0107
        L_0x0073:
            java.lang.String r2 = r1.readLine()     // Catch:{ all -> 0x00a0 }
            if (r2 == 0) goto L_0x00fd
            java.lang.String r2 = r2.trim()     // Catch:{ all -> 0x00a0 }
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x0084
            goto L_0x0073
        L_0x0084:
            java.lang.String r3 = "#EXT-X-STREAM-INF"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x00a2
            r10.add(r2)     // Catch:{ all -> 0x00a0 }
            pl8 r8 = new pl8     // Catch:{ all -> 0x00a0 }
            r8.<init>((java.util.ArrayDeque) r10, (java.io.BufferedReader) r1)     // Catch:{ all -> 0x00a0 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00a0 }
            xm6 r8 = e(r8, r9)     // Catch:{ all -> 0x00a0 }
        L_0x009c:
            defpackage.maf.h(r1)
            goto L_0x00fc
        L_0x00a0:
            r8 = move-exception
            goto L_0x010e
        L_0x00a2:
            java.lang.String r3 = "#EXT-X-TARGETDURATION"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x00a0 }
            if (r3 != 0) goto L_0x00e7
            java.lang.String r3 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x00a0 }
            if (r3 != 0) goto L_0x00e7
            java.lang.String r3 = "#EXTINF"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x00a0 }
            if (r3 != 0) goto L_0x00e7
            java.lang.String r3 = "#EXT-X-KEY"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x00a0 }
            if (r3 != 0) goto L_0x00e7
            java.lang.String r3 = "#EXT-X-BYTERANGE"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x00a0 }
            if (r3 != 0) goto L_0x00e7
            java.lang.String r3 = "#EXT-X-DISCONTINUITY"
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x00a0 }
            if (r3 != 0) goto L_0x00e7
            java.lang.String r3 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x00a0 }
            if (r3 != 0) goto L_0x00e7
            java.lang.String r3 = "#EXT-X-ENDLIST"
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x00e3
            goto L_0x00e7
        L_0x00e3:
            r10.add(r2)     // Catch:{ all -> 0x00a0 }
            goto L_0x0073
        L_0x00e7:
            r10.add(r2)     // Catch:{ all -> 0x00a0 }
            xm6 r0 = r8.a     // Catch:{ all -> 0x00a0 }
            pm6 r8 = r8.b     // Catch:{ all -> 0x00a0 }
            pl8 r2 = new pl8     // Catch:{ all -> 0x00a0 }
            r2.<init>((java.util.ArrayDeque) r10, (java.io.BufferedReader) r1)     // Catch:{ all -> 0x00a0 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00a0 }
            pm6 r8 = d(r0, r8, r2, r9)     // Catch:{ all -> 0x00a0 }
            goto L_0x009c
        L_0x00fc:
            return r8
        L_0x00fd:
            defpackage.maf.h(r1)
            java.lang.String r8 = "Failed to parse the playlist, could not identify any tags."
            com.google.android.exoplayer2.ParserException r8 = com.google.android.exoplayer2.ParserException.b(r0, r8)
            throw r8
        L_0x0107:
            java.lang.String r8 = "Input does not start with the #EXTM3U header."
            com.google.android.exoplayer2.ParserException r8 = com.google.android.exoplayer2.ParserException.b(r0, r8)     // Catch:{ all -> 0x00a0 }
            throw r8     // Catch:{ all -> 0x00a0 }
        L_0x010e:
            defpackage.maf.h(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn6.g(android.net.Uri, w24):java.lang.Object");
    }
}
