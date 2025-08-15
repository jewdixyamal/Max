package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.HttpStatus;
import org.webrtc.MediaStreamTrack;

/* renamed from: ha9  reason: default package */
public abstract class ha9 {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String a(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] L = maf.L(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : L) {
            if (str2.equals(c(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static int b(String str, String str2) {
        jt e;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (e = e(str2)) == null) {
                    return 0;
                }
                return e.b();
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case 8:
                return 14;
            default:
                return 0;
        }
    }

    public static String c(String str) {
        jt e;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String T = lz7.T(str.trim());
        if (T.startsWith("avc1") || T.startsWith("avc3")) {
            return "video/avc";
        }
        if (T.startsWith("hev1") || T.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (T.startsWith("dvav") || T.startsWith("dva1") || T.startsWith("dvhe") || T.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (T.startsWith("av01")) {
            return "video/av01";
        }
        if (T.startsWith("vp9") || T.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (T.startsWith("vp8") || T.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (T.startsWith("mp4a")) {
            if (T.startsWith("mp4a.") && (e = e(T)) != null) {
                str2 = d(e.b);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (T.startsWith("mha1")) {
            return "audio/mha1";
        } else {
            if (T.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (T.startsWith("ac-3") || T.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (T.startsWith("ec-3") || T.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (T.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (T.startsWith("ac-4") || T.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (T.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (T.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (T.startsWith("dtsh") || T.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (T.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (T.startsWith("opus")) {
                return "audio/opus";
            }
            if (T.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (T.startsWith("flac")) {
                return "audio/flac";
            }
            if (T.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (T.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (T.contains("cea708")) {
                return "application/cea-708";
            }
            if (T.contains("eia608") || T.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = a;
            if (arrayList.size() <= 0) {
                return null;
            }
            au1.r(arrayList.get(0));
            throw null;
        }
    }

    public static String d(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case HttpStatus.SC_SWITCHING_PROTOCOLS /*101*/:
                return "video/mpeg2";
            case HttpStatus.SC_PROCESSING /*102*/:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static jt e(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new jt(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0, 4);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String f(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (h(str)) {
            return 1;
        }
        if (j(str)) {
            return 2;
        }
        if (i(str)) {
            return 3;
        }
        if ("image".equals(f(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        au1.r(arrayList.get(0));
        throw null;
    }

    public static boolean h(String str) {
        return MediaStreamTrack.AUDIO_TRACK_KIND.equals(f(str));
    }

    public static boolean i(String str) {
        return "text".equals(f(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean j(String str) {
        return MediaStreamTrack.VIDEO_TRACK_KIND.equals(f(str));
    }
}
