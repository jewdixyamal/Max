package defpackage;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$DeltaUpdateException;
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

/* renamed from: cn6  reason: default package */
public final class cn6 implements zpa {
    public static final Pattern A0 = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern B0 = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern C0 = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern D0 = b("CAN-SKIP-DATERANGES");
    public static final Pattern E0 = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern F0 = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern G0 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern H0 = b("CAN-BLOCK-RELOAD");
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
    public static final Pattern e1 = b("AUTOSELECT");
    public static final Pattern f1 = b("DEFAULT");
    public static final Pattern g1 = b("FORCED");
    public static final Pattern h1 = b("INDEPENDENT");
    public static final Pattern i1 = b("GAP");
    public static final Pattern j1 = b("PRECISE");
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
    public final ym6 a;
    public final qm6 b;

    public cn6() {
        this(ym6.l, (qm6) null);
    }

    public static Pattern b(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static dr4 c(String str, br4[] br4Arr) {
        br4[] br4Arr2 = new br4[br4Arr.length];
        for (int i = 0; i < br4Arr.length; i++) {
            br4 br4 = br4Arr[i];
            br4Arr2[i] = new br4(br4.b, br4.c, br4.o, (byte[]) null);
        }
        return new dr4(str, true, br4Arr2);
    }

    public static br4 d(String str, String str2, HashMap hashMap) {
        String j = j(str, U0, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = V0;
        if (equals) {
            String k = k(str, pattern, hashMap);
            return new br4(ew0.d, (String) null, "video/mp4", Base64.decode(k.substring(k.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            UUID uuid = ew0.d;
            int i = oaf.a;
            return new br4(uuid, (String) null, "hls", str.getBytes(b52.c));
        } else if (!"com.microsoft.playready".equals(str2) || !"1".equals(j)) {
            return null;
        } else {
            String k2 = k(str, pattern, hashMap);
            byte[] decode = Base64.decode(k2.substring(k2.indexOf(44)), 0);
            UUID uuid2 = ew0.e;
            return new br4(uuid2, (String) null, "video/mp4", mqd.b(uuid2, (UUID[]) null, decode));
        }
    }

    public static qm6 e(ym6 ym6, qm6 qm6, adb adb, String str) {
        int i;
        String str2;
        hm6 hm6;
        HashMap hashMap;
        ArrayList arrayList;
        String str3;
        HashMap hashMap2;
        ArrayList arrayList2;
        long j;
        HashMap hashMap3;
        lm6 lm6;
        dr4 dr4;
        long j2;
        int i2;
        hm6 hm62;
        String str4;
        int i3;
        HashMap hashMap4;
        ym6 ym62 = ym6;
        qm6 qm62 = qm6;
        boolean z = ym62.c;
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
        dr4 dr42 = null;
        long j9 = 0;
        dr4 dr43 = null;
        long j10 = 0;
        long j11 = 0;
        boolean z6 = false;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i7 = 0;
        long j12 = 0;
        boolean z7 = false;
        lm6 lm62 = null;
        long j13 = 0;
        long j14 = 0;
        ArrayList arrayList7 = arrayList4;
        hm6 hm63 = null;
        while (adb.r()) {
            String u = adb.u();
            if (u.startsWith("#EXT")) {
                arrayList6.add(u);
            }
            if (u.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String k = k(u, B0, hashMap5);
                if ("VOD".equals(k)) {
                    i4 = 1;
                } else if ("EVENT".equals(k)) {
                    i4 = 2;
                }
            } else if (u.equals("#EXT-X-I-FRAMES-ONLY")) {
                z7 = true;
            } else {
                if (u.startsWith("#EXT-X-START")) {
                    Map emptyMap = Collections.emptyMap();
                    str2 = str5;
                    z3 = g(u, j1);
                    j4 = (long) (Double.parseDouble(k(u, N0, emptyMap)) * 1000000.0d);
                } else {
                    str2 = str5;
                    if (u.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double h = h(u, C0);
                        long j15 = h == -9.223372036854776E18d ? -9223372036854775807L : (long) (h * 1000000.0d);
                        boolean g = g(u, D0);
                        double h2 = h(u, F0);
                        long j16 = h2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (h2 * 1000000.0d);
                        double h3 = h(u, G0);
                        om62 = new om6(j15, g, j16, h3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (h3 * 1000000.0d), g(u, H0));
                    } else if (u.startsWith("#EXT-X-PART-INF")) {
                        j8 = (long) (Double.parseDouble(k(u, z0, Collections.emptyMap())) * 1000000.0d);
                    } else {
                        boolean startsWith = u.startsWith("#EXT-X-MAP");
                        Pattern pattern = P0;
                        boolean z8 = z3;
                        Pattern pattern2 = V0;
                        if (startsWith) {
                            String k2 = k(u, pattern2, hashMap5);
                            String j17 = j(u, pattern, (String) null, hashMap5);
                            if (j17 != null) {
                                int i8 = oaf.a;
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
                                lm62 = new lm6(j9, j3, k2, str7, str8);
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
                            if (u.startsWith("#EXT-X-TARGETDURATION")) {
                                j7 = ((long) Integer.parseInt(k(u, x0, Collections.emptyMap()))) * 1000000;
                            } else if (u.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j10 = Long.parseLong(k(u, I0, Collections.emptyMap()));
                                j6 = j10;
                            } else if (u.startsWith("#EXT-X-VERSION")) {
                                i6 = Integer.parseInt(k(u, A0, Collections.emptyMap()));
                            } else {
                                if (u.startsWith("#EXT-X-DEFINE")) {
                                    String j18 = j(u, l1, (String) null, hashMap5);
                                    if (j18 != null) {
                                        String str10 = (String) ym62.j.get(j18);
                                        if (str10 != null) {
                                            hashMap5.put(j18, str10);
                                        }
                                    } else {
                                        hashMap5.put(k(u, a1, hashMap5), k(u, k1, hashMap5));
                                    }
                                    hashMap = hashMap5;
                                    hashMap2 = hashMap6;
                                    hm6 = hm63;
                                    arrayList = arrayList8;
                                    str3 = str9;
                                    String str11 = str;
                                    ym62 = ym6;
                                    qm62 = qm6;
                                    hashMap6 = hashMap2;
                                    str9 = str3;
                                    arrayList2 = arrayList;
                                    hashMap5 = hashMap;
                                } else if (u.startsWith("#EXTINF")) {
                                    j13 = new BigDecimal(k(u, J0, Collections.emptyMap())).multiply(new BigDecimal(1000000)).longValue();
                                    String str12 = str2;
                                    str6 = j(u, K0, str12, hashMap5);
                                    str5 = str12;
                                    arrayList7 = arrayList8;
                                    z3 = z8;
                                    arrayList6 = arrayList9;
                                } else {
                                    String str13 = str2;
                                    if (u.startsWith("#EXT-X-SKIP")) {
                                        int parseInt = Integer.parseInt(k(u, E0, Collections.emptyMap()));
                                        fm9.k(qm62 != null && arrayList3.isEmpty());
                                        int i10 = oaf.a;
                                        int i11 = (int) (j6 - qm62.k);
                                        int i12 = parseInt + i11;
                                        if (i11 >= 0) {
                                            zw6 zw6 = qm62.r;
                                            if (i12 <= zw6.size()) {
                                                while (i11 < i12) {
                                                    lm6 lm63 = (lm6) zw6.get(i11);
                                                    if (j6 != qm62.k) {
                                                        int i13 = (qm62.j - i5) + lm63.o;
                                                        ArrayList arrayList10 = new ArrayList();
                                                        long j19 = j12;
                                                        int i14 = 0;
                                                        while (true) {
                                                            zw6 zw62 = lm63.x0;
                                                            i3 = i12;
                                                            if (i14 >= zw62.size()) {
                                                                break;
                                                            }
                                                            hm6 hm64 = (hm6) zw62.get(i14);
                                                            arrayList10.add(new hm6(hm64.a, hm64.b, hm64.c, i13, j19, hm64.Y, hm64.Z, hm64.s0, hm64.t0, hm64.u0, hm64.v0, hm64.w0, hm64.x0));
                                                            j19 += hm64.c;
                                                            i14++;
                                                            hashMap6 = hashMap6;
                                                            i12 = i3;
                                                            str13 = str13;
                                                            hm63 = hm63;
                                                        }
                                                        hm62 = hm63;
                                                        str4 = str13;
                                                        hashMap4 = hashMap6;
                                                        lm63 = new lm6(lm63.a, lm63.b, lm63.w0, lm63.c, i13, j12, lm63.Y, lm63.Z, lm63.s0, lm63.t0, lm63.u0, lm63.v0, arrayList10);
                                                    } else {
                                                        hm62 = hm63;
                                                        i3 = i12;
                                                        str4 = str13;
                                                        hashMap4 = hashMap6;
                                                    }
                                                    arrayList3.add(lm63);
                                                    j12 += lm63.c;
                                                    long j20 = lm63.u0;
                                                    if (j20 != -1) {
                                                        j9 = lm63.t0 + j20;
                                                    }
                                                    String str14 = lm63.s0;
                                                    if (str14 == null || !str14.equals(Long.toHexString(j10))) {
                                                        str8 = str14;
                                                    }
                                                    j10++;
                                                    i11++;
                                                    i7 = lm63.o;
                                                    lm62 = lm63.b;
                                                    dr43 = lm63.Y;
                                                    str7 = lm63.Z;
                                                    hashMap6 = hashMap4;
                                                    i12 = i3;
                                                    j11 = j12;
                                                    str13 = str4;
                                                    hm63 = hm62;
                                                    ym6 ym63 = ym6;
                                                    qm62 = qm6;
                                                }
                                                hm6 hm65 = hm63;
                                                str2 = str13;
                                                ym62 = ym6;
                                                qm62 = qm6;
                                            }
                                        }
                                        throw new HlsPlaylistParser$DeltaUpdateException();
                                    }
                                    hm6 = hm63;
                                    str2 = str13;
                                    hashMap2 = hashMap6;
                                    if (u.startsWith("#EXT-X-KEY")) {
                                        String k3 = k(u, S0, hashMap5);
                                        String j21 = j(u, T0, HTTP.IDENTITY_CODING, hashMap5);
                                        if ("NONE".equals(k3)) {
                                            treeMap.clear();
                                            dr43 = null;
                                            str7 = null;
                                            str8 = null;
                                        } else {
                                            String j22 = j(u, W0, (String) null, hashMap5);
                                            if (!HTTP.IDENTITY_CODING.equals(j21)) {
                                                String str15 = str9;
                                                if (str15 == null) {
                                                    str9 = ("SAMPLE-AES-CENC".equals(k3) || "SAMPLE-AES-CTR".equals(k3)) ? "cenc" : "cbcs";
                                                } else {
                                                    str9 = str15;
                                                }
                                                br4 d = d(u, j21, hashMap5);
                                                if (d != null) {
                                                    treeMap.put(j21, d);
                                                    str8 = j22;
                                                    dr43 = null;
                                                    str7 = null;
                                                }
                                            } else if ("AES-128".equals(k3)) {
                                                str7 = k(u, pattern2, hashMap5);
                                                str8 = j22;
                                            }
                                            str8 = j22;
                                            str7 = null;
                                        }
                                        ym62 = ym6;
                                        qm62 = qm6;
                                        hashMap6 = hashMap2;
                                    } else {
                                        str3 = str9;
                                        if (u.startsWith("#EXT-X-BYTERANGE")) {
                                            String k4 = k(u, O0, hashMap5);
                                            int i15 = oaf.a;
                                            String[] split2 = k4.split("@", -1);
                                            j3 = Long.parseLong(split2[0]);
                                            if (split2.length > 1) {
                                                j9 = Long.parseLong(split2[1]);
                                            }
                                        } else if (u.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i5 = Integer.parseInt(u.substring(u.indexOf(58) + 1));
                                            ym62 = ym6;
                                            qm62 = qm6;
                                            z4 = true;
                                            hashMap6 = hashMap2;
                                            str9 = str3;
                                        } else if (u.equals("#EXT-X-DISCONTINUITY")) {
                                            i7++;
                                        } else {
                                            if (u.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (j5 == 0) {
                                                    j5 = oaf.S(oaf.V(u.substring(u.indexOf(58) + 1))) - j12;
                                                } else {
                                                    String str16 = str;
                                                }
                                            } else if (u.equals("#EXT-X-GAP")) {
                                                ym62 = ym6;
                                                qm62 = qm6;
                                                hashMap6 = hashMap2;
                                                str9 = str3;
                                                arrayList7 = arrayList8;
                                                str5 = str2;
                                                z3 = z8;
                                                arrayList6 = arrayList9;
                                                hm63 = hm6;
                                                z6 = true;
                                            } else if (u.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                ym62 = ym6;
                                                qm62 = qm6;
                                                hashMap6 = hashMap2;
                                                str9 = str3;
                                                arrayList7 = arrayList8;
                                                str5 = str2;
                                                z3 = z8;
                                                arrayList6 = arrayList9;
                                                hm63 = hm6;
                                                z2 = true;
                                            } else if (u.equals("#EXT-X-ENDLIST")) {
                                                ym62 = ym6;
                                                qm62 = qm6;
                                                hashMap6 = hashMap2;
                                                str9 = str3;
                                                arrayList7 = arrayList8;
                                                str5 = str2;
                                                z3 = z8;
                                                arrayList6 = arrayList9;
                                                hm63 = hm6;
                                                z5 = true;
                                            } else if (u.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long i16 = i(u, L0);
                                                Matcher matcher = M0.matcher(u);
                                                if (matcher.find()) {
                                                    String group = matcher.group(1);
                                                    group.getClass();
                                                    i2 = Integer.parseInt(group);
                                                } else {
                                                    i2 = -1;
                                                }
                                                arrayList5.add(new jm6(Uri.parse(mr0.R(str, k(u, pattern2, hashMap5))), i16, i2));
                                            } else {
                                                String str17 = str;
                                                if (u.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                    if (hm6 == null && "PART".equals(k(u, Y0, hashMap5))) {
                                                        String k5 = k(u, pattern2, hashMap5);
                                                        long i17 = i(u, Q0);
                                                        long i18 = i(u, R0);
                                                        String hexString = str7 == null ? null : str8 != null ? str8 : Long.toHexString(j10);
                                                        if (dr43 == null && !treeMap.isEmpty()) {
                                                            br4[] br4Arr = (br4[]) treeMap.values().toArray(new br4[0]);
                                                            dr4 dr44 = new dr4(str3, true, br4Arr);
                                                            if (dr42 == null) {
                                                                dr42 = c(str3, br4Arr);
                                                            }
                                                            dr43 = dr44;
                                                        }
                                                        int i19 = (i17 > -1 ? 1 : (i17 == -1 ? 0 : -1));
                                                        if (i19 == 0 || i18 != -1) {
                                                            hm6 = new hm6(k5, lm62, 0, i7, j11, dr43, str7, hexString, i19 != 0 ? i17 : 0, i18, false, false, true);
                                                        }
                                                    }
                                                } else if (u.startsWith("#EXT-X-PART")) {
                                                    String hexString2 = str7 == null ? null : str8 != null ? str8 : Long.toHexString(j10);
                                                    String k6 = k(u, pattern2, hashMap5);
                                                    long parseDouble = (long) (Double.parseDouble(k(u, y0, Collections.emptyMap())) * 1000000.0d);
                                                    boolean g2 = g(u, h1) | (z2 && arrayList8.isEmpty());
                                                    boolean g3 = g(u, i1);
                                                    String j23 = j(u, pattern, (String) null, hashMap5);
                                                    if (j23 != null) {
                                                        int i20 = oaf.a;
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
                                                    if (dr43 == null && !treeMap.isEmpty()) {
                                                        br4[] br4Arr2 = (br4[]) treeMap.values().toArray(new br4[0]);
                                                        dr4 dr45 = new dr4(str3, true, br4Arr2);
                                                        if (dr42 == null) {
                                                            dr42 = c(str3, br4Arr2);
                                                        }
                                                        dr43 = dr45;
                                                    }
                                                    ArrayList arrayList11 = arrayList8;
                                                    arrayList11.add(new hm6(k6, lm62, parseDouble, i7, j11, dr43, str7, hexString2, j14, j2, g3, g2, false));
                                                    j11 += parseDouble;
                                                    if (i21 != 0) {
                                                        j14 += j2;
                                                    }
                                                    ym62 = ym6;
                                                    qm62 = qm6;
                                                    hashMap6 = hashMap2;
                                                    str9 = str3;
                                                    arrayList2 = arrayList11;
                                                } else {
                                                    arrayList = arrayList8;
                                                    if (!u.startsWith("#")) {
                                                        String hexString3 = str7 == null ? null : str8 != null ? str8 : Long.toHexString(j10);
                                                        long j24 = j10 + 1;
                                                        String l = l(u, hashMap5);
                                                        lm6 lm64 = (lm6) hashMap2.get(l);
                                                        int i22 = (j3 > -1 ? 1 : (j3 == -1 ? 0 : -1));
                                                        if (i22 == 0) {
                                                            j = 0;
                                                        } else {
                                                            if (z7 && lm62 == null && lm64 == null) {
                                                                lm64 = new lm6(0, j9, l, (String) null, (String) null);
                                                                hashMap2.put(l, lm64);
                                                            }
                                                            j = j9;
                                                        }
                                                        if (dr43 != null || treeMap.isEmpty()) {
                                                            hashMap3 = hashMap5;
                                                            lm6 = lm64;
                                                            dr4 = dr43;
                                                        } else {
                                                            hashMap3 = hashMap5;
                                                            lm6 = lm64;
                                                            br4[] br4Arr3 = (br4[]) treeMap.values().toArray(new br4[0]);
                                                            dr4 = new dr4(str3, true, br4Arr3);
                                                            if (dr42 == null) {
                                                                dr42 = c(str3, br4Arr3);
                                                            }
                                                        }
                                                        arrayList3.add(new lm6(l, lm62 != null ? lm62 : lm6, str6, j13, i7, j12, dr4, str7, hexString3, j, j3, z6, arrayList));
                                                        j11 = j12 + j13;
                                                        ArrayList arrayList12 = new ArrayList();
                                                        if (i22 != 0) {
                                                            j += j3;
                                                        }
                                                        j9 = j;
                                                        qm62 = qm6;
                                                        arrayList7 = arrayList12;
                                                        hashMap6 = hashMap2;
                                                        str9 = str3;
                                                        dr43 = dr4;
                                                        j3 = -1;
                                                        j12 = j11;
                                                        j10 = j24;
                                                        hashMap5 = hashMap3;
                                                        str5 = str2;
                                                        str6 = str5;
                                                        z3 = z8;
                                                        arrayList6 = arrayList9;
                                                        hm63 = hm6;
                                                        z6 = false;
                                                        j13 = 0;
                                                        ym62 = ym6;
                                                    } else {
                                                        hashMap = hashMap5;
                                                        ym62 = ym6;
                                                        qm62 = qm6;
                                                        hashMap6 = hashMap2;
                                                        str9 = str3;
                                                        arrayList2 = arrayList;
                                                        hashMap5 = hashMap;
                                                    }
                                                }
                                            }
                                            hashMap = hashMap5;
                                            arrayList = arrayList8;
                                            ym62 = ym6;
                                            qm62 = qm6;
                                            hashMap6 = hashMap2;
                                            str9 = str3;
                                            arrayList2 = arrayList;
                                            hashMap5 = hashMap;
                                        }
                                        ym62 = ym6;
                                        qm62 = qm6;
                                        hashMap6 = hashMap2;
                                        str9 = str3;
                                    }
                                    arrayList2 = arrayList8;
                                }
                                str5 = str2;
                                z3 = z8;
                                arrayList6 = arrayList9;
                                hm63 = hm6;
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
        hm6 hm66 = hm63;
        ArrayList arrayList13 = arrayList7;
        ArrayList arrayList14 = arrayList6;
        boolean z9 = z3;
        String str18 = str;
        HashMap hashMap7 = new HashMap();
        int i23 = 0;
        while (i23 < arrayList5.size()) {
            jm6 jm6 = (jm6) arrayList5.get(i23);
            long j25 = jm6.b;
            if (j25 == -1) {
                j25 = (j6 + ((long) arrayList3.size())) - (arrayList13.isEmpty() ? 1 : 0);
            }
            int i24 = jm6.c;
            if (i24 != -1 || j8 == -9223372036854775807L) {
                i = 1;
            } else {
                i = 1;
                i24 = (arrayList13.isEmpty() ? ((lm6) mqd.m(arrayList3)).x0 : arrayList13).size() - 1;
            }
            Uri uri = jm6.a;
            hashMap7.put(uri, new jm6(uri, j25, i24));
            i23 += i;
        }
        if (hm66 != null) {
            arrayList13.add(hm66);
        }
        return new qm6(i4, str, arrayList14, j4, z9, j5, z4, i5, j6, i6, j7, j8, z2, z5, j5 != 0, dr42, arrayList3, arrayList13, om62, hashMap7);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04a9, code lost:
        r7 = r31;
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0553, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0554, code lost:
        r8 = r8 + r0;
        r1 = r39;
        r32 = r3;
        r31 = r7;
        r33 = r15;
        r0 = r22;
        r3 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x015d, code lost:
        if (r9 > 0) goto L_0x0164;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ym6 f(defpackage.adb r38, java.lang.String r39) {
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
            boolean r18 = r38.r()
            java.lang.String r19 = "application/x-mpegURL"
            java.util.regex.Pattern r0 = V0
            java.util.regex.Pattern r3 = a1
            if (r18 == 0) goto L_0x0233
            java.lang.String r2 = r38.u()
            java.lang.String r15 = "#EXT"
            boolean r15 = r2.startsWith(r15)
            if (r15 == 0) goto L_0x0053
            r14.add(r2)
        L_0x0053:
            java.lang.String r15 = "#EXT-X-I-FRAME-STREAM-INF"
            boolean r15 = r2.startsWith(r15)
            java.lang.String r4 = "#EXT-X-DEFINE"
            boolean r4 = r2.startsWith(r4)
            if (r4 == 0) goto L_0x0070
            java.lang.String r0 = k(r2, r3, r11)
            java.util.regex.Pattern r3 = k1
            java.lang.String r2 = k(r2, r3, r11)
            r11.put(r0, r2)
            goto L_0x00e2
        L_0x0070:
            java.lang.String r3 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x008b
            r2 = r5
            r33 = r7
            r32 = r8
            r31 = r9
            r29 = r10
            r34 = r12
            r21 = r13
            r30 = r14
            r16 = 1
            goto L_0x021a
        L_0x008b:
            java.lang.String r3 = "#EXT-X-MEDIA"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0097
            r12.add(r2)
            goto L_0x00e2
        L_0x0097:
            java.lang.String r3 = "#EXT-X-SESSION-KEY"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x00d7
            java.util.regex.Pattern r0 = T0
            java.lang.String r3 = "identity"
            java.lang.String r0 = j(r2, r0, r3, r11)
            br4 r0 = d(r2, r0, r11)
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
            dr4 r3 = new dr4
            br4[] r0 = new defpackage.br4[]{r0}
            r4 = 1
            r3.<init>(r2, r4, r0)
            r13.add(r3)
            goto L_0x00e2
        L_0x00d7:
            java.lang.String r3 = "#EXT-X-STREAM-INF"
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L_0x00f3
            if (r15 == 0) goto L_0x00e2
            goto L_0x00f3
        L_0x00e2:
            r2 = r5
            r33 = r7
            r32 = r8
            r31 = r9
            r29 = r10
            r34 = r12
            r21 = r13
            r30 = r14
            goto L_0x021a
        L_0x00f3:
            java.lang.String r3 = "CLOSED-CAPTIONS=NONE"
            boolean r3 = r2.contains(r3)
            r17 = r17 | r3
            if (r15 == 0) goto L_0x0100
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0101
        L_0x0100:
            r3 = 0
        L_0x0101:
            java.util.Map r4 = java.util.Collections.emptyMap()
            r21 = r13
            java.util.regex.Pattern r13 = s0
            java.lang.String r4 = k(r2, r13, r4)
            int r4 = java.lang.Integer.parseInt(r4)
            java.util.regex.Pattern r13 = c
            java.util.regex.Matcher r13 = r13.matcher(r2)
            boolean r22 = r13.find()
            if (r22 == 0) goto L_0x012c
            r29 = r10
            r10 = 1
            java.lang.String r13 = r13.group(r10)
            r13.getClass()
            int r10 = java.lang.Integer.parseInt(r13)
            goto L_0x012f
        L_0x012c:
            r29 = r10
            r10 = -1
        L_0x012f:
            java.util.regex.Pattern r13 = u0
            r30 = r14
            r14 = 0
            java.lang.String r13 = j(r2, r13, r14, r11)
            r31 = r9
            java.util.regex.Pattern r9 = v0
            java.lang.String r9 = j(r2, r9, r14, r11)
            if (r9 == 0) goto L_0x0160
            int r14 = defpackage.oaf.a
            java.lang.String r14 = "x"
            r32 = r8
            r8 = -1
            java.lang.String[] r9 = r9.split(r14, r8)
            r8 = 0
            r14 = r9[r8]
            int r8 = java.lang.Integer.parseInt(r14)
            r14 = 1
            r9 = r9[r14]
            int r9 = java.lang.Integer.parseInt(r9)
            if (r8 <= 0) goto L_0x0162
            if (r9 > 0) goto L_0x0164
            goto L_0x0162
        L_0x0160:
            r32 = r8
        L_0x0162:
            r8 = -1
            r9 = -1
        L_0x0164:
            java.util.regex.Pattern r14 = w0
            r33 = r7
            r7 = 0
            java.lang.String r14 = j(r2, r14, r7, r11)
            if (r14 == 0) goto L_0x0176
            float r14 = java.lang.Float.parseFloat(r14)
        L_0x0173:
            r34 = r12
            goto L_0x0179
        L_0x0176:
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0173
        L_0x0179:
            java.util.regex.Pattern r12 = o
            java.lang.String r12 = j(r2, r12, r7, r11)
            r35 = r5
            java.util.regex.Pattern r5 = X
            java.lang.String r5 = j(r2, r5, r7, r11)
            r36 = r5
            java.util.regex.Pattern r5 = Y
            java.lang.String r5 = j(r2, r5, r7, r11)
            r37 = r5
            java.util.regex.Pattern r5 = Z
            java.lang.String r5 = j(r2, r5, r7, r11)
            if (r15 == 0) goto L_0x01a2
            java.lang.String r0 = k(r2, r0, r11)
            android.net.Uri r0 = defpackage.mr0.S(r1, r0)
            goto L_0x01b4
        L_0x01a2:
            boolean r0 = r38.r()
            if (r0 == 0) goto L_0x022b
            java.lang.String r0 = r38.u()
            java.lang.String r0 = l(r0, r11)
            android.net.Uri r0 = defpackage.mr0.S(r1, r0)
        L_0x01b4:
            ny5 r2 = new ny5
            r2.<init>()
            int r7 = r6.size()
            java.lang.String r7 = java.lang.Integer.toString(r7)
            r2.a = r7
            java.lang.String r7 = defpackage.ia9.l(r19)
            r2.l = r7
            r2.i = r13
            r2.g = r10
            r2.h = r4
            r2.s = r8
            r2.t = r9
            r2.u = r14
            r2.f = r3
            qy5 r3 = new qy5
            r3.<init>(r2)
            wm6 r2 = new wm6
            r22 = r2
            r23 = r0
            r24 = r3
            r25 = r12
            r26 = r36
            r27 = r37
            r28 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r6.add(r2)
            r2 = r35
            java.lang.Object r3 = r2.get(r0)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 != 0) goto L_0x0204
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.put(r0, r3)
        L_0x0204:
            vn6 r0 = new vn6
            r22 = r0
            r23 = r12
            r24 = r10
            r25 = r4
            r26 = r36
            r27 = r37
            r28 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r3.add(r0)
        L_0x021a:
            r5 = r2
            r13 = r21
            r10 = r29
            r14 = r30
            r9 = r31
            r8 = r32
            r7 = r33
            r12 = r34
            goto L_0x0038
        L_0x022b:
            java.lang.String r0 = "#EXT-X-STREAM-INF must be followed by another line"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.b(r1, r0)
            throw r0
        L_0x0233:
            r2 = r5
            r33 = r7
            r32 = r8
            r31 = r9
            r29 = r10
            r34 = r12
            r21 = r13
            r30 = r14
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r7 = 0
        L_0x024d:
            int r8 = r6.size()
            if (r7 >= r8) goto L_0x02b7
            java.lang.Object r8 = r6.get(r7)
            wm6 r8 = (defpackage.wm6) r8
            android.net.Uri r9 = r8.a
            boolean r9 = r5.add(r9)
            if (r9 == 0) goto L_0x02b4
            qy5 r9 = r8.b
            f99 r10 = r9.k
            if (r10 != 0) goto L_0x0269
            r10 = 1
            goto L_0x026a
        L_0x0269:
            r10 = 0
        L_0x026a:
            defpackage.fm9.k(r10)
            xn6 r10 = new xn6
            android.net.Uri r12 = r8.a
            java.lang.Object r12 = r2.get(r12)
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            r12.getClass()
            r13 = 0
            r10.<init>(r13, r13, r12)
            f99 r12 = new f99
            r13 = 1
            d99[] r14 = new defpackage.d99[r13]
            r13 = 0
            r14[r13] = r10
            r12.<init>((defpackage.d99[]) r14)
            ny5 r9 = r9.a()
            r9.j = r12
            qy5 r10 = new qy5
            r10.<init>(r9)
            wm6 r9 = new wm6
            java.lang.String r12 = r8.e
            java.lang.String r13 = r8.f
            android.net.Uri r14 = r8.a
            java.lang.String r15 = r8.c
            java.lang.String r8 = r8.d
            r22 = r9
            r23 = r14
            r24 = r10
            r25 = r15
            r26 = r8
            r27 = r12
            r28 = r13
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r4.add(r9)
        L_0x02b4:
            r8 = 1
            int r7 = r7 + r8
            goto L_0x024d
        L_0x02b7:
            r8 = 0
            r9 = 0
            r14 = 0
        L_0x02ba:
            int r2 = r34.size()
            if (r8 >= r2) goto L_0x0563
            r2 = r34
            java.lang.Object r5 = r2.get(r8)
            java.lang.String r5 = (java.lang.String) r5
            java.util.regex.Pattern r7 = b1
            java.lang.String r7 = k(r5, r7, r11)
            java.lang.String r10 = k(r5, r3, r11)
            ny5 r12 = new ny5
            r12.<init>()
            java.lang.String r13 = ":"
            java.lang.String r13 = defpackage.rh4.j(r7, r13, r10)
            r12.a = r13
            r12.b = r10
            java.lang.String r13 = defpackage.ia9.l(r19)
            r12.l = r13
            java.util.regex.Pattern r13 = f1
            boolean r13 = g(r5, r13)
            java.util.regex.Pattern r15 = g1
            boolean r15 = g(r5, r15)
            if (r15 == 0) goto L_0x02f7
            r15 = 2
            r13 = r13 | r15
        L_0x02f7:
            java.util.regex.Pattern r15 = e1
            boolean r15 = g(r5, r15)
            if (r15 == 0) goto L_0x0301
            r13 = r13 | 4
        L_0x0301:
            r12.e = r13
            java.util.regex.Pattern r13 = c1
            r15 = 0
            java.lang.String r13 = j(r5, r13, r15, r11)
            boolean r15 = android.text.TextUtils.isEmpty(r13)
            if (r15 == 0) goto L_0x0314
            r34 = r2
            r15 = 0
            goto L_0x034a
        L_0x0314:
            int r15 = defpackage.oaf.a
            java.lang.String r15 = ","
            r34 = r2
            r2 = -1
            java.lang.String[] r13 = r13.split(r15, r2)
            java.lang.String r15 = "public.accessibility.describes-video"
            boolean r15 = defpackage.oaf.m(r13, r15)
            if (r15 == 0) goto L_0x032a
            r15 = 512(0x200, float:7.175E-43)
            goto L_0x032b
        L_0x032a:
            r15 = 0
        L_0x032b:
            java.lang.String r2 = "public.accessibility.transcribes-spoken-dialog"
            boolean r2 = defpackage.oaf.m(r13, r2)
            if (r2 == 0) goto L_0x0335
            r15 = r15 | 4096(0x1000, float:5.74E-42)
        L_0x0335:
            java.lang.String r2 = "public.accessibility.describes-music-and-sound"
            boolean r2 = defpackage.oaf.m(r13, r2)
            if (r2 == 0) goto L_0x033f
            r15 = r15 | 1024(0x400, float:1.435E-42)
        L_0x033f:
            java.lang.String r2 = "public.easy-to-read"
            boolean r2 = defpackage.oaf.m(r13, r2)
            if (r2 == 0) goto L_0x034a
            r2 = r15 | 8192(0x2000, float:1.14794E-41)
            r15 = r2
        L_0x034a:
            r12.f = r15
            java.util.regex.Pattern r2 = Z0
            r13 = 0
            java.lang.String r2 = j(r5, r2, r13, r11)
            r12.d = r2
            java.lang.String r2 = j(r5, r0, r13, r11)
            if (r2 != 0) goto L_0x035d
            r2 = 0
            goto L_0x0361
        L_0x035d:
            android.net.Uri r2 = defpackage.mr0.S(r1, r2)
        L_0x0361:
            f99 r13 = new f99
            xn6 r15 = new xn6
            r22 = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r15.<init>(r7, r10, r0)
            r0 = 1
            d99[] r1 = new defpackage.d99[r0]
            r0 = 0
            r1[r0] = r15
            r13.<init>((defpackage.d99[]) r1)
            java.util.regex.Pattern r0 = X0
            java.lang.String r0 = k(r5, r0, r11)
            int r1 = r0.hashCode()
            switch(r1) {
                case -959297733: goto L_0x03a7;
                case -333210994: goto L_0x039c;
                case 62628790: goto L_0x0391;
                case 81665115: goto L_0x0386;
                default: goto L_0x0384;
            }
        L_0x0384:
            r0 = -1
            goto L_0x03b1
        L_0x0386:
            java.lang.String r1 = "VIDEO"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x038f
            goto L_0x0384
        L_0x038f:
            r0 = 3
            goto L_0x03b1
        L_0x0391:
            java.lang.String r1 = "AUDIO"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x039a
            goto L_0x0384
        L_0x039a:
            r0 = 2
            goto L_0x03b1
        L_0x039c:
            java.lang.String r1 = "CLOSED-CAPTIONS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03a5
            goto L_0x0384
        L_0x03a5:
            r0 = 1
            goto L_0x03b1
        L_0x03a7:
            java.lang.String r1 = "SUBTITLES"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03b0
            goto L_0x0384
        L_0x03b0:
            r0 = 0
        L_0x03b1:
            switch(r0) {
                case 0: goto L_0x04f5;
                case 1: goto L_0x04af;
                case 2: goto L_0x0419;
                case 3: goto L_0x03c1;
                default: goto L_0x03b4;
            }
        L_0x03b4:
            r23 = r3
            r7 = r31
            r3 = r32
            r15 = r33
        L_0x03bc:
            r1 = 3
            r20 = 0
            goto L_0x0553
        L_0x03c1:
            r0 = 0
        L_0x03c2:
            int r1 = r6.size()
            if (r0 >= r1) goto L_0x03da
            java.lang.Object r1 = r6.get(r0)
            wm6 r1 = (defpackage.wm6) r1
            java.lang.String r5 = r1.c
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x03d7
            goto L_0x03db
        L_0x03d7:
            r1 = 1
            int r0 = r0 + r1
            goto L_0x03c2
        L_0x03da:
            r1 = 0
        L_0x03db:
            if (r1 == 0) goto L_0x03fe
            qy5 r0 = r1.b
            java.lang.String r1 = r0.j
            r5 = 2
            java.lang.String r1 = defpackage.oaf.v(r5, r1)
            r12.i = r1
            java.lang.String r1 = defpackage.ia9.c(r1)
            java.lang.String r1 = defpackage.ia9.l(r1)
            r12.m = r1
            int r1 = r0.t
            r12.s = r1
            int r1 = r0.u
            r12.t = r1
            float r0 = r0.v
            r12.u = r0
        L_0x03fe:
            if (r2 != 0) goto L_0x0401
            goto L_0x03b4
        L_0x0401:
            r12.j = r13
            um6 r0 = new um6
            qy5 r1 = new qy5
            r1.<init>(r12)
            r0.<init>(r2, r1, r10)
            r15 = r33
            r15.add(r0)
            r23 = r3
            r7 = r31
            r3 = r32
            goto L_0x03bc
        L_0x0419:
            r15 = r33
            r0 = 0
        L_0x041c:
            int r1 = r6.size()
            if (r0 >= r1) goto L_0x043a
            java.lang.Object r1 = r6.get(r0)
            wm6 r1 = (defpackage.wm6) r1
            r23 = r3
            java.lang.String r3 = r1.d
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x0435
            r0 = r1
            r1 = 1
            goto L_0x043e
        L_0x0435:
            r1 = 1
            int r0 = r0 + r1
            r3 = r23
            goto L_0x041c
        L_0x043a:
            r23 = r3
            r1 = 1
            r0 = 0
        L_0x043e:
            if (r0 == 0) goto L_0x044f
            qy5 r3 = r0.b
            java.lang.String r3 = r3.j
            java.lang.String r3 = defpackage.oaf.v(r1, r3)
            r12.i = r3
            java.lang.String r1 = defpackage.ia9.c(r3)
            goto L_0x0450
        L_0x044f:
            r1 = 0
        L_0x0450:
            java.util.regex.Pattern r3 = t0
            r7 = 0
            java.lang.String r3 = j(r5, r3, r7, r11)
            if (r3 == 0) goto L_0x0483
            int r5 = defpackage.oaf.a
            java.lang.String r5 = "/"
            r7 = 2
            java.lang.String[] r5 = r3.split(r5, r7)
            r20 = 0
            r5 = r5[r20]
            int r5 = java.lang.Integer.parseInt(r5)
            r12.A = r5
            java.lang.String r5 = "audio/eac3"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0485
            java.lang.String r5 = "/JOC"
            boolean r3 = r3.endsWith(r5)
            if (r3 == 0) goto L_0x0485
            java.lang.String r1 = "ec+3"
            r12.i = r1
            java.lang.String r1 = "audio/eac3-joc"
            goto L_0x0485
        L_0x0483:
            r20 = 0
        L_0x0485:
            r12.d(r1)
            if (r2 == 0) goto L_0x04a0
            r12.j = r13
            um6 r0 = new um6
            qy5 r1 = new qy5
            r1.<init>(r12)
            r0.<init>(r2, r1, r10)
            r3 = r32
            r3.add(r0)
        L_0x049b:
            r7 = r31
            r1 = 3
            goto L_0x0553
        L_0x04a0:
            r3 = r32
            if (r0 == 0) goto L_0x049b
            qy5 r9 = new qy5
            r9.<init>(r12)
        L_0x04a9:
            r7 = r31
            r0 = 1
            r1 = 3
            goto L_0x0554
        L_0x04af:
            r23 = r3
            r3 = r32
            r15 = r33
            r20 = 0
            java.util.regex.Pattern r0 = d1
            java.lang.String r0 = k(r5, r0, r11)
            java.lang.String r1 = "CC"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x04d1
            r1 = 2
            java.lang.String r0 = r0.substring(r1)
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.String r2 = "application/cea-608"
            goto L_0x04dd
        L_0x04d1:
            r1 = 2
            r2 = 7
            java.lang.String r0 = r0.substring(r2)
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.String r2 = "application/cea-708"
        L_0x04dd:
            if (r14 != 0) goto L_0x04e4
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x04e4:
            java.lang.String r2 = defpackage.ia9.l(r2)
            r12.m = r2
            r12.F = r0
            qy5 r0 = new qy5
            r0.<init>(r12)
            r14.add(r0)
            goto L_0x04a9
        L_0x04f5:
            r23 = r3
            r3 = r32
            r15 = r33
            r1 = 2
            r20 = 0
            r5 = r20
        L_0x0500:
            int r0 = r6.size()
            if (r5 >= r0) goto L_0x0519
            java.lang.Object r0 = r6.get(r5)
            wm6 r0 = (defpackage.wm6) r0
            java.lang.String r1 = r0.e
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0515
            goto L_0x051a
        L_0x0515:
            r0 = 1
            int r5 = r5 + r0
            r1 = 2
            goto L_0x0500
        L_0x0519:
            r0 = 0
        L_0x051a:
            if (r0 == 0) goto L_0x052c
            qy5 r0 = r0.b
            java.lang.String r0 = r0.j
            r1 = 3
            java.lang.String r0 = defpackage.oaf.v(r1, r0)
            r12.i = r0
            java.lang.String r0 = defpackage.ia9.c(r0)
            goto L_0x052e
        L_0x052c:
            r1 = 3
            r0 = 0
        L_0x052e:
            if (r0 != 0) goto L_0x0532
            java.lang.String r0 = "text/vtt"
        L_0x0532:
            java.lang.String r0 = defpackage.ia9.l(r0)
            r12.m = r0
            r12.j = r13
            if (r2 == 0) goto L_0x054c
            um6 r0 = new um6
            qy5 r5 = new qy5
            r5.<init>(r12)
            r0.<init>(r2, r5, r10)
            r7 = r31
            r7.add(r0)
            goto L_0x0553
        L_0x054c:
            r7 = r31
            java.lang.String r0 = "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"
            defpackage.z04.c0(r0)
        L_0x0553:
            r0 = 1
        L_0x0554:
            int r8 = r8 + r0
            r1 = r39
            r32 = r3
            r31 = r7
            r33 = r15
            r0 = r22
            r3 = r23
            goto L_0x02ba
        L_0x0563:
            r7 = r31
            r3 = r32
            r15 = r33
            if (r17 == 0) goto L_0x0570
            java.util.List r0 = java.util.Collections.emptyList()
            r14 = r0
        L_0x0570:
            ym6 r13 = new ym6
            r0 = r13
            r1 = r39
            r2 = r30
            r5 = r3
            r3 = r4
            r4 = r15
            r6 = r7
            r7 = r29
            r8 = r9
            r9 = r14
            r10 = r16
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cn6.f(adb, java.lang.String):ym6");
    }

    public static boolean g(String str, Pattern pattern) {
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
        throw ParserException.b((Exception) null, "Couldn't match " + pattern.pattern() + " in " + str);
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

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069 A[Catch:{ all -> 0x0096 }, LOOP:3: B:31:0x0069->B:79:0x0069, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(android.net.Uri r7, defpackage.w24 r8) {
        /*
            r6 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r8)
            r0.<init>(r1)
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>()
            int r1 = r0.read()     // Catch:{ all -> 0x0096 }
            r2 = 239(0xef, float:3.35E-43)
            r3 = 0
            if (r1 != r2) goto L_0x002d
            int r1 = r0.read()     // Catch:{ all -> 0x0096 }
            r2 = 187(0xbb, float:2.62E-43)
            if (r1 != r2) goto L_0x0066
            int r1 = r0.read()     // Catch:{ all -> 0x0096 }
            r2 = 191(0xbf, float:2.68E-43)
            if (r1 == r2) goto L_0x0029
            goto L_0x0066
        L_0x0029:
            int r1 = r0.read()     // Catch:{ all -> 0x0096 }
        L_0x002d:
            r2 = -1
            if (r1 == r2) goto L_0x003b
            boolean r4 = java.lang.Character.isWhitespace(r1)     // Catch:{ all -> 0x0096 }
            if (r4 == 0) goto L_0x003b
            int r1 = r0.read()     // Catch:{ all -> 0x0096 }
            goto L_0x002d
        L_0x003b:
            r4 = r3
        L_0x003c:
            r5 = 7
            if (r4 >= r5) goto L_0x004f
            java.lang.String r5 = "#EXTM3U"
            char r5 = r5.charAt(r4)     // Catch:{ all -> 0x0096 }
            if (r1 == r5) goto L_0x0048
            goto L_0x0066
        L_0x0048:
            int r1 = r0.read()     // Catch:{ all -> 0x0096 }
            int r4 = r4 + 1
            goto L_0x003c
        L_0x004f:
            if (r1 == r2) goto L_0x0062
            boolean r3 = java.lang.Character.isWhitespace(r1)     // Catch:{ all -> 0x0096 }
            if (r3 == 0) goto L_0x0062
            boolean r3 = defpackage.oaf.N(r1)     // Catch:{ all -> 0x0096 }
            if (r3 != 0) goto L_0x0062
            int r1 = r0.read()     // Catch:{ all -> 0x0096 }
            goto L_0x004f
        L_0x0062:
            boolean r3 = defpackage.oaf.N(r1)     // Catch:{ all -> 0x0096 }
        L_0x0066:
            r1 = 0
            if (r3 == 0) goto L_0x00fd
        L_0x0069:
            java.lang.String r2 = r0.readLine()     // Catch:{ all -> 0x0096 }
            if (r2 == 0) goto L_0x00f3
            java.lang.String r2 = r2.trim()     // Catch:{ all -> 0x0096 }
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x0096 }
            if (r3 == 0) goto L_0x007a
            goto L_0x0069
        L_0x007a:
            java.lang.String r3 = "#EXT-X-STREAM-INF"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x0096 }
            if (r3 == 0) goto L_0x0098
            r8.add(r2)     // Catch:{ all -> 0x0096 }
            adb r6 = new adb     // Catch:{ all -> 0x0096 }
            r6.<init>((java.util.ArrayDeque) r8, (java.io.BufferedReader) r0)     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0096 }
            ym6 r6 = f(r6, r7)     // Catch:{ all -> 0x0096 }
        L_0x0092:
            defpackage.oaf.h(r0)
            goto L_0x00f2
        L_0x0096:
            r6 = move-exception
            goto L_0x0104
        L_0x0098:
            java.lang.String r3 = "#EXT-X-TARGETDURATION"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x0096 }
            if (r3 != 0) goto L_0x00dd
            java.lang.String r3 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x0096 }
            if (r3 != 0) goto L_0x00dd
            java.lang.String r3 = "#EXTINF"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x0096 }
            if (r3 != 0) goto L_0x00dd
            java.lang.String r3 = "#EXT-X-KEY"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x0096 }
            if (r3 != 0) goto L_0x00dd
            java.lang.String r3 = "#EXT-X-BYTERANGE"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x0096 }
            if (r3 != 0) goto L_0x00dd
            java.lang.String r3 = "#EXT-X-DISCONTINUITY"
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x0096 }
            if (r3 != 0) goto L_0x00dd
            java.lang.String r3 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x0096 }
            if (r3 != 0) goto L_0x00dd
            java.lang.String r3 = "#EXT-X-ENDLIST"
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x0096 }
            if (r3 == 0) goto L_0x00d9
            goto L_0x00dd
        L_0x00d9:
            r8.add(r2)     // Catch:{ all -> 0x0096 }
            goto L_0x0069
        L_0x00dd:
            r8.add(r2)     // Catch:{ all -> 0x0096 }
            ym6 r1 = r6.a     // Catch:{ all -> 0x0096 }
            qm6 r6 = r6.b     // Catch:{ all -> 0x0096 }
            adb r2 = new adb     // Catch:{ all -> 0x0096 }
            r2.<init>((java.util.ArrayDeque) r8, (java.io.BufferedReader) r0)     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0096 }
            qm6 r6 = e(r1, r6, r2, r7)     // Catch:{ all -> 0x0096 }
            goto L_0x0092
        L_0x00f2:
            return r6
        L_0x00f3:
            defpackage.oaf.h(r0)
            java.lang.String r6 = "Failed to parse the playlist, could not identify any tags."
            androidx.media3.common.ParserException r6 = androidx.media3.common.ParserException.b(r1, r6)
            throw r6
        L_0x00fd:
            java.lang.String r6 = "Input does not start with the #EXTM3U header."
            androidx.media3.common.ParserException r6 = androidx.media3.common.ParserException.b(r1, r6)     // Catch:{ all -> 0x0096 }
            throw r6     // Catch:{ all -> 0x0096 }
        L_0x0104:
            defpackage.oaf.h(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cn6.a(android.net.Uri, w24):java.lang.Object");
    }

    public cn6(ym6 ym6, qm6 qm6) {
        this.a = ym6;
        this.b = qm6;
    }
}
