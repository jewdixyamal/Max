package defpackage;

import android.content.res.AssetManager;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.apache.http.HttpStatus;

/* renamed from: c65  reason: default package */
public final class c65 {
    public static final byte[] A = {79, 76, 89, 77, 80, 0};
    public static final byte[] B = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] C = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] D = {101, 88, 73, 102};
    public static final byte[] E = {73, 72, 68, 82};
    public static final byte[] F = {73, 69, 78, 68};
    public static final byte[] G = {82, 73, 70, 70};
    public static final byte[] H = {87, 69, 66, 80};
    public static final byte[] I = {69, 88, 73, 70};
    public static final byte[] J = {-99, 1, 42};
    public static final byte[] K = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] L = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] M = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] N = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] O = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] P = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] Q = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] R = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final z55 S = new z55("StripOffsets", 273, 3);
    public static final z55[][] T;
    public static final z55[] U;
    public static final HashMap[] V = new HashMap[10];
    public static final HashMap[] W = new HashMap[10];
    public static final HashSet X = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    public static final HashMap Y = new HashMap();
    public static final Charset Z;
    public static final byte[] a0;
    public static final byte[] b0;
    public static final Pattern c0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern d0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern e0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final boolean t = Log.isLoggable("ExifInterface", 3);
    public static final int[] u = {8, 8, 8};
    public static final int[] v = {8};
    public static final byte[] w = {-1, -40, -1};
    public static final byte[] x = {102, 116, 121, 112};
    public static final byte[] y = {109, 105, 102, 49};
    public static final byte[] z = {104, 101, 105, 99};
    public final String a;
    public final FileDescriptor b;
    public final AssetManager.AssetInputStream c;
    public int d;
    public final HashMap[] e;
    public final HashSet f;
    public ByteOrder g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public byte[] m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;

    static {
        Arrays.asList(new Integer[]{1, 6, 3, 8});
        Arrays.asList(new Integer[]{2, 7, 4, 5});
        z55 z55 = r15;
        z55 z552 = new z55("NewSubfileType", 254, 4);
        z55 z553 = r15;
        z55 z554 = new z55("SubfileType", 255, 4);
        z55 z555 = r15;
        z55 z556 = new z55(256, "ImageWidth", 3, 4);
        z55 z557 = r2;
        z55 z558 = new z55(257, "ImageLength", 3, 4);
        z55 z559 = r2;
        z55 z5510 = new z55("BitsPerSample", 258, 3);
        z55 z5511 = r2;
        z55 z5512 = new z55("Compression", 259, 3);
        z55 z5513 = r2;
        z55 z5514 = new z55("PhotometricInterpretation", 262, 3);
        z55 z5515 = r2;
        z55 z5516 = new z55("ImageDescription", 270, 2);
        z55 z5517 = r2;
        z55 z5518 = new z55("Make", 271, 2);
        z55 z5519 = r2;
        z55 z5520 = new z55("Model", 272, 2);
        z55 z5521 = r2;
        z55 z5522 = new z55(273, "StripOffsets", 3, 4);
        z55 z5523 = r1;
        z55 z5524 = new z55("Orientation", 274, 3);
        z55 z5525 = r1;
        z55 z5526 = new z55("SamplesPerPixel", 277, 3);
        z55 z5527 = r1;
        z55 z5528 = new z55(278, "RowsPerStrip", 3, 4);
        z55 z5529 = r1;
        z55 z5530 = new z55(279, "StripByteCounts", 3, 4);
        z55 z5531 = r1;
        z55 z5532 = new z55("XResolution", 282, 5);
        z55 z5533 = r1;
        z55 z5534 = new z55("YResolution", 283, 5);
        z55 z5535 = r1;
        z55 z5536 = new z55("PlanarConfiguration", 284, 3);
        z55 z5537 = r1;
        z55 z5538 = new z55("ResolutionUnit", 296, 3);
        z55 z5539 = r1;
        z55 z5540 = new z55("TransferFunction", HttpStatus.SC_MOVED_PERMANENTLY, 3);
        z55 z5541 = r1;
        z55 z5542 = new z55("Software", HttpStatus.SC_USE_PROXY, 2);
        z55 z5543 = r1;
        z55 z5544 = new z55("DateTime", 306, 2);
        z55 z5545 = r1;
        z55 z5546 = new z55("Artist", 315, 2);
        z55 z5547 = r1;
        z55 z5548 = new z55("WhitePoint", 318, 5);
        z55 z5549 = r1;
        z55 z5550 = new z55("PrimaryChromaticities", 319, 5);
        z55 z5551 = r1;
        z55 z5552 = new z55("SubIFDPointer", 330, 4);
        z55 z5553 = r1;
        z55 z5554 = new z55("JPEGInterchangeFormat", 513, 4);
        z55 z5555 = r1;
        z55 z5556 = new z55("JPEGInterchangeFormatLength", 514, 4);
        z55 z5557 = r1;
        z55 z5558 = new z55("YCbCrCoefficients", 529, 5);
        z55 z5559 = r1;
        z55 z5560 = new z55("YCbCrSubSampling", 530, 3);
        z55 z5561 = r1;
        z55 z5562 = new z55("YCbCrPositioning", 531, 3);
        z55 z5563 = r1;
        z55 z5564 = new z55("ReferenceBlackWhite", 532, 5);
        z55 z5565 = r1;
        z55 z5566 = new z55("Copyright", 33432, 2);
        z55 z5567 = r1;
        z55 z5568 = new z55("ExifIFDPointer", 34665, 4);
        z55 z5569 = r1;
        z55 z5570 = new z55("GPSInfoIFDPointer", 34853, 4);
        z55 z5571 = r1;
        z55 z5572 = new z55("SensorTopBorder", 4, 4);
        z55 z5573 = r1;
        z55 z5574 = new z55("SensorLeftBorder", 5, 4);
        z55 z5575 = r1;
        z55 z5576 = new z55("SensorBottomBorder", 6, 4);
        z55 z5577 = r1;
        z55 z5578 = new z55("SensorRightBorder", 7, 4);
        z55 z5579 = r1;
        z55 z5580 = new z55("ISO", 23, 3);
        z55 z5581 = r1;
        z55 z5582 = new z55("JpgFromRaw", 46, 7);
        z55 z5583 = r1;
        z55 z5584 = new z55("Xmp", 700, 1);
        z55[] z55Arr = {z55, z553, z555, z557, z559, z5511, z5513, z5515, z5517, z5519, z5521, z5523, z5525, z5527, z5529, z5531, z5533, z5535, z5537, z5539, z5541, z5543, z5545, z5547, z5549, z5551, z5553, z5555, z5557, z5559, z5561, z5563, z5565, z5567, z5569, z5571, z5573, z5575, z5577, z5579, z5581, z5583};
        z55 z5585 = r1;
        z55 z5586 = new z55("ExposureTime", 33434, 5);
        z55 z5587 = r1;
        z55 z5588 = new z55("FNumber", 33437, 5);
        z55 z5589 = r1;
        z55 z5590 = new z55("ExposureProgram", 34850, 3);
        z55 z5591 = r1;
        z55 z5592 = new z55("SpectralSensitivity", 34852, 2);
        z55 z5593 = r1;
        z55 z5594 = new z55("PhotographicSensitivity", 34855, 3);
        z55 z5595 = r1;
        z55 z5596 = new z55("OECF", 34856, 7);
        z55 z5597 = r1;
        z55 z5598 = new z55("SensitivityType", 34864, 3);
        z55 z5599 = r1;
        z55 z55100 = new z55("StandardOutputSensitivity", 34865, 4);
        z55 z55101 = r1;
        z55 z55102 = new z55("RecommendedExposureIndex", 34866, 4);
        z55 z55103 = r1;
        z55 z55104 = new z55("ISOSpeed", 34867, 4);
        z55 z55105 = r1;
        z55 z55106 = new z55("ISOSpeedLatitudeyyy", 34868, 4);
        z55 z55107 = r1;
        z55 z55108 = new z55("ISOSpeedLatitudezzz", 34869, 4);
        z55 z55109 = r1;
        z55 z55110 = new z55("ExifVersion", 36864, 2);
        z55 z55111 = r1;
        z55 z55112 = new z55("DateTimeOriginal", 36867, 2);
        z55 z55113 = r1;
        z55 z55114 = new z55("DateTimeDigitized", 36868, 2);
        z55 z55115 = r1;
        z55 z55116 = new z55("OffsetTime", 36880, 2);
        z55 z55117 = r1;
        z55 z55118 = new z55("OffsetTimeOriginal", 36881, 2);
        z55 z55119 = r1;
        z55 z55120 = new z55("OffsetTimeDigitized", 36882, 2);
        z55 z55121 = r1;
        z55 z55122 = new z55("ComponentsConfiguration", 37121, 7);
        z55 z55123 = r1;
        z55 z55124 = new z55("CompressedBitsPerPixel", 37122, 5);
        z55 z55125 = r1;
        z55 z55126 = new z55("ShutterSpeedValue", 37377, 10);
        z55 z55127 = r1;
        z55 z55128 = new z55("ApertureValue", 37378, 5);
        z55 z55129 = r1;
        z55 z55130 = new z55("BrightnessValue", 37379, 10);
        z55 z55131 = r1;
        z55 z55132 = new z55("ExposureBiasValue", 37380, 10);
        z55 z55133 = r1;
        z55 z55134 = new z55("MaxApertureValue", 37381, 5);
        z55 z55135 = r1;
        z55 z55136 = new z55("SubjectDistance", 37382, 5);
        z55 z55137 = r1;
        z55 z55138 = new z55("MeteringMode", 37383, 3);
        z55 z55139 = r1;
        z55 z55140 = new z55("LightSource", 37384, 3);
        z55 z55141 = r1;
        z55 z55142 = new z55("Flash", 37385, 3);
        z55 z55143 = r1;
        z55 z55144 = new z55("FocalLength", 37386, 5);
        z55 z55145 = r1;
        z55 z55146 = new z55("SubjectArea", 37396, 3);
        z55 z55147 = r1;
        z55 z55148 = new z55("MakerNote", 37500, 7);
        z55 z55149 = r1;
        z55 z55150 = new z55("UserComment", 37510, 7);
        z55 z55151 = r1;
        z55 z55152 = new z55("SubSecTime", 37520, 2);
        z55 z55153 = r1;
        z55 z55154 = new z55("SubSecTimeOriginal", 37521, 2);
        z55 z55155 = r1;
        z55 z55156 = new z55("SubSecTimeDigitized", 37522, 2);
        z55 z55157 = r1;
        z55 z55158 = new z55("FlashpixVersion", 40960, 7);
        z55 z55159 = r1;
        z55 z55160 = new z55("ColorSpace", 40961, 3);
        z55 z55161 = r1;
        z55 z55162 = new z55(40962, "PixelXDimension", 3, 4);
        z55 z55163 = r1;
        z55 z55164 = new z55(40963, "PixelYDimension", 3, 4);
        z55 z55165 = r1;
        z55 z55166 = new z55("RelatedSoundFile", 40964, 2);
        z55 z55167 = r1;
        z55 z55168 = new z55("InteroperabilityIFDPointer", 40965, 4);
        z55 z55169 = r1;
        z55 z55170 = new z55("FlashEnergy", 41483, 5);
        z55 z55171 = r1;
        z55 z55172 = new z55("SpatialFrequencyResponse", 41484, 7);
        z55 z55173 = r1;
        z55 z55174 = new z55("FocalPlaneXResolution", 41486, 5);
        z55 z55175 = r1;
        z55 z55176 = new z55("FocalPlaneYResolution", 41487, 5);
        z55 z55177 = r1;
        z55 z55178 = new z55("FocalPlaneResolutionUnit", 41488, 3);
        z55 z55179 = r1;
        z55 z55180 = new z55("SubjectLocation", 41492, 3);
        z55 z55181 = r1;
        z55 z55182 = new z55("ExposureIndex", 41493, 5);
        z55 z55183 = r1;
        z55 z55184 = new z55("SensingMethod", 41495, 3);
        z55 z55185 = r1;
        z55 z55186 = new z55("FileSource", 41728, 7);
        z55 z55187 = r1;
        z55 z55188 = new z55("SceneType", 41729, 7);
        z55 z55189 = r1;
        z55 z55190 = new z55("CFAPattern", 41730, 7);
        z55 z55191 = r1;
        z55 z55192 = new z55("CustomRendered", 41985, 3);
        z55 z55193 = r1;
        z55 z55194 = new z55("ExposureMode", 41986, 3);
        z55 z55195 = r1;
        z55 z55196 = new z55("WhiteBalance", 41987, 3);
        z55 z55197 = r1;
        z55 z55198 = new z55("DigitalZoomRatio", 41988, 5);
        z55 z55199 = r1;
        z55 z55200 = new z55("FocalLengthIn35mmFilm", 41989, 3);
        z55 z55201 = r1;
        z55 z55202 = new z55("SceneCaptureType", 41990, 3);
        z55 z55203 = r1;
        z55 z55204 = new z55("GainControl", 41991, 3);
        z55 z55205 = r1;
        z55 z55206 = new z55("Contrast", 41992, 3);
        z55 z55207 = r1;
        z55 z55208 = new z55("Saturation", 41993, 3);
        z55 z55209 = r1;
        z55 z55210 = new z55("Sharpness", 41994, 3);
        z55 z55211 = r1;
        z55 z55212 = new z55("DeviceSettingDescription", 41995, 7);
        z55 z55213 = r1;
        z55 z55214 = new z55("SubjectDistanceRange", 41996, 3);
        z55 z55215 = r1;
        z55 z55216 = new z55("ImageUniqueID", 42016, 2);
        z55 z55217 = r1;
        z55 z55218 = new z55("CameraOwnerName", 42032, 2);
        z55 z55219 = r1;
        z55 z55220 = new z55("BodySerialNumber", 42033, 2);
        z55 z55221 = r1;
        z55 z55222 = new z55("LensSpecification", 42034, 5);
        z55 z55223 = r1;
        z55 z55224 = new z55("LensMake", 42035, 2);
        z55 z55225 = r1;
        z55 z55226 = new z55("LensModel", 42036, 2);
        z55 z55227 = r1;
        z55 z55228 = new z55("Gamma", 42240, 5);
        z55 z55229 = r1;
        z55 z55230 = new z55("DNGVersion", 50706, 1);
        z55 z55231 = r1;
        z55 z55232 = new z55(50720, "DefaultCropSize", 3, 4);
        z55 z55233 = r1;
        z55 z55234 = new z55("GPSVersionID", 0, 1);
        z55 z55235 = r1;
        z55 z55236 = new z55("GPSLatitudeRef", 1, 2);
        z55 z55237 = r1;
        z55 z55238 = new z55(2, "GPSLatitude", 5, 10);
        z55 z55239 = r1;
        z55 z55240 = new z55("GPSLongitudeRef", 3, 2);
        z55 z55241 = r1;
        z55 z55242 = new z55(4, "GPSLongitude", 5, 10);
        z55 z55243 = r1;
        z55 z55244 = new z55("GPSAltitudeRef", 5, 1);
        z55 z55245 = r1;
        z55 z55246 = new z55("GPSAltitude", 6, 5);
        z55 z55247 = r1;
        z55 z55248 = new z55("GPSTimeStamp", 7, 5);
        z55 z55249 = r1;
        z55 z55250 = new z55("GPSSatellites", 8, 2);
        z55 z55251 = r1;
        z55 z55252 = new z55("GPSStatus", 9, 2);
        z55 z55253 = r1;
        z55 z55254 = new z55("GPSMeasureMode", 10, 2);
        z55 z55255 = r1;
        z55 z55256 = new z55("GPSDOP", 11, 5);
        z55 z55257 = r1;
        z55 z55258 = new z55("GPSSpeedRef", 12, 2);
        z55 z55259 = r1;
        z55 z55260 = new z55("GPSSpeed", 13, 5);
        z55 z55261 = r1;
        z55 z55262 = new z55("GPSTrackRef", 14, 2);
        z55 z55263 = r1;
        z55 z55264 = new z55("GPSTrack", 15, 5);
        z55 z55265 = r1;
        z55 z55266 = new z55("GPSImgDirectionRef", 16, 2);
        z55 z55267 = r1;
        z55 z55268 = new z55("GPSImgDirection", 17, 5);
        z55 z55269 = r1;
        z55 z55270 = new z55("GPSMapDatum", 18, 2);
        z55 z55271 = r1;
        z55 z55272 = new z55("GPSDestLatitudeRef", 19, 2);
        z55 z55273 = r1;
        z55 z55274 = new z55("GPSDestLatitude", 20, 5);
        z55 z55275 = r1;
        z55 z55276 = new z55("GPSDestLongitudeRef", 21, 2);
        z55 z55277 = r1;
        z55 z55278 = new z55("GPSDestLongitude", 22, 5);
        z55 z55279 = r1;
        z55 z55280 = new z55("GPSDestBearingRef", 23, 2);
        z55 z55281 = r1;
        z55 z55282 = new z55("GPSDestBearing", 24, 5);
        z55 z55283 = r1;
        z55 z55284 = new z55("GPSDestDistanceRef", 25, 2);
        z55 z55285 = r1;
        z55 z55286 = new z55("GPSDestDistance", 26, 5);
        z55 z55287 = r1;
        z55 z55288 = new z55("GPSProcessingMethod", 27, 7);
        z55 z55289 = r1;
        z55 z55290 = new z55("GPSAreaInformation", 28, 7);
        z55 z55291 = r1;
        z55 z55292 = new z55("GPSDateStamp", 29, 2);
        z55 z55293 = r1;
        z55 z55294 = new z55("GPSDifferential", 30, 3);
        z55 z55295 = r1;
        z55 z55296 = new z55("GPSHPositioningError", 31, 5);
        z55[] z55Arr2 = {z55233, z55235, z55237, z55239, z55241, z55243, z55245, z55247, z55249, z55251, z55253, z55255, z55257, z55259, z55261, z55263, z55265, z55267, z55269, z55271, z55273, z55275, z55277, z55279, z55281, z55283, z55285, z55287, z55289, z55291, z55293, z55295};
        z55[] z55Arr3 = {new z55("InteroperabilityIndex", 1, 2)};
        z55 z55297 = r1;
        z55 z55298 = new z55("NewSubfileType", 254, 4);
        z55 z55299 = r1;
        z55 z55300 = new z55("SubfileType", 255, 4);
        z55 z55301 = r1;
        z55 z55302 = new z55(256, "ThumbnailImageWidth", 3, 4);
        z55 z55303 = r1;
        z55 z55304 = new z55(257, "ThumbnailImageLength", 3, 4);
        z55 z55305 = r1;
        z55 z55306 = new z55("BitsPerSample", 258, 3);
        z55 z55307 = r1;
        z55 z55308 = new z55("Compression", 259, 3);
        z55 z55309 = r1;
        z55 z55310 = new z55("PhotometricInterpretation", 262, 3);
        z55 z55311 = r1;
        z55 z55312 = new z55("ImageDescription", 270, 2);
        z55 z55313 = r1;
        z55 z55314 = new z55("Make", 271, 2);
        z55 z55315 = r0;
        z55 z55316 = new z55("Model", 272, 2);
        z55 z55317 = r0;
        z55 z55318 = new z55(273, "StripOffsets", 3, 4);
        z55 z55319 = r0;
        z55 z55320 = new z55("ThumbnailOrientation", 274, 3);
        z55 z55321 = r0;
        z55 z55322 = new z55("SamplesPerPixel", 277, 3);
        z55 z55323 = r0;
        z55 z55324 = new z55(278, "RowsPerStrip", 3, 4);
        z55 z55325 = r0;
        z55 z55326 = new z55(279, "StripByteCounts", 3, 4);
        z55 z55327 = r0;
        z55 z55328 = new z55("XResolution", 282, 5);
        z55 z55329 = r0;
        z55 z55330 = new z55("YResolution", 283, 5);
        z55 z55331 = r0;
        z55 z55332 = new z55("PlanarConfiguration", 284, 3);
        z55 z55333 = r0;
        z55 z55334 = new z55("ResolutionUnit", 296, 3);
        z55 z55335 = r0;
        z55 z55336 = new z55("TransferFunction", HttpStatus.SC_MOVED_PERMANENTLY, 3);
        z55 z55337 = r0;
        z55 z55338 = new z55("Software", HttpStatus.SC_USE_PROXY, 2);
        z55 z55339 = r0;
        z55 z55340 = new z55("DateTime", 306, 2);
        z55 z55341 = r0;
        z55 z55342 = new z55("Artist", 315, 2);
        z55 z55343 = r0;
        z55 z55344 = new z55("WhitePoint", 318, 5);
        z55 z55345 = r0;
        z55 z55346 = new z55("PrimaryChromaticities", 319, 5);
        z55 z55347 = r0;
        z55 z55348 = new z55("SubIFDPointer", 330, 4);
        z55 z55349 = r0;
        z55 z55350 = new z55("JPEGInterchangeFormat", 513, 4);
        z55 z55351 = r0;
        z55 z55352 = new z55("JPEGInterchangeFormatLength", 514, 4);
        z55 z55353 = r0;
        z55 z55354 = new z55("YCbCrCoefficients", 529, 5);
        z55 z55355 = r0;
        z55 z55356 = new z55("YCbCrSubSampling", 530, 3);
        z55 z55357 = r0;
        z55 z55358 = new z55("YCbCrPositioning", 531, 3);
        z55 z55359 = r0;
        z55 z55360 = new z55("ReferenceBlackWhite", 532, 5);
        z55 z55361 = r0;
        z55 z55362 = new z55("Copyright", 33432, 2);
        z55 z55363 = r0;
        z55 z55364 = new z55("ExifIFDPointer", 34665, 4);
        z55 z55365 = r0;
        String str = "GPSInfoIFDPointer";
        z55 z55366 = new z55(str, 34853, 4);
        z55 z55367 = r0;
        z55 z55368 = new z55("DNGVersion", 50706, 1);
        z55 z55369 = r0;
        z55 z55370 = new z55(50720, "DefaultCropSize", 3, 4);
        T = new z55[][]{z55Arr, new z55[]{z5585, z5587, z5589, z5591, z5593, z5595, z5597, z5599, z55101, z55103, z55105, z55107, z55109, z55111, z55113, z55115, z55117, z55119, z55121, z55123, z55125, z55127, z55129, z55131, z55133, z55135, z55137, z55139, z55141, z55143, z55145, z55147, z55149, z55151, z55153, z55155, z55157, z55159, z55161, z55163, z55165, z55167, z55169, z55171, z55173, z55175, z55177, z55179, z55181, z55183, z55185, z55187, z55189, z55191, z55193, z55195, z55197, z55199, z55201, z55203, z55205, z55207, z55209, z55211, z55213, z55215, z55217, z55219, z55221, z55223, z55225, z55227, z55229, z55231}, z55Arr2, z55Arr3, new z55[]{z55297, z55299, z55301, z55303, z55305, z55307, z55309, z55311, z55313, z55315, z55317, z55319, z55321, z55323, z55325, z55327, z55329, z55331, z55333, z55335, z55337, z55339, z55341, z55343, z55345, z55347, z55349, z55351, z55353, z55355, z55357, z55359, z55361, z55363, z55365, z55367, z55369}, z55Arr, new z55[]{new z55("ThumbnailImage", 256, 7), new z55("CameraSettingsIFDPointer", 8224, 4), new z55("ImageProcessingIFDPointer", 8256, 4)}, new z55[]{new z55("PreviewImageStart", 257, 4), new z55("PreviewImageLength", 258, 4)}, new z55[]{new z55("AspectFrame", 4371, 3)}, new z55[]{new z55("ColorSpace", 55, 3)}};
        U = new z55[]{new z55("SubIFDPointer", 330, 4), new z55("ExifIFDPointer", 34665, 4), new z55(str, 34853, 4), new z55("InteroperabilityIFDPointer", 40965, 4), new z55("CameraSettingsIFDPointer", 8224, 1), new z55("ImageProcessingIFDPointer", 8256, 1)};
        Charset forName = Charset.forName("US-ASCII");
        Z = forName;
        a0 = "Exif\u0000\u0000".getBytes(forName);
        b0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            z55[][] z55Arr4 = T;
            if (i2 < z55Arr4.length) {
                V[i2] = new HashMap();
                W[i2] = new HashMap();
                for (z55 z55371 : z55Arr4[i2]) {
                    V[i2].put(Integer.valueOf(z55371.a), z55371);
                    W[i2].put(z55371.b, z55371);
                }
                i2++;
            } else {
                HashMap hashMap = Y;
                z55[] z55Arr5 = U;
                hashMap.put(Integer.valueOf(z55Arr5[0].a), 5);
                hashMap.put(Integer.valueOf(z55Arr5[1].a), 1);
                hashMap.put(Integer.valueOf(z55Arr5[2].a), 2);
                hashMap.put(Integer.valueOf(z55Arr5[3].a), 3);
                hashMap.put(Integer.valueOf(z55Arr5[4].a), 7);
                hashMap.put(Integer.valueOf(z55Arr5[5].a), 8);
                Pattern.compile(".*[1-9].*");
                return;
            }
        }
    }

    public c65(String str) {
        boolean z2;
        z55[][] z55Arr = T;
        this.e = new HashMap[z55Arr.length];
        this.f = new HashSet(z55Arr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.c = null;
            this.a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    try {
                        d65.c(fileInputStream2.getFD(), 0, OsConstants.SEEK_CUR);
                        z2 = true;
                    } catch (Exception unused) {
                        z2 = false;
                    }
                    if (z2) {
                        this.b = fileInputStream2.getFD();
                    } else {
                        this.b = null;
                    }
                    t(fileInputStream2);
                    br7.i(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    br7.i(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                br7.i(fileInputStream);
                throw th;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    public static double b(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            String[] split4 = split[2].split("/", -1);
            double parseDouble2 = ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + parseDouble;
            if (!str2.equals("S")) {
                if (!str2.equals("W")) {
                    if (!str2.equals("N")) {
                        if (!str2.equals("E")) {
                            throw new IllegalArgumentException();
                        }
                    }
                    return parseDouble2;
                }
            }
            return -parseDouble2;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(x55 x55, uv0 uv0, byte[] bArr, byte[] bArr2) {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (x55.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = Z;
                sb.append(new String(bArr, charset));
                sb.append(bArr2 == null ? "" : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb.toString());
            }
            int readInt = x55.readInt();
            uv0.write(bArr3);
            uv0.d(readInt);
            if (readInt % 2 == 1) {
                readInt++;
            }
            br7.l(x55, uv0, readInt);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:67|68|69) */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        java.lang.Double.parseDouble(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014a, code lost:
        return new android.util.Pair(12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0150, code lost:
        return new android.util.Pair(2, -1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x013c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair q(java.lang.String r10) {
        /*
            java.lang.String r0 = ","
            boolean r1 = r10.contains(r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L_0x00a6
            java.lang.String[] r10 = r10.split(r0, r6)
            r0 = r10[r2]
            android.util.Pair r0 = q(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x0029
            return r0
        L_0x0029:
            int r1 = r10.length
            if (r3 >= r1) goto L_0x00a5
            r1 = r10[r3]
            android.util.Pair r1 = q(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004d
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = r6
            goto L_0x0055
        L_0x004d:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L_0x0055:
            java.lang.Object r4 = r0.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0080
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r0.second
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0077
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r0.second
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0080
        L_0x0077:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0081
        L_0x0080:
            r1 = r6
        L_0x0081:
            if (r2 != r6) goto L_0x008b
            if (r1 != r6) goto L_0x008b
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        L_0x008b:
            if (r2 != r6) goto L_0x0097
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r7)
            goto L_0x00a2
        L_0x0097:
            if (r1 != r6) goto L_0x00a2
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r7)
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x00a5:
            return r0
        L_0x00a6:
            java.lang.String r0 = "/"
            boolean r1 = r10.contains(r0)
            r8 = 0
            if (r1 == 0) goto L_0x0105
            java.lang.String[] r10 = r10.split(r0, r6)
            int r0 = r10.length
            if (r0 != r4) goto L_0x00ff
            r0 = r10[r2]     // Catch:{ NumberFormatException -> 0x00ff }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
            r10 = r10[r3]     // Catch:{ NumberFormatException -> 0x00ff }
            double r2 = java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x00ff }
            long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r4 = 10
            if (r10 < 0) goto L_0x00f5
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x00d0
            goto L_0x00f5
        L_0x00d0:
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r0 = 5
            if (r10 > 0) goto L_0x00eb
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x00dd
            goto L_0x00eb
        L_0x00dd:
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r10.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x00ff }
            return r10
        L_0x00eb:
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r10
        L_0x00f5:
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r10
        L_0x00ff:
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        L_0x0105:
            long r0 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x013c }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r3 = 4
            if (r2 < 0) goto L_0x0124
            r8 = 65535(0xffff, double:3.23786E-319)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0124
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x013c }
            r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x013c }
            return r0
        L_0x0124:
            if (r2 >= 0) goto L_0x0132
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
            return r0
        L_0x0132:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x013c }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
            return r0
        L_0x013c:
            java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x014b }
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014b }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014b }
            r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x014b }
            return r10
        L_0x014b:
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c65.q(java.lang.String):android.util.Pair");
    }

    public static ByteOrder w(x55 x55) {
        short readShort = x55.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void A(int i2, String str, String str2) {
        HashMap[] hashMapArr = this.e;
        if (!hashMapArr[i2].isEmpty() && hashMapArr[i2].get(str) != null) {
            HashMap hashMap = hashMapArr[i2];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i2].remove(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: java.io.BufferedInputStream} */
    /* JADX WARNING: type inference failed for: r9v8, types: [java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009c, code lost:
        r14 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009d, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00ea, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00eb, code lost:
        r11 = null;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00ed, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00ee, code lost:
        r10 = null;
        r11 = null;
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00fa, code lost:
        defpackage.d65.c(r14.b, 0, android.system.OsConstants.SEEK_SET);
        r4 = new java.io.FileOutputStream(r14.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0110, code lost:
        r4 = new java.io.FileOutputStream(r14.a);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009c A[Catch:{ Exception -> 0x00a0, all -> 0x009c }, ExcHandler: all (th java.lang.Throwable), Splitter:B:41:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00fa A[Catch:{ Exception -> 0x010d, all -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0110 A[Catch:{ Exception -> 0x010d, all -> 0x010a }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B() {
        /*
            r14 = this;
            java.lang.String r0 = "Failed to save new file. Original file is stored in "
            int r1 = r14.d
            r2 = 14
            r3 = 13
            r4 = 4
            if (r1 == r4) goto L_0x0018
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            goto L_0x0018
        L_0x0010:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r0 = "ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats."
            r14.<init>(r0)
            throw r14
        L_0x0018:
            java.io.FileDescriptor r1 = r14.b
            if (r1 != 0) goto L_0x0029
            java.lang.String r1 = r14.a
            if (r1 == 0) goto L_0x0021
            goto L_0x0029
        L_0x0021:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r0 = "ExifInterface does not support saving attributes for the current input."
            r14.<init>(r0)
            throw r14
        L_0x0029:
            boolean r1 = r14.h
            if (r1 == 0) goto L_0x003e
            boolean r1 = r14.i
            if (r1 == 0) goto L_0x003e
            boolean r1 = r14.j
            if (r1 == 0) goto L_0x0036
            goto L_0x003e
        L_0x0036:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r0 = "ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips"
            r14.<init>(r0)
            throw r14
        L_0x003e:
            int r1 = r14.n
            r5 = 6
            r6 = 0
            if (r1 == r5) goto L_0x004a
            r5 = 7
            if (r1 != r5) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r1 = r6
            goto L_0x004e
        L_0x004a:
            byte[] r1 = r14.o()
        L_0x004e:
            r14.m = r1
            java.lang.String r1 = "temp"
            java.lang.String r5 = "tmp"
            java.io.File r1 = java.io.File.createTempFile(r1, r5)     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            java.lang.String r5 = r14.a     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            r7 = 0
            if (r5 == 0) goto L_0x006e
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            java.lang.String r9 = r14.a     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            r5.<init>(r9)     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            goto L_0x007c
        L_0x0066:
            r14 = move-exception
            r9 = r6
            goto L_0x016b
        L_0x006a:
            r14 = move-exception
            r9 = r6
            goto L_0x0162
        L_0x006e:
            java.io.FileDescriptor r5 = r14.b     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            int r9 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            defpackage.d65.c(r5, r7, r9)     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            java.io.FileDescriptor r9 = r14.b     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            r5.<init>(r9)     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
        L_0x007c:
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x015f, all -> 0x015c }
            r9.<init>(r1)     // Catch:{ Exception -> 0x015f, all -> 0x015c }
            defpackage.br7.m(r5, r9)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            defpackage.br7.i(r5)
            defpackage.br7.i(r9)
            r5 = 0
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00ed, all -> 0x009c }
            r9.<init>(r1)     // Catch:{ Exception -> 0x00ed, all -> 0x009c }
            java.lang.String r10 = r14.a     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            if (r10 == 0) goto L_0x00a6
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            java.lang.String r11 = r14.a     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            r10.<init>(r11)     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            goto L_0x00b4
        L_0x009c:
            r14 = move-exception
            r12 = r6
            goto L_0x014a
        L_0x00a0:
            r2 = move-exception
            r10 = r6
            r11 = r10
        L_0x00a3:
            r12 = r11
        L_0x00a4:
            r6 = r9
            goto L_0x00f1
        L_0x00a6:
            java.io.FileDescriptor r10 = r14.b     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            int r11 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            defpackage.d65.c(r10, r7, r11)     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            java.io.FileDescriptor r11 = r14.b     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            r10.<init>(r11)     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
        L_0x00b4:
            java.io.BufferedInputStream r11 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00ea, all -> 0x009c }
            r11.<init>(r9)     // Catch:{ Exception -> 0x00ea, all -> 0x009c }
            java.io.BufferedOutputStream r12 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00e7, all -> 0x00e4 }
            r12.<init>(r10)     // Catch:{ Exception -> 0x00e7, all -> 0x00e4 }
            int r13 = r14.d     // Catch:{ Exception -> 0x00e2 }
            if (r13 != r4) goto L_0x00c9
            r14.C(r11, r12)     // Catch:{ Exception -> 0x00e2 }
            goto L_0x00d4
        L_0x00c6:
            r6 = r11
            goto L_0x014a
        L_0x00c9:
            if (r13 != r3) goto L_0x00cf
            r14.D(r11, r12)     // Catch:{ Exception -> 0x00e2 }
            goto L_0x00d4
        L_0x00cf:
            if (r13 != r2) goto L_0x00d4
            r14.E(r11, r12)     // Catch:{ Exception -> 0x00e2 }
        L_0x00d4:
            defpackage.br7.i(r11)
            defpackage.br7.i(r12)
            r1.delete()
            r14.m = r6
            return
        L_0x00e0:
            r14 = move-exception
            goto L_0x00c6
        L_0x00e2:
            r2 = move-exception
            goto L_0x00a4
        L_0x00e4:
            r14 = move-exception
            r12 = r6
            goto L_0x00c6
        L_0x00e7:
            r2 = move-exception
            r12 = r6
            goto L_0x00a4
        L_0x00ea:
            r2 = move-exception
            r11 = r6
            goto L_0x00a3
        L_0x00ed:
            r2 = move-exception
            r10 = r6
            r11 = r10
            r12 = r11
        L_0x00f1:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x012b }
            r3.<init>(r1)     // Catch:{ Exception -> 0x012b }
            java.lang.String r4 = r14.a     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            if (r4 != 0) goto L_0x0110
            java.io.FileDescriptor r4 = r14.b     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            int r6 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            defpackage.d65.c(r4, r7, r6)     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            java.io.FileDescriptor r14 = r14.b     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            r4.<init>(r14)     // Catch:{ Exception -> 0x010d, all -> 0x010a }
        L_0x0108:
            r10 = r4
            goto L_0x0118
        L_0x010a:
            r14 = move-exception
            r6 = r3
            goto L_0x0143
        L_0x010d:
            r14 = move-exception
            r6 = r3
            goto L_0x012c
        L_0x0110:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            java.lang.String r14 = r14.a     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            r4.<init>(r14)     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            goto L_0x0108
        L_0x0118:
            defpackage.br7.m(r3, r10)     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            defpackage.br7.i(r3)     // Catch:{ all -> 0x00e0 }
            defpackage.br7.i(r10)     // Catch:{ all -> 0x00e0 }
            java.io.IOException r14 = new java.io.IOException     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "Failed to save new file"
            r14.<init>(r0, r2)     // Catch:{ all -> 0x00e0 }
            throw r14     // Catch:{ all -> 0x00e0 }
        L_0x0129:
            r14 = move-exception
            goto L_0x0143
        L_0x012b:
            r14 = move-exception
        L_0x012c:
            r5 = 1
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0129 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0129 }
            r3.<init>(r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ all -> 0x0129 }
            r3.append(r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0129 }
            r2.<init>(r0, r14)     // Catch:{ all -> 0x0129 }
            throw r2     // Catch:{ all -> 0x0129 }
        L_0x0143:
            defpackage.br7.i(r6)     // Catch:{ all -> 0x00e0 }
            defpackage.br7.i(r10)     // Catch:{ all -> 0x00e0 }
            throw r14     // Catch:{ all -> 0x00e0 }
        L_0x014a:
            defpackage.br7.i(r6)
            defpackage.br7.i(r12)
            if (r5 != 0) goto L_0x0155
            r1.delete()
        L_0x0155:
            throw r14
        L_0x0156:
            r14 = move-exception
        L_0x0157:
            r6 = r5
            goto L_0x016b
        L_0x0159:
            r14 = move-exception
        L_0x015a:
            r6 = r5
            goto L_0x0162
        L_0x015c:
            r14 = move-exception
            r9 = r6
            goto L_0x0157
        L_0x015f:
            r14 = move-exception
            r9 = r6
            goto L_0x015a
        L_0x0162:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x016a }
            java.lang.String r1 = "Failed to copy original file to temp file"
            r0.<init>(r1, r14)     // Catch:{ all -> 0x016a }
            throw r0     // Catch:{ all -> 0x016a }
        L_0x016a:
            r14 = move-exception
        L_0x016b:
            defpackage.br7.i(r6)
            defpackage.br7.i(r9)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c65.B():void");
    }

    public final void C(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        x55 x55 = new x55((InputStream) bufferedInputStream);
        uv0 uv0 = new uv0(bufferedOutputStream, ByteOrder.BIG_ENDIAN, 1);
        if (x55.readByte() == -1) {
            uv0.a(-1);
            if (x55.readByte() == -40) {
                uv0.a(-40);
                String d2 = d("Xmp");
                HashMap[] hashMapArr = this.e;
                y55 y55 = (d2 == null || !this.s) ? null : (y55) hashMapArr[0].remove("Xmp");
                uv0.a(-1);
                uv0.a(-31);
                K(uv0);
                if (y55 != null) {
                    hashMapArr[0].put("Xmp", y55);
                }
                byte[] bArr = new byte[4096];
                while (x55.readByte() == -1) {
                    byte readByte = x55.readByte();
                    if (readByte == -39 || readByte == -38) {
                        uv0.a(-1);
                        uv0.a(readByte);
                        br7.m(x55, uv0);
                        return;
                    } else if (readByte != -31) {
                        uv0.a(-1);
                        uv0.a(readByte);
                        int readUnsignedShort = x55.readUnsignedShort();
                        uv0.g((short) readUnsignedShort);
                        int i2 = readUnsignedShort - 2;
                        if (i2 >= 0) {
                            while (i2 > 0) {
                                int read = x55.read(bArr, 0, Math.min(i2, 4096));
                                if (read < 0) {
                                    break;
                                }
                                uv0.write(bArr, 0, read);
                                i2 -= read;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    } else {
                        int readUnsignedShort2 = x55.readUnsignedShort();
                        int i3 = readUnsignedShort2 - 2;
                        if (i3 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (i3 >= 6) {
                                if (x55.read(bArr2) != 6) {
                                    throw new IOException("Invalid exif");
                                } else if (Arrays.equals(bArr2, a0)) {
                                    x55.a(readUnsignedShort2 - 8);
                                }
                            }
                            uv0.a(-1);
                            uv0.a(readByte);
                            uv0.g((short) readUnsignedShort2);
                            if (i3 >= 6) {
                                i3 = readUnsignedShort2 - 8;
                                uv0.write(bArr2);
                            }
                            while (i3 > 0) {
                                int read2 = x55.read(bArr, 0, Math.min(i3, 4096));
                                if (read2 < 0) {
                                    break;
                                }
                                uv0.write(bArr, 0, read2);
                                i3 -= read2;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    public final void D(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        x55 x55 = new x55((InputStream) bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        uv0 uv0 = new uv0(bufferedOutputStream, byteOrder, 1);
        byte[] bArr = C;
        br7.l(x55, uv0, bArr.length);
        int i2 = this.o;
        if (i2 == 0) {
            int readInt = x55.readInt();
            uv0.d(readInt);
            br7.l(x55, uv0, readInt + 8);
        } else {
            br7.l(x55, uv0, (i2 - bArr.length) - 8);
            x55.a(x55.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                uv0 uv02 = new uv0(byteArrayOutputStream2, byteOrder, 1);
                K(uv02);
                byte[] byteArray = ((ByteArrayOutputStream) uv02.b).toByteArray();
                uv0.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                uv0.d((int) crc32.getValue());
                br7.i(byteArrayOutputStream2);
                br7.m(x55, uv0);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                br7.i(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            br7.i(byteArrayOutputStream);
            throw th;
        }
    }

    public final void E(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        uv0 uv0;
        byte[] bArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        BufferedInputStream bufferedInputStream2 = bufferedInputStream;
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        x55 x55 = new x55(bufferedInputStream2, byteOrder);
        uv0 uv02 = new uv0(bufferedOutputStream, byteOrder, 1);
        byte[] bArr2 = G;
        br7.l(x55, uv02, bArr2.length);
        byte[] bArr3 = H;
        x55.a(bArr3.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                uv0 uv03 = new uv0(byteArrayOutputStream2, byteOrder, 1);
                int i5 = this.o;
                if (i5 != 0) {
                    br7.l(x55, uv03, (i5 - ((bArr2.length + 4) + bArr3.length)) - 8);
                    x55.a(4);
                    int readInt = x55.readInt();
                    if (readInt % 2 != 0) {
                        readInt++;
                    }
                    x55.a(readInt);
                    K(uv03);
                } else {
                    byte[] bArr4 = new byte[4];
                    if (x55.read(bArr4) == 4) {
                        byte[] bArr5 = K;
                        boolean equals = Arrays.equals(bArr4, bArr5);
                        byte[] bArr6 = M;
                        byte[] bArr7 = L;
                        boolean z3 = false;
                        if (equals) {
                            int readInt2 = x55.readInt();
                            byte[] bArr8 = new byte[(readInt2 % 2 == 1 ? readInt2 + 1 : readInt2)];
                            x55.read(bArr8);
                            byte b2 = (byte) (bArr8[0] | 8);
                            bArr8[0] = b2;
                            if (((b2 >> 1) & 1) == 1) {
                                z3 = true;
                            }
                            uv03.write(bArr5);
                            uv03.d(readInt2);
                            uv03.write(bArr8);
                            if (z3) {
                                c(x55, uv03, N, (byte[]) null);
                                while (true) {
                                    byte[] bArr9 = new byte[4];
                                    bufferedInputStream2.read(bArr9);
                                    if (!Arrays.equals(bArr9, O)) {
                                        break;
                                    }
                                    int readInt3 = x55.readInt();
                                    uv03.write(bArr9);
                                    uv03.d(readInt3);
                                    if (readInt3 % 2 == 1) {
                                        readInt3++;
                                    }
                                    br7.l(x55, uv03, readInt3);
                                }
                                K(uv03);
                            } else {
                                c(x55, uv03, bArr6, bArr7);
                                K(uv03);
                            }
                        } else if (Arrays.equals(bArr4, bArr6) || Arrays.equals(bArr4, bArr7)) {
                            int readInt4 = x55.readInt();
                            int i6 = readInt4 % 2 == 1 ? readInt4 + 1 : readInt4;
                            byte[] bArr10 = new byte[3];
                            boolean equals2 = Arrays.equals(bArr4, bArr6);
                            byte[] bArr11 = J;
                            if (equals2) {
                                x55.read(bArr10);
                                byte[] bArr12 = new byte[3];
                                uv0 = uv02;
                                if (x55.read(bArr12) != 3 || !Arrays.equals(bArr11, bArr12)) {
                                    throw new IOException("Encountered error while checking VP8 signature");
                                }
                                i4 = x55.readInt();
                                i3 = (i4 << 18) >> 18;
                                i6 -= 10;
                                i2 = (i4 << 2) >> 18;
                                z2 = false;
                            } else {
                                uv0 = uv02;
                                if (!Arrays.equals(bArr4, bArr7)) {
                                    i4 = 0;
                                    i3 = 0;
                                    z2 = false;
                                    i2 = 0;
                                } else if (x55.readByte() == 47) {
                                    i4 = x55.readInt();
                                    z2 = true;
                                    i3 = (i4 & 16383) + 1;
                                    i2 = ((i4 & 268419072) >>> 14) + 1;
                                    if ((i4 & 268435456) == 0) {
                                        z2 = false;
                                    }
                                    i6 -= 5;
                                } else {
                                    throw new IOException("Encountered error while checking VP8L signature");
                                }
                            }
                            uv03.write(bArr5);
                            uv03.d(10);
                            byte[] bArr13 = new byte[10];
                            if (z2) {
                                bArr13[0] = (byte) (bArr13[0] | 16);
                            }
                            bArr13[0] = (byte) (bArr13[0] | 8);
                            int i7 = i3 - 1;
                            int i8 = i2 - 1;
                            bArr = bArr3;
                            bArr13[4] = (byte) i7;
                            bArr13[5] = (byte) (i7 >> 8);
                            bArr13[6] = (byte) (i7 >> 16);
                            bArr13[7] = (byte) i8;
                            bArr13[8] = (byte) (i8 >> 8);
                            bArr13[9] = (byte) (i8 >> 16);
                            uv03.write(bArr13);
                            uv03.write(bArr4);
                            uv03.d(readInt4);
                            if (Arrays.equals(bArr4, bArr6)) {
                                uv03.write(bArr10);
                                uv03.write(bArr11);
                                uv03.d(i4);
                            } else if (Arrays.equals(bArr4, bArr7)) {
                                uv03.write(47);
                                uv03.d(i4);
                            }
                            br7.l(x55, uv03, i6);
                            K(uv03);
                            br7.m(x55, uv03);
                            byte[] bArr14 = bArr;
                            uv0 uv04 = uv0;
                            uv04.d(byteArrayOutputStream2.size() + bArr14.length);
                            uv04.write(bArr14);
                            byteArrayOutputStream2.writeTo(uv04);
                            br7.i(byteArrayOutputStream2);
                        }
                    } else {
                        throw new IOException("Encountered invalid length while parsing WebP chunk type");
                    }
                }
                uv0 = uv02;
                bArr = bArr3;
                br7.m(x55, uv03);
                byte[] bArr142 = bArr;
                uv0 uv042 = uv0;
                uv042.d(byteArrayOutputStream2.size() + bArr142.length);
                uv042.write(bArr142);
                byteArrayOutputStream2.writeTo(uv042);
                br7.i(byteArrayOutputStream2);
            } catch (Exception e2) {
                e = e2;
                byteArrayOutputStream = byteArrayOutputStream2;
                try {
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    br7.i(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                br7.i(byteArrayOutputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            throw new IOException("Failed to save WebP file", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x020f, code lost:
        r4 = 0;
        r5 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = 0
            r4 = 1
            java.lang.String r5 = "DateTime"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0020
            java.lang.String r5 = "DateTimeOriginal"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0020
            java.lang.String r5 = "DateTimeDigitized"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004f
        L_0x0020:
            if (r2 == 0) goto L_0x004f
            java.util.regex.Pattern r5 = d0
            java.util.regex.Matcher r5 = r5.matcher(r2)
            boolean r5 = r5.find()
            java.util.regex.Pattern r6 = e0
            java.util.regex.Matcher r6 = r6.matcher(r2)
            boolean r6 = r6.find()
            int r7 = r20.length()
            r8 = 19
            if (r7 != r8) goto L_0x004e
            if (r5 != 0) goto L_0x0043
            if (r6 != 0) goto L_0x0043
            goto L_0x004e
        L_0x0043:
            if (r6 == 0) goto L_0x004f
            java.lang.String r5 = "-"
            java.lang.String r6 = ":"
            java.lang.String r2 = r2.replaceAll(r5, r6)
            goto L_0x004f
        L_0x004e:
            return
        L_0x004f:
            java.lang.String r5 = "ISOSpeedRatings"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0059
            java.lang.String r1 = "PhotographicSensitivity"
        L_0x0059:
            r5 = 2
            if (r2 == 0) goto L_0x00ca
            java.util.HashSet r6 = X
            boolean r6 = r6.contains(r1)
            if (r6 == 0) goto L_0x00ca
            java.lang.String r6 = "GPSTimeStamp"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x00b2
            java.util.regex.Pattern r6 = c0
            java.util.regex.Matcher r2 = r6.matcher(r2)
            boolean r6 = r2.find()
            if (r6 != 0) goto L_0x0079
            return
        L_0x0079:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r2.group(r4)
            int r7 = java.lang.Integer.parseInt(r7)
            r6.append(r7)
            java.lang.String r7 = "/1,"
            r6.append(r7)
            java.lang.String r8 = r2.group(r5)
            int r8 = java.lang.Integer.parseInt(r8)
            r6.append(r8)
            r6.append(r7)
            r7 = 3
            java.lang.String r2 = r2.group(r7)
            int r2 = java.lang.Integer.parseInt(r2)
            r6.append(r2)
            java.lang.String r2 = "/1"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            goto L_0x00ca
        L_0x00b2:
            double r6 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x00c9 }
            a65 r2 = new a65     // Catch:{ NumberFormatException -> 0x00c9 }
            r8 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r6 = r6 * r8
            long r6 = (long) r6     // Catch:{ NumberFormatException -> 0x00c9 }
            r8 = 10000(0x2710, double:4.9407E-320)
            r2.<init>(r6, r8)     // Catch:{ NumberFormatException -> 0x00c9 }
            java.lang.String r2 = r2.toString()     // Catch:{ NumberFormatException -> 0x00c9 }
            goto L_0x00ca
        L_0x00c9:
            return
        L_0x00ca:
            r6 = r3
        L_0x00cb:
            z55[][] r7 = T
            int r7 = r7.length
            if (r6 >= r7) goto L_0x0320
            r7 = 4
            if (r6 != r7) goto L_0x00db
            boolean r7 = r0.h
            if (r7 != 0) goto L_0x00db
        L_0x00d7:
            r5 = r4
            r4 = r3
            goto L_0x031a
        L_0x00db:
            java.util.HashMap[] r7 = W
            r7 = r7[r6]
            java.lang.Object r7 = r7.get(r1)
            z55 r7 = (defpackage.z55) r7
            if (r7 == 0) goto L_0x00d7
            java.util.HashMap[] r8 = r0.e
            if (r2 != 0) goto L_0x00f1
            r7 = r8[r6]
            r7.remove(r1)
            goto L_0x00d7
        L_0x00f1:
            android.util.Pair r9 = q(r2)
            java.lang.Object r10 = r9.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r11 = -1
            int r12 = r7.c
            if (r12 == r10) goto L_0x015d
            java.lang.Object r10 = r9.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r12 != r10) goto L_0x010d
            goto L_0x015d
        L_0x010d:
            int r7 = r7.d
            if (r7 == r11) goto L_0x0127
            java.lang.Object r10 = r9.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r7 == r10) goto L_0x0125
            java.lang.Object r10 = r9.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r7 != r10) goto L_0x0127
        L_0x0125:
            r12 = r7
            goto L_0x015d
        L_0x0127:
            if (r12 == r4) goto L_0x015d
            r10 = 7
            if (r12 == r10) goto L_0x015d
            if (r12 != r5) goto L_0x012f
            goto L_0x015d
        L_0x012f:
            boolean r8 = t
            if (r8 == 0) goto L_0x00d7
            java.lang.String[] r8 = P
            r10 = r8[r12]
            if (r7 != r11) goto L_0x013a
            goto L_0x013c
        L_0x013a:
            r7 = r8[r7]
        L_0x013c:
            java.lang.Object r7 = r9.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r7 = r8[r7]
            java.lang.Object r7 = r9.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != r11) goto L_0x0151
            goto L_0x00d7
        L_0x0151:
            java.lang.Object r7 = r9.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r7 = r8[r7]
            goto L_0x00d7
        L_0x015d:
            java.lang.String r7 = "/"
            int[] r9 = Q
            java.lang.String r10 = ","
            switch(r12) {
                case 1: goto L_0x02df;
                case 2: goto L_0x02d4;
                case 3: goto L_0x02b0;
                case 4: goto L_0x028c;
                case 5: goto L_0x0254;
                case 6: goto L_0x0166;
                case 7: goto L_0x02d4;
                case 8: goto L_0x0166;
                case 9: goto L_0x0213;
                case 10: goto L_0x01a7;
                case 11: goto L_0x0166;
                case 12: goto L_0x0168;
                default: goto L_0x0166;
            }
        L_0x0166:
            goto L_0x00d7
        L_0x0168:
            java.lang.String[] r7 = r2.split(r10, r11)
            int r10 = r7.length
            double[] r11 = new double[r10]
            r12 = r3
        L_0x0170:
            int r13 = r7.length
            if (r12 >= r13) goto L_0x017d
            r13 = r7[r12]
            double r13 = java.lang.Double.parseDouble(r13)
            r11[r12] = r13
            int r12 = r12 + r4
            goto L_0x0170
        L_0x017d:
            r7 = r8[r6]
            java.nio.ByteOrder r8 = r0.g
            r12 = 12
            r9 = r9[r12]
            int r9 = r9 * r10
            byte[] r9 = new byte[r9]
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r9)
            r9.order(r8)
            r8 = r3
        L_0x0190:
            if (r8 >= r10) goto L_0x0199
            r13 = r11[r8]
            r9.putDouble(r13)
            int r8 = r8 + r4
            goto L_0x0190
        L_0x0199:
            y55 r8 = new y55
            byte[] r9 = r9.array()
            r8.<init>(r12, r9, r10)
            r7.put(r1, r8)
            goto L_0x00d7
        L_0x01a7:
            java.lang.String[] r10 = r2.split(r10, r11)
            int r12 = r10.length
            a65[] r13 = new defpackage.a65[r12]
            r14 = r3
        L_0x01af:
            int r15 = r10.length
            if (r14 >= r15) goto L_0x01d8
            r15 = r10[r14]
            java.lang.String[] r15 = r15.split(r7, r11)
            a65 r5 = new a65
            r16 = r15[r3]
            r17 = r12
            double r11 = java.lang.Double.parseDouble(r16)
            long r11 = (long) r11
            r15 = r15[r4]
            double r3 = java.lang.Double.parseDouble(r15)
            long r3 = (long) r3
            r5.<init>(r11, r3)
            r13[r14] = r5
            r3 = 1
            int r14 = r14 + r3
            r4 = r3
            r12 = r17
            r3 = 0
            r5 = 2
            r11 = -1
            goto L_0x01af
        L_0x01d8:
            r17 = r12
            r3 = r8[r6]
            java.nio.ByteOrder r4 = r0.g
            r5 = 10
            r7 = r9[r5]
            int r7 = r7 * r17
            byte[] r7 = new byte[r7]
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7)
            r7.order(r4)
            r8 = r17
            r4 = 0
        L_0x01f0:
            if (r4 >= r8) goto L_0x0203
            r9 = r13[r4]
            long r10 = r9.a
            int r10 = (int) r10
            r7.putInt(r10)
            long r9 = r9.b
            int r9 = (int) r9
            r7.putInt(r9)
            r9 = 1
            int r4 = r4 + r9
            goto L_0x01f0
        L_0x0203:
            y55 r4 = new y55
            byte[] r7 = r7.array()
            r4.<init>(r5, r7, r8)
            r3.put(r1, r4)
        L_0x020f:
            r4 = 0
            r5 = 1
            goto L_0x031a
        L_0x0213:
            r3 = r11
            java.lang.String[] r3 = r2.split(r10, r3)
            int r4 = r3.length
            int[] r5 = new int[r4]
            r7 = 0
        L_0x021c:
            int r10 = r3.length
            if (r7 >= r10) goto L_0x022a
            r10 = r3[r7]
            int r10 = java.lang.Integer.parseInt(r10)
            r5[r7] = r10
            r10 = 1
            int r7 = r7 + r10
            goto L_0x021c
        L_0x022a:
            r3 = r8[r6]
            java.nio.ByteOrder r7 = r0.g
            r8 = 9
            r9 = r9[r8]
            int r9 = r9 * r4
            byte[] r9 = new byte[r9]
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r9)
            r9.order(r7)
            r7 = 0
        L_0x023d:
            if (r7 >= r4) goto L_0x0247
            r10 = r5[r7]
            r9.putInt(r10)
            r10 = 1
            int r7 = r7 + r10
            goto L_0x023d
        L_0x0247:
            y55 r5 = new y55
            byte[] r7 = r9.array()
            r5.<init>(r8, r7, r4)
            r3.put(r1, r5)
            goto L_0x020f
        L_0x0254:
            r3 = r11
            java.lang.String[] r4 = r2.split(r10, r3)
            int r5 = r4.length
            a65[] r5 = new defpackage.a65[r5]
            r9 = 0
        L_0x025d:
            int r10 = r4.length
            if (r9 >= r10) goto L_0x0280
            r10 = r4[r9]
            java.lang.String[] r10 = r10.split(r7, r3)
            a65 r3 = new a65
            r11 = 0
            r12 = r10[r11]
            double r11 = java.lang.Double.parseDouble(r12)
            long r11 = (long) r11
            r13 = 1
            r10 = r10[r13]
            double r14 = java.lang.Double.parseDouble(r10)
            long r14 = (long) r14
            r3.<init>(r11, r14)
            r5[r9] = r3
            int r9 = r9 + r13
            r3 = -1
            goto L_0x025d
        L_0x0280:
            r3 = r8[r6]
            java.nio.ByteOrder r4 = r0.g
            y55 r4 = defpackage.y55.d(r5, r4)
            r3.put(r1, r4)
            goto L_0x020f
        L_0x028c:
            r3 = r11
            java.lang.String[] r3 = r2.split(r10, r3)
            int r4 = r3.length
            long[] r4 = new long[r4]
            r11 = 0
        L_0x0295:
            int r5 = r3.length
            if (r11 >= r5) goto L_0x02a3
            r5 = r3[r11]
            long r9 = java.lang.Long.parseLong(r5)
            r4[r11] = r9
            r5 = 1
            int r11 = r11 + r5
            goto L_0x0295
        L_0x02a3:
            r3 = r8[r6]
            java.nio.ByteOrder r5 = r0.g
            y55 r4 = defpackage.y55.c(r4, r5)
            r3.put(r1, r4)
            goto L_0x020f
        L_0x02b0:
            r3 = r11
            java.lang.String[] r3 = r2.split(r10, r3)
            int r4 = r3.length
            int[] r4 = new int[r4]
            r11 = 0
        L_0x02b9:
            int r5 = r3.length
            if (r11 >= r5) goto L_0x02c7
            r5 = r3[r11]
            int r5 = java.lang.Integer.parseInt(r5)
            r4[r11] = r5
            r5 = 1
            int r11 = r11 + r5
            goto L_0x02b9
        L_0x02c7:
            r3 = r8[r6]
            java.nio.ByteOrder r5 = r0.g
            y55 r4 = defpackage.y55.f(r4, r5)
            r3.put(r1, r4)
            goto L_0x020f
        L_0x02d4:
            r3 = r8[r6]
            y55 r4 = defpackage.y55.a(r2)
            r3.put(r1, r4)
            goto L_0x020f
        L_0x02df:
            r3 = r8[r6]
            int r4 = r2.length()
            r5 = 1
            if (r4 != r5) goto L_0x0309
            r4 = 0
            char r7 = r2.charAt(r4)
            r8 = 48
            if (r7 < r8) goto L_0x030a
            char r7 = r2.charAt(r4)
            r9 = 49
            if (r7 > r9) goto L_0x030a
            char r7 = r2.charAt(r4)
            int r7 = r7 - r8
            byte r7 = (byte) r7
            byte[] r8 = new byte[r5]
            r8[r4] = r7
            y55 r7 = new y55
            r7.<init>(r5, r8, r5)
            goto L_0x0317
        L_0x0309:
            r4 = 0
        L_0x030a:
            java.nio.charset.Charset r7 = Z
            byte[] r7 = r2.getBytes(r7)
            y55 r8 = new y55
            int r9 = r7.length
            r8.<init>(r5, r7, r9)
            r7 = r8
        L_0x0317:
            r3.put(r1, r7)
        L_0x031a:
            int r6 = r6 + r5
            r3 = r4
            r4 = r5
            r5 = 2
            goto L_0x00cb
        L_0x0320:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c65.F(java.lang.String, java.lang.String):void");
    }

    public final void G(x55 x55) {
        y55 y55;
        x55 x552 = x55;
        HashMap hashMap = this.e[4];
        y55 y552 = (y55) hashMap.get("Compression");
        if (y552 != null) {
            int h2 = y552.h(this.g);
            this.n = h2;
            if (h2 != 1) {
                if (h2 == 6) {
                    r(x552, hashMap);
                    return;
                } else if (h2 != 7) {
                    return;
                }
            }
            y55 y553 = (y55) hashMap.get("BitsPerSample");
            if (y553 != null) {
                int[] iArr = (int[]) y553.j(this.g);
                int[] iArr2 = u;
                if (!Arrays.equals(iArr2, iArr)) {
                    if (this.d == 3 && (y55 = (y55) hashMap.get("PhotometricInterpretation")) != null) {
                        int h3 = y55.h(this.g);
                        if ((h3 != 1 || !Arrays.equals(iArr, v)) && (h3 != 6 || !Arrays.equals(iArr, iArr2))) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                y55 y554 = (y55) hashMap.get("StripOffsets");
                y55 y555 = (y55) hashMap.get("StripByteCounts");
                if (y554 != null && y555 != null) {
                    long[] k2 = br7.k(y554.j(this.g));
                    long[] k3 = br7.k(y555.j(this.g));
                    if (k2 != null && k2.length != 0 && k3 != null && k3.length != 0 && k2.length == k3.length) {
                        long j2 = 0;
                        for (long j3 : k3) {
                            j2 += j3;
                        }
                        int i2 = (int) j2;
                        byte[] bArr = new byte[i2];
                        this.j = true;
                        this.i = true;
                        this.h = true;
                        int i3 = 0;
                        int i4 = 0;
                        int i5 = 0;
                        while (i3 < k2.length) {
                            int i6 = (int) k2[i3];
                            int i7 = (int) k3[i3];
                            if (i3 < k2.length - 1 && ((long) (i6 + i7)) != k2[i3 + 1]) {
                                this.j = false;
                            }
                            int i8 = i6 - i4;
                            if (i8 >= 0) {
                                long j4 = (long) i8;
                                if (x552.skip(j4) == j4) {
                                    int i9 = i4 + i8;
                                    byte[] bArr2 = new byte[i7];
                                    if (x552.read(bArr2) == i7) {
                                        i4 = i9 + i7;
                                        System.arraycopy(bArr2, 0, bArr, i5, i7);
                                        i5 += i7;
                                        i3++;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        this.m = bArr;
                        if (this.j) {
                            this.k = (int) k2[0];
                            this.l = i2;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.n = 6;
        r(x552, hashMap);
    }

    public final void H(int i2, int i3) {
        HashMap[] hashMapArr = this.e;
        if (!hashMapArr[i2].isEmpty() && !hashMapArr[i3].isEmpty()) {
            y55 y55 = (y55) hashMapArr[i2].get("ImageLength");
            y55 y552 = (y55) hashMapArr[i2].get("ImageWidth");
            y55 y553 = (y55) hashMapArr[i3].get("ImageLength");
            y55 y554 = (y55) hashMapArr[i3].get("ImageWidth");
            if (y55 != null && y552 != null && y553 != null && y554 != null) {
                int h2 = y55.h(this.g);
                int h3 = y552.h(this.g);
                int h4 = y553.h(this.g);
                int h5 = y554.h(this.g);
                if (h2 < h4 && h3 < h5) {
                    HashMap hashMap = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i3];
                    hashMapArr[i3] = hashMap;
                }
            }
        }
    }

    public final void I(b65 b65, int i2) {
        y55 y55;
        y55 y552;
        HashMap[] hashMapArr = this.e;
        y55 y553 = (y55) hashMapArr[i2].get("DefaultCropSize");
        y55 y554 = (y55) hashMapArr[i2].get("SensorTopBorder");
        y55 y555 = (y55) hashMapArr[i2].get("SensorLeftBorder");
        y55 y556 = (y55) hashMapArr[i2].get("SensorBottomBorder");
        y55 y557 = (y55) hashMapArr[i2].get("SensorRightBorder");
        if (y553 != null) {
            if (y553.a == 5) {
                a65[] a65Arr = (a65[]) y553.j(this.g);
                if (a65Arr == null || a65Arr.length != 2) {
                    Arrays.toString(a65Arr);
                    return;
                }
                y552 = y55.d(new a65[]{a65Arr[0]}, this.g);
                y55 = y55.d(new a65[]{a65Arr[1]}, this.g);
            } else {
                int[] iArr = (int[]) y553.j(this.g);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    y552 = y55.e(iArr[0], this.g);
                    y55 = y55.e(iArr[1], this.g);
                }
            }
            hashMapArr[i2].put("ImageWidth", y552);
            hashMapArr[i2].put("ImageLength", y55);
        } else if (y554 == null || y555 == null || y556 == null || y557 == null) {
            y55 y558 = (y55) hashMapArr[i2].get("ImageLength");
            y55 y559 = (y55) hashMapArr[i2].get("ImageWidth");
            if (y558 == null || y559 == null) {
                y55 y5510 = (y55) hashMapArr[i2].get("JPEGInterchangeFormat");
                y55 y5511 = (y55) hashMapArr[i2].get("JPEGInterchangeFormatLength");
                if (y5510 != null && y5511 != null) {
                    int h2 = y5510.h(this.g);
                    int h3 = y5510.h(this.g);
                    b65.d((long) h2);
                    byte[] bArr = new byte[h3];
                    b65.read(bArr);
                    h(new x55(bArr), h2, i2);
                }
            }
        } else {
            int h4 = y554.h(this.g);
            int h5 = y556.h(this.g);
            int h6 = y557.h(this.g);
            int h7 = y555.h(this.g);
            if (h5 > h4 && h6 > h7) {
                y55 e2 = y55.e(h5 - h4, this.g);
                y55 e3 = y55.e(h6 - h7, this.g);
                hashMapArr[i2].put("ImageLength", e2);
                hashMapArr[i2].put("ImageWidth", e3);
            }
        }
    }

    public final void J() {
        H(0, 5);
        H(0, 4);
        H(5, 4);
        HashMap[] hashMapArr = this.e;
        y55 y55 = (y55) hashMapArr[1].get("PixelXDimension");
        y55 y552 = (y55) hashMapArr[1].get("PixelYDimension");
        if (!(y55 == null || y552 == null)) {
            hashMapArr[0].put("ImageWidth", y55);
            hashMapArr[0].put("ImageLength", y552);
        }
        if (hashMapArr[4].isEmpty() && s(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        s(hashMapArr[4]);
        A(0, "ThumbnailOrientation", "Orientation");
        A(0, "ThumbnailImageLength", "ImageLength");
        A(0, "ThumbnailImageWidth", "ImageWidth");
        A(5, "ThumbnailOrientation", "Orientation");
        A(5, "ThumbnailImageLength", "ImageLength");
        A(5, "ThumbnailImageWidth", "ImageWidth");
        A(4, "Orientation", "ThumbnailOrientation");
        A(4, "ImageLength", "ThumbnailImageLength");
        A(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void K(uv0 uv0) {
        HashMap[] hashMapArr;
        int[] iArr;
        Object[] objArr;
        uv0 uv02 = uv0;
        z55[][] z55Arr = T;
        int[] iArr2 = new int[z55Arr.length];
        int[] iArr3 = new int[z55Arr.length];
        z55[] z55Arr2 = U;
        for (z55 z55 : z55Arr2) {
            z(z55.b);
        }
        if (this.h) {
            if (this.i) {
                z("StripOffsets");
                z("StripByteCounts");
            } else {
                z("JPEGInterchangeFormat");
                z("JPEGInterchangeFormatLength");
            }
        }
        int i2 = 0;
        while (true) {
            int length = z55Arr.length;
            hashMapArr = this.e;
            if (i2 >= length) {
                break;
            }
            Object[] array = hashMapArr[i2].entrySet().toArray();
            int length2 = array.length;
            int i3 = 0;
            while (i3 < length2) {
                Map.Entry entry = (Map.Entry) array[i3];
                if (entry.getValue() == null) {
                    objArr = array;
                    hashMapArr[i2].remove(entry.getKey());
                } else {
                    objArr = array;
                }
                i3++;
                array = objArr;
            }
            i2++;
        }
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(z55Arr2[1].b, y55.b(0, this.g));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(z55Arr2[2].b, y55.b(0, this.g));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(z55Arr2[3].b, y55.b(0, this.g));
        }
        if (this.h) {
            if (this.i) {
                hashMapArr[4].put("StripOffsets", y55.e(0, this.g));
                hashMapArr[4].put("StripByteCounts", y55.e(this.l, this.g));
            } else {
                hashMapArr[4].put("JPEGInterchangeFormat", y55.b(0, this.g));
                hashMapArr[4].put("JPEGInterchangeFormatLength", y55.b((long) this.l, this.g));
            }
        }
        int i4 = 0;
        while (true) {
            int length3 = z55Arr.length;
            iArr = Q;
            if (i4 >= length3) {
                break;
            }
            int i5 = 0;
            for (Map.Entry value : hashMapArr[i4].entrySet()) {
                y55 y55 = (y55) value.getValue();
                y55.getClass();
                int i6 = iArr[y55.a] * y55.b;
                if (i6 > 4) {
                    i5 += i6;
                }
            }
            iArr3[i4] = iArr3[i4] + i5;
            i4++;
        }
        int i7 = 8;
        for (int i8 = 0; i8 < z55Arr.length; i8++) {
            if (!hashMapArr[i8].isEmpty()) {
                iArr2[i8] = i7;
                i7 = (hashMapArr[i8].size() * 12) + 6 + iArr3[i8] + i7;
            }
        }
        if (this.h) {
            if (this.i) {
                hashMapArr[4].put("StripOffsets", y55.e(i7, this.g));
            } else {
                hashMapArr[4].put("JPEGInterchangeFormat", y55.b((long) i7, this.g));
            }
            this.k = i7;
            i7 += this.l;
        }
        if (this.d == 4) {
            i7 += 8;
        }
        if (t) {
            for (int i9 = 0; i9 < z55Arr.length; i9++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", new Object[]{Integer.valueOf(i9), Integer.valueOf(iArr2[i9]), Integer.valueOf(hashMapArr[i9].size()), Integer.valueOf(iArr3[i9]), Integer.valueOf(i7)});
            }
        }
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(z55Arr2[1].b, y55.b((long) iArr2[1], this.g));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(z55Arr2[2].b, y55.b((long) iArr2[2], this.g));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(z55Arr2[3].b, y55.b((long) iArr2[3], this.g));
        }
        int i10 = this.d;
        if (i10 == 4) {
            uv02.g((short) i7);
            uv02.write(a0);
        } else if (i10 == 13) {
            uv02.d(i7);
            uv02.write(D);
        } else if (i10 == 14) {
            uv02.write(I);
            uv02.d(i7);
        }
        uv02.g(this.g == ByteOrder.BIG_ENDIAN ? (short) 19789 : 18761);
        uv02.c = this.g;
        uv02.g((short) 42);
        uv02.d((int) 8);
        for (int i11 = 0; i11 < z55Arr.length; i11++) {
            if (!hashMapArr[i11].isEmpty()) {
                uv02.g((short) hashMapArr[i11].size());
                int size = (hashMapArr[i11].size() * 12) + iArr2[i11] + 2 + 4;
                for (Map.Entry entry2 : hashMapArr[i11].entrySet()) {
                    int i12 = ((z55) W[i11].get(entry2.getKey())).a;
                    y55 y552 = (y55) entry2.getValue();
                    y552.getClass();
                    int i13 = y552.a;
                    int i14 = iArr[i13];
                    int i15 = y552.b;
                    int i16 = i14 * i15;
                    uv02.g((short) i12);
                    uv02.g((short) i13);
                    uv02.d(i15);
                    if (i16 > 4) {
                        uv02.d((int) ((long) size));
                        size += i16;
                    } else {
                        uv02.write(y552.d);
                        if (i16 < 4) {
                            while (i16 < 4) {
                                uv02.a(0);
                                i16++;
                            }
                        }
                    }
                }
                if (i11 != 0 || hashMapArr[4].isEmpty()) {
                    uv02.d((int) 0);
                } else {
                    uv02.d((int) ((long) iArr2[4]));
                }
                for (Map.Entry value2 : hashMapArr[i11].entrySet()) {
                    byte[] bArr = ((y55) value2.getValue()).d;
                    if (bArr.length > 4) {
                        uv02.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.h) {
            uv02.write(o());
        }
        if (this.d == 14 && i7 % 2 == 1) {
            uv02.a(0);
        }
        uv02.c = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String d2 = d("DateTimeOriginal");
        HashMap[] hashMapArr = this.e;
        if (d2 != null && d("DateTime") == null) {
            hashMapArr[0].put("DateTime", y55.a(d2));
        }
        if (d("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", y55.b(0, this.g));
        }
        if (d("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", y55.b(0, this.g));
        }
        if (d("Orientation") == null) {
            hashMapArr[0].put("Orientation", y55.b(0, this.g));
        }
        if (d("LightSource") == null) {
            hashMapArr[1].put("LightSource", y55.b(0, this.g));
        }
    }

    public final String d(String str) {
        if (str != null) {
            y55 f2 = f(str);
            if (f2 != null) {
                if (!X.contains(str)) {
                    return f2.i(this.g);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i2 = f2.a;
                    if (i2 != 5 && i2 != 10) {
                        return null;
                    }
                    a65[] a65Arr = (a65[]) f2.j(this.g);
                    if (a65Arr == null || a65Arr.length != 3) {
                        Arrays.toString(a65Arr);
                        return null;
                    }
                    a65 a65 = a65Arr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) a65.a) / ((float) a65.b)));
                    a65 a652 = a65Arr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) a652.a) / ((float) a652.b)));
                    a65 a653 = a65Arr[2];
                    return String.format("%02d:%02d:%02d", new Object[]{valueOf, valueOf2, Integer.valueOf((int) (((float) a653.a) / ((float) a653.b)))});
                }
                try {
                    return Double.toString(f2.g(this.g));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public final int e(int i2, String str) {
        y55 f2 = f(str);
        if (f2 == null) {
            return i2;
        }
        try {
            return f2.h(this.g);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public final y55 f(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                str = "PhotographicSensitivity";
            }
            for (int i2 = 0; i2 < T.length; i2++) {
                y55 y55 = (y55) this.e[i2].get(str);
                if (y55 != null) {
                    return y55;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:51|52|53) */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010e, code lost:
        throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010f, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0112, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0040, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0107 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(defpackage.b65 r12) {
        /*
            r11 = this;
            java.lang.String r0 = "yes"
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            w55 r2 = new w55     // Catch:{ RuntimeException -> 0x0107 }
            r2.<init>(r12)     // Catch:{ RuntimeException -> 0x0107 }
            defpackage.e65.a(r1, r2)     // Catch:{ RuntimeException -> 0x0107 }
            r2 = 33
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch:{ RuntimeException -> 0x0107 }
            r3 = 34
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch:{ RuntimeException -> 0x0107 }
            r4 = 26
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0107 }
            r5 = 17
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0107 }
            boolean r4 = r0.equals(r4)     // Catch:{ RuntimeException -> 0x0107 }
            if (r4 == 0) goto L_0x0043
            r0 = 29
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0107 }
            r4 = 30
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0107 }
            r5 = 31
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0107 }
            goto L_0x005f
        L_0x0040:
            r11 = move-exception
            goto L_0x010f
        L_0x0043:
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x0107 }
            if (r0 == 0) goto L_0x005c
            r0 = 18
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0107 }
            r4 = 19
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0107 }
            r5 = 24
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0107 }
            goto L_0x005f
        L_0x005c:
            r0 = 0
            r4 = r0
            r5 = r4
        L_0x005f:
            java.util.HashMap[] r6 = r11.e
            r7 = 0
            if (r0 == 0) goto L_0x0075
            r8 = r6[r7]     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r9 = "ImageWidth"
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ RuntimeException -> 0x0107 }
            java.nio.ByteOrder r10 = r11.g     // Catch:{ RuntimeException -> 0x0107 }
            y55 r0 = defpackage.y55.e(r0, r10)     // Catch:{ RuntimeException -> 0x0107 }
            r8.put(r9, r0)     // Catch:{ RuntimeException -> 0x0107 }
        L_0x0075:
            if (r4 == 0) goto L_0x0088
            r0 = r6[r7]     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r8 = "ImageLength"
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ RuntimeException -> 0x0107 }
            java.nio.ByteOrder r9 = r11.g     // Catch:{ RuntimeException -> 0x0107 }
            y55 r4 = defpackage.y55.e(r4, r9)     // Catch:{ RuntimeException -> 0x0107 }
            r0.put(r8, r4)     // Catch:{ RuntimeException -> 0x0107 }
        L_0x0088:
            r0 = 6
            if (r5 == 0) goto L_0x00b0
            int r4 = java.lang.Integer.parseInt(r5)     // Catch:{ RuntimeException -> 0x0107 }
            r5 = 90
            if (r4 == r5) goto L_0x00a2
            r5 = 180(0xb4, float:2.52E-43)
            if (r4 == r5) goto L_0x00a0
            r5 = 270(0x10e, float:3.78E-43)
            if (r4 == r5) goto L_0x009d
            r4 = 1
            goto L_0x00a3
        L_0x009d:
            r4 = 8
            goto L_0x00a3
        L_0x00a0:
            r4 = 3
            goto L_0x00a3
        L_0x00a2:
            r4 = r0
        L_0x00a3:
            r5 = r6[r7]     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r6 = "Orientation"
            java.nio.ByteOrder r8 = r11.g     // Catch:{ RuntimeException -> 0x0107 }
            y55 r4 = defpackage.y55.e(r4, r8)     // Catch:{ RuntimeException -> 0x0107 }
            r5.put(r6, r4)     // Catch:{ RuntimeException -> 0x0107 }
        L_0x00b0:
            if (r2 == 0) goto L_0x0103
            if (r3 == 0) goto L_0x0103
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ RuntimeException -> 0x0107 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ RuntimeException -> 0x0107 }
            if (r3 <= r0) goto L_0x00fb
            long r4 = (long) r2     // Catch:{ RuntimeException -> 0x0107 }
            r12.d(r4)     // Catch:{ RuntimeException -> 0x0107 }
            byte[] r4 = new byte[r0]     // Catch:{ RuntimeException -> 0x0107 }
            int r5 = r12.read(r4)     // Catch:{ RuntimeException -> 0x0107 }
            if (r5 != r0) goto L_0x00f3
            int r2 = r2 + r0
            int r3 = r3 + -6
            byte[] r0 = a0     // Catch:{ RuntimeException -> 0x0107 }
            boolean r0 = java.util.Arrays.equals(r4, r0)     // Catch:{ RuntimeException -> 0x0107 }
            if (r0 == 0) goto L_0x00eb
            byte[] r0 = new byte[r3]     // Catch:{ RuntimeException -> 0x0107 }
            int r12 = r12.read(r0)     // Catch:{ RuntimeException -> 0x0107 }
            if (r12 != r3) goto L_0x00e3
            r11.o = r2     // Catch:{ RuntimeException -> 0x0107 }
            r11.x(r7, r0)     // Catch:{ RuntimeException -> 0x0107 }
            goto L_0x0103
        L_0x00e3:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r12 = "Can't read exif"
            r11.<init>(r12)     // Catch:{ RuntimeException -> 0x0107 }
            throw r11     // Catch:{ RuntimeException -> 0x0107 }
        L_0x00eb:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r12 = "Invalid identifier"
            r11.<init>(r12)     // Catch:{ RuntimeException -> 0x0107 }
            throw r11     // Catch:{ RuntimeException -> 0x0107 }
        L_0x00f3:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r12 = "Can't read identifier"
            r11.<init>(r12)     // Catch:{ RuntimeException -> 0x0107 }
            throw r11     // Catch:{ RuntimeException -> 0x0107 }
        L_0x00fb:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r12 = "Invalid exif length"
            r11.<init>(r12)     // Catch:{ RuntimeException -> 0x0107 }
            throw r11     // Catch:{ RuntimeException -> 0x0107 }
        L_0x0103:
            r1.release()
            return
        L_0x0107:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0040 }
            java.lang.String r12 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            r11.<init>(r12)     // Catch:{ all -> 0x0040 }
            throw r11     // Catch:{ all -> 0x0040 }
        L_0x010f:
            r1.release()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c65.g(b65):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0141 A[LOOP:0: B:8:0x0023->B:73:0x0141, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0148 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(defpackage.x55 r23, int r24, int r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r25
            boolean r3 = t
            if (r3 == 0) goto L_0x000d
            java.util.Objects.toString(r23)
        L_0x000d:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            r1.b = r4
            byte r4 = r23.readByte()
            java.lang.String r5 = "Invalid marker: "
            r6 = -1
            if (r4 != r6) goto L_0x018b
            byte r7 = r23.readByte()
            r8 = -40
            if (r7 != r8) goto L_0x0173
            r4 = 2
        L_0x0023:
            byte r5 = r23.readByte()
            if (r5 != r6) goto L_0x0159
            byte r5 = r23.readByte()
            if (r3 == 0) goto L_0x0034
            r7 = r5 & 255(0xff, float:3.57E-43)
            java.lang.Integer.toHexString(r7)
        L_0x0034:
            r7 = -39
            if (r5 == r7) goto L_0x0154
            r7 = -38
            if (r5 != r7) goto L_0x003e
            goto L_0x0154
        L_0x003e:
            int r7 = r23.readUnsignedShort()
            int r8 = r7 + -2
            r9 = 4
            int r4 = r4 + r9
            if (r3 == 0) goto L_0x004d
            r10 = r5 & 255(0xff, float:3.57E-43)
            java.lang.Integer.toHexString(r10)
        L_0x004d:
            java.lang.String r10 = "Invalid length"
            if (r8 < 0) goto L_0x014e
            r11 = 0
            r12 = 1
            r13 = -31
            java.util.HashMap[] r14 = r0.e
            if (r5 == r13) goto L_0x00ca
            r13 = -2
            if (r5 == r13) goto L_0x009f
            switch(r5) {
                case -64: goto L_0x006a;
                case -63: goto L_0x006a;
                case -62: goto L_0x006a;
                case -61: goto L_0x006a;
                default: goto L_0x005f;
            }
        L_0x005f:
            switch(r5) {
                case -59: goto L_0x006a;
                case -58: goto L_0x006a;
                case -57: goto L_0x006a;
                default: goto L_0x0062;
            }
        L_0x0062:
            switch(r5) {
                case -55: goto L_0x006a;
                case -54: goto L_0x006a;
                case -53: goto L_0x006a;
                default: goto L_0x0065;
            }
        L_0x0065:
            switch(r5) {
                case -51: goto L_0x006a;
                case -50: goto L_0x006a;
                case -49: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x013f
        L_0x006a:
            r1.a(r12)
            r5 = r14[r2]
            if (r2 == r9) goto L_0x0074
            java.lang.String r8 = "ImageLength"
            goto L_0x0076
        L_0x0074:
            java.lang.String r8 = "ThumbnailImageLength"
        L_0x0076:
            int r11 = r23.readUnsignedShort()
            long r11 = (long) r11
            java.nio.ByteOrder r13 = r0.g
            y55 r11 = defpackage.y55.b(r11, r13)
            r5.put(r8, r11)
            r5 = r14[r2]
            if (r2 == r9) goto L_0x008b
            java.lang.String r8 = "ImageWidth"
            goto L_0x008d
        L_0x008b:
            java.lang.String r8 = "ThumbnailImageWidth"
        L_0x008d:
            int r9 = r23.readUnsignedShort()
            long r11 = (long) r9
            java.nio.ByteOrder r9 = r0.g
            y55 r9 = defpackage.y55.b(r11, r9)
            r5.put(r8, r9)
            int r8 = r7 + -7
            goto L_0x013f
        L_0x009f:
            byte[] r5 = new byte[r8]
            int r7 = r1.read(r5)
            if (r7 != r8) goto L_0x00c2
            java.lang.String r7 = "UserComment"
            java.lang.String r8 = r0.d(r7)
            if (r8 != 0) goto L_0x00bf
            r8 = r14[r12]
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r12 = Z
            r9.<init>(r5, r12)
            y55 r5 = defpackage.y55.a(r9)
            r8.put(r7, r5)
        L_0x00bf:
            r8 = r11
            goto L_0x013f
        L_0x00c2:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Invalid exif"
            r0.<init>(r1)
            throw r0
        L_0x00ca:
            byte[] r5 = new byte[r8]
            r1.readFully(r5)
            int r7 = r4 + r8
            byte[] r9 = a0
            if (r9 != 0) goto L_0x00d6
            goto L_0x00e4
        L_0x00d6:
            int r13 = r9.length
            if (r8 >= r13) goto L_0x00da
            goto L_0x00e4
        L_0x00da:
            r13 = r11
        L_0x00db:
            int r15 = r9.length
            if (r13 >= r15) goto L_0x0127
            byte r15 = r5[r13]
            byte r6 = r9[r13]
            if (r15 == r6) goto L_0x0123
        L_0x00e4:
            byte[] r6 = b0
            if (r6 != 0) goto L_0x00e9
            goto L_0x013d
        L_0x00e9:
            int r9 = r6.length
            if (r8 >= r9) goto L_0x00ed
            goto L_0x013d
        L_0x00ed:
            r9 = r11
        L_0x00ee:
            int r13 = r6.length
            if (r9 >= r13) goto L_0x00fb
            byte r13 = r5[r9]
            byte r15 = r6[r9]
            if (r13 == r15) goto L_0x00f8
            goto L_0x013d
        L_0x00f8:
            int r9 = r9 + 1
            goto L_0x00ee
        L_0x00fb:
            int r9 = r6.length
            int r4 = r4 + r9
            int r6 = r6.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r6, r8)
            java.lang.String r6 = "Xmp"
            java.lang.String r8 = r0.d(r6)
            if (r8 != 0) goto L_0x013d
            r8 = r14[r11]
            y55 r9 = new y55
            int r13 = r5.length
            long r14 = (long) r4
            r20 = 1
            r16 = r9
            r17 = r14
            r19 = r5
            r21 = r13
            r16.<init>(r17, r19, r20, r21)
            r8.put(r6, r9)
            r0.s = r12
            goto L_0x013d
        L_0x0123:
            int r13 = r13 + 1
            r6 = -1
            goto L_0x00db
        L_0x0127:
            int r6 = r9.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r6, r8)
            int r4 = r24 + r4
            int r6 = r9.length
            int r4 = r4 + r6
            r0.o = r4
            r0.x(r2, r5)
            x55 r4 = new x55
            r4.<init>((byte[]) r5)
            r0.G(r4)
        L_0x013d:
            r4 = r7
            goto L_0x00bf
        L_0x013f:
            if (r8 < 0) goto L_0x0148
            r1.a(r8)
            int r4 = r4 + r8
            r6 = -1
            goto L_0x0023
        L_0x0148:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r10)
            throw r0
        L_0x014e:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r10)
            throw r0
        L_0x0154:
            java.nio.ByteOrder r0 = r0.g
            r1.b = r0
            return
        L_0x0159:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid marker:"
            r1.<init>(r2)
            r2 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0173:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r2 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x018b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r2 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c65.h(x55, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b6, code lost:
        if (r6 != null) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0126 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f2 A[SYNTHETIC, Splitter:B:86:0x00f2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(java.io.BufferedInputStream r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 5000(0x1388, float:7.006E-42)
            r1.mark(r2)
            byte[] r3 = new byte[r2]
            r1.read(r3)
            r18.reset()
            r1 = 0
            r4 = r1
        L_0x0013:
            byte[] r5 = w
            int r6 = r5.length
            r7 = 4
            if (r4 >= r6) goto L_0x0176
            byte r6 = r3[r4]
            byte r5 = r5[r4]
            if (r6 == r5) goto L_0x0172
            java.lang.String r4 = "FUJIFILMCCD-RAW"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.defaultCharset()
            byte[] r4 = r4.getBytes(r5)
            r5 = r1
        L_0x002a:
            int r6 = r4.length
            if (r5 >= r6) goto L_0x016f
            byte r6 = r3[r5]
            byte r8 = r4[r5]
            if (r6 == r8) goto L_0x016b
            x55 r6 = new x55     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r6.<init>((byte[]) r3)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            int r8 = r6.readInt()     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            long r8 = (long) r8     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            byte[] r10 = new byte[r7]     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            r6.read(r10)     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            byte[] r11 = x     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            boolean r10 = java.util.Arrays.equals(r10, r11)     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            if (r10 != 0) goto L_0x004f
        L_0x004a:
            r6.close()
            goto L_0x00b9
        L_0x004f:
            r10 = 1
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r13 = 8
            if (r12 != 0) goto L_0x0065
            long r8 = r6.readLong()     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            r15 = 16
            int r12 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r12 >= 0) goto L_0x0066
            goto L_0x004a
        L_0x0062:
            r0 = move-exception
            r5 = r6
            goto L_0x00b0
        L_0x0065:
            r15 = r13
        L_0x0066:
            long r4 = (long) r2     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x006c
            r8 = r4
        L_0x006c:
            long r8 = r8 - r15
            int r2 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x0072
            goto L_0x004a
        L_0x0072:
            byte[] r2 = new byte[r7]     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            r4 = 0
            r13 = r1
            r14 = r13
        L_0x0078:
            r15 = 4
            long r15 = r8 / r15
            int r15 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r15 >= 0) goto L_0x004a
            int r15 = r6.read(r2)     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            if (r15 == r7) goto L_0x0087
            goto L_0x004a
        L_0x0087:
            int r15 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r15 != 0) goto L_0x008c
            goto L_0x00a9
        L_0x008c:
            byte[] r15 = y     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            boolean r15 = java.util.Arrays.equals(r2, r15)     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            if (r15 == 0) goto L_0x0096
            r13 = 1
            goto L_0x009f
        L_0x0096:
            byte[] r15 = z     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            boolean r15 = java.util.Arrays.equals(r2, r15)     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            if (r15 == 0) goto L_0x009f
            r14 = 1
        L_0x009f:
            if (r13 == 0) goto L_0x00a9
            if (r14 == 0) goto L_0x00a9
            r6.close()
            r0 = 12
            return r0
        L_0x00a9:
            long r4 = r4 + r10
            goto L_0x0078
        L_0x00ab:
            r0 = move-exception
            r5 = 0
            goto L_0x00b0
        L_0x00ae:
            r6 = 0
            goto L_0x00b6
        L_0x00b0:
            if (r5 == 0) goto L_0x00b5
            r5.close()
        L_0x00b5:
            throw r0
        L_0x00b6:
            if (r6 == 0) goto L_0x00b9
            goto L_0x004a
        L_0x00b9:
            x55 r2 = new x55     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            java.nio.ByteOrder r4 = w(r2)     // Catch:{ Exception -> 0x00e8, all -> 0x00da }
            r0.g = r4     // Catch:{ Exception -> 0x00e8, all -> 0x00da }
            r2.b = r4     // Catch:{ Exception -> 0x00e8, all -> 0x00da }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x00e8, all -> 0x00da }
            r5 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r5) goto L_0x00d5
            r5 = 21330(0x5352, float:2.989E-41)
            if (r4 != r5) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            r4 = r1
            goto L_0x00d6
        L_0x00d5:
            r4 = 1
        L_0x00d6:
            r2.close()
            goto L_0x00ee
        L_0x00da:
            r0 = move-exception
            r5 = r2
            goto L_0x00e2
        L_0x00dd:
            r0 = move-exception
            r5 = 0
            goto L_0x00e2
        L_0x00e0:
            r2 = 0
            goto L_0x00e8
        L_0x00e2:
            if (r5 == 0) goto L_0x00e7
            r5.close()
        L_0x00e7:
            throw r0
        L_0x00e8:
            if (r2 == 0) goto L_0x00ed
            r2.close()
        L_0x00ed:
            r4 = r1
        L_0x00ee:
            if (r4 == 0) goto L_0x00f2
            r0 = 7
            return r0
        L_0x00f2:
            x55 r2 = new x55     // Catch:{ Exception -> 0x0116, all -> 0x0113 }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x0116, all -> 0x0113 }
            java.nio.ByteOrder r4 = w(r2)     // Catch:{ Exception -> 0x0111, all -> 0x010e }
            r0.g = r4     // Catch:{ Exception -> 0x0111, all -> 0x010e }
            r2.b = r4     // Catch:{ Exception -> 0x0111, all -> 0x010e }
            short r0 = r2.readShort()     // Catch:{ Exception -> 0x0111, all -> 0x010e }
            r4 = 85
            if (r0 != r4) goto L_0x0109
            r0 = 1
            goto L_0x010a
        L_0x0109:
            r0 = r1
        L_0x010a:
            r2.close()
            goto L_0x0124
        L_0x010e:
            r0 = move-exception
            r5 = r2
            goto L_0x0118
        L_0x0111:
            r5 = r2
            goto L_0x011e
        L_0x0113:
            r0 = move-exception
            r5 = 0
            goto L_0x0118
        L_0x0116:
            r5 = 0
            goto L_0x011e
        L_0x0118:
            if (r5 == 0) goto L_0x011d
            r5.close()
        L_0x011d:
            throw r0
        L_0x011e:
            if (r5 == 0) goto L_0x0123
            r5.close()
        L_0x0123:
            r0 = r1
        L_0x0124:
            if (r0 == 0) goto L_0x0129
            r0 = 10
            return r0
        L_0x0129:
            r0 = r1
        L_0x012a:
            byte[] r2 = C
            int r4 = r2.length
            if (r0 >= r4) goto L_0x013a
            byte r4 = r3[r0]
            byte r2 = r2[r0]
            if (r4 == r2) goto L_0x0137
            r0 = r1
            goto L_0x013b
        L_0x0137:
            int r0 = r0 + 1
            goto L_0x012a
        L_0x013a:
            r0 = 1
        L_0x013b:
            if (r0 == 0) goto L_0x0140
            r0 = 13
            return r0
        L_0x0140:
            r0 = r1
        L_0x0141:
            byte[] r2 = G
            int r4 = r2.length
            if (r0 >= r4) goto L_0x0151
            byte r4 = r3[r0]
            byte r2 = r2[r0]
            if (r4 == r2) goto L_0x014e
        L_0x014c:
            r4 = r1
            goto L_0x0165
        L_0x014e:
            int r0 = r0 + 1
            goto L_0x0141
        L_0x0151:
            r0 = r1
        L_0x0152:
            byte[] r4 = H
            int r5 = r4.length
            if (r0 >= r5) goto L_0x0164
            int r5 = r2.length
            int r5 = r5 + r0
            int r5 = r5 + r7
            byte r5 = r3[r5]
            byte r4 = r4[r0]
            if (r5 == r4) goto L_0x0161
            goto L_0x014c
        L_0x0161:
            int r0 = r0 + 1
            goto L_0x0152
        L_0x0164:
            r4 = 1
        L_0x0165:
            if (r4 == 0) goto L_0x016a
            r0 = 14
            return r0
        L_0x016a:
            return r1
        L_0x016b:
            int r5 = r5 + 1
            goto L_0x002a
        L_0x016f:
            r0 = 9
            return r0
        L_0x0172:
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0176:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c65.i(java.io.BufferedInputStream):int");
    }

    public final void j(b65 b65) {
        int i2;
        int i3;
        m(b65);
        HashMap[] hashMapArr = this.e;
        y55 y55 = (y55) hashMapArr[1].get("MakerNote");
        if (y55 != null) {
            b65 b652 = new b65(y55.d);
            b652.b = this.g;
            byte[] bArr = A;
            byte[] bArr2 = new byte[bArr.length];
            b652.readFully(bArr2);
            b652.d(0);
            byte[] bArr3 = B;
            byte[] bArr4 = new byte[bArr3.length];
            b652.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                b652.d(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                b652.d(12);
            }
            y(b652, 6);
            y55 y552 = (y55) hashMapArr[7].get("PreviewImageStart");
            y55 y553 = (y55) hashMapArr[7].get("PreviewImageLength");
            if (!(y552 == null || y553 == null)) {
                hashMapArr[5].put("JPEGInterchangeFormat", y552);
                hashMapArr[5].put("JPEGInterchangeFormatLength", y553);
            }
            y55 y554 = (y55) hashMapArr[8].get("AspectFrame");
            if (y554 != null) {
                int[] iArr = (int[]) y554.j(this.g);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i4 = iArr[2];
                int i5 = iArr[0];
                if (i4 > i5 && (i2 = iArr[3]) > (i3 = iArr[1])) {
                    int i6 = (i4 - i5) + 1;
                    int i7 = (i2 - i3) + 1;
                    if (i6 < i7) {
                        int i8 = i6 + i7;
                        i7 = i8 - i7;
                        i6 = i8 - i7;
                    }
                    y55 e2 = y55.e(i6, this.g);
                    y55 e3 = y55.e(i7, this.g);
                    hashMapArr[0].put("ImageWidth", e2);
                    hashMapArr[0].put("ImageLength", e3);
                }
            }
        }
    }

    public final void k(x55 x55) {
        if (t) {
            Objects.toString(x55);
        }
        x55.b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = C;
        x55.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = x55.readInt();
                byte[] bArr2 = new byte[4];
                if (x55.read(bArr2) == 4) {
                    int i2 = length + 8;
                    if (i2 == 16) {
                        if (!Arrays.equals(bArr2, E)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, F)) {
                        if (Arrays.equals(bArr2, D)) {
                            byte[] bArr3 = new byte[readInt];
                            if (x55.read(bArr3) == readInt) {
                                int readInt2 = x55.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.o = i2;
                                    x(0, bArr3);
                                    J();
                                    G(new x55(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + br7.h(bArr2));
                        }
                        int i3 = readInt + 4;
                        x55.a(i3);
                        length = i2 + i3;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void l(x55 x55) {
        if (t) {
            Objects.toString(x55);
        }
        x55.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        x55.read(bArr);
        x55.read(bArr2);
        x55.read(bArr3);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        int i4 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i3];
        x55.a(i2 - x55.c);
        x55.read(bArr4);
        h(new x55(bArr4), i2, 5);
        x55.a(i4 - x55.c);
        x55.b = ByteOrder.BIG_ENDIAN;
        int readInt = x55.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            int readUnsignedShort = x55.readUnsignedShort();
            int readUnsignedShort2 = x55.readUnsignedShort();
            if (readUnsignedShort == S.a) {
                short readShort = x55.readShort();
                short readShort2 = x55.readShort();
                y55 e2 = y55.e(readShort, this.g);
                y55 e3 = y55.e(readShort2, this.g);
                HashMap[] hashMapArr = this.e;
                hashMapArr[0].put("ImageLength", e2);
                hashMapArr[0].put("ImageWidth", e3);
                return;
            }
            x55.a(readUnsignedShort2);
        }
    }

    public final void m(b65 b65) {
        u(b65);
        y(b65, 0);
        I(b65, 0);
        I(b65, 5);
        I(b65, 4);
        J();
        if (this.d == 8) {
            HashMap[] hashMapArr = this.e;
            y55 y55 = (y55) hashMapArr[1].get("MakerNote");
            if (y55 != null) {
                b65 b652 = new b65(y55.d);
                b652.b = this.g;
                b652.a(6);
                y(b652, 9);
                y55 y552 = (y55) hashMapArr[9].get("ColorSpace");
                if (y552 != null) {
                    hashMapArr[1].put("ColorSpace", y552);
                }
            }
        }
    }

    public final void n(b65 b65) {
        if (t) {
            Objects.toString(b65);
        }
        m(b65);
        HashMap[] hashMapArr = this.e;
        y55 y55 = (y55) hashMapArr[0].get("JpgFromRaw");
        if (y55 != null) {
            h(new x55(y55.d), (int) y55.c, 5);
        }
        y55 y552 = (y55) hashMapArr[0].get("ISO");
        y55 y553 = (y55) hashMapArr[1].get("PhotographicSensitivity");
        if (y552 != null && y553 == null) {
            hashMapArr[1].put("PhotographicSensitivity", y552);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0063 A[SYNTHETIC, Splitter:B:37:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0082 A[Catch:{ Exception -> 0x0097, all -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0093 A[SYNTHETIC, Splitter:B:59:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x009c A[SYNTHETIC, Splitter:B:66:0x009c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] o() {
        /*
            r8 = this;
            boolean r0 = r8.h
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            byte[] r0 = r8.m
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.res.AssetManager$AssetInputStream r0 = r8.c     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            if (r0 == 0) goto L_0x0026
            boolean r2 = r0.markSupported()     // Catch:{ Exception -> 0x001f, all -> 0x001a }
            if (r2 == 0) goto L_0x0022
            r0.reset()     // Catch:{ Exception -> 0x001f, all -> 0x001a }
        L_0x0018:
            r2 = r1
            goto L_0x004d
        L_0x001a:
            r8 = move-exception
            r2 = r1
        L_0x001c:
            r1 = r0
            goto L_0x008e
        L_0x001f:
            r2 = r1
            goto L_0x0097
        L_0x0022:
            defpackage.br7.i(r0)
            return r1
        L_0x0026:
            java.lang.String r0 = r8.a     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            if (r0 == 0) goto L_0x0038
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            java.lang.String r2 = r8.a     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            goto L_0x0018
        L_0x0032:
            r8 = move-exception
            r2 = r1
            goto L_0x008e
        L_0x0035:
            r0 = r1
            r2 = r0
            goto L_0x0097
        L_0x0038:
            java.io.FileDescriptor r0 = r8.b     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            java.io.FileDescriptor r0 = defpackage.d65.b(r0)     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            int r2 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            r3 = 0
            defpackage.d65.c(r0, r3, r2)     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            r7 = r2
            r2 = r0
            r0 = r7
        L_0x004d:
            int r3 = r8.k     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r4 = r8.o     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r3 = r3 + r4
            long r3 = (long) r3     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            long r3 = r0.skip(r3)     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r5 = r8.k     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r6 = r8.o     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r5 = r5 + r6
            long r5 = (long) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            java.lang.String r4 = "Corrupted image"
            if (r3 != 0) goto L_0x0082
            int r3 = r8.l     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r5 = r0.read(r3)     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r6 = r8.l     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            if (r5 != r6) goto L_0x007c
            r8.m = r3     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            defpackage.br7.i(r0)
            if (r2 == 0) goto L_0x0079
            defpackage.d65.a(r2)     // Catch:{ Exception -> 0x0079 }
        L_0x0079:
            return r3
        L_0x007a:
            r8 = move-exception
            goto L_0x001c
        L_0x007c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            r8.<init>(r4)     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            throw r8     // Catch:{ Exception -> 0x0097, all -> 0x007a }
        L_0x0082:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            r8.<init>(r4)     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            throw r8     // Catch:{ Exception -> 0x0097, all -> 0x007a }
        L_0x0088:
            r8 = move-exception
            r2 = r0
            goto L_0x008e
        L_0x008b:
            r2 = r0
            r0 = r1
            goto L_0x0097
        L_0x008e:
            defpackage.br7.i(r1)
            if (r2 == 0) goto L_0x0096
            defpackage.d65.a(r2)     // Catch:{ Exception -> 0x0096 }
        L_0x0096:
            throw r8
        L_0x0097:
            defpackage.br7.i(r0)
            if (r2 == 0) goto L_0x009f
            defpackage.d65.a(r2)     // Catch:{ Exception -> 0x009f }
        L_0x009f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c65.o():byte[]");
    }

    public final void p(x55 x55) {
        if (t) {
            Objects.toString(x55);
        }
        x55.b = ByteOrder.LITTLE_ENDIAN;
        x55.a(G.length);
        int readInt = x55.readInt() + 8;
        byte[] bArr = H;
        x55.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (x55.read(bArr2) == 4) {
                    int readInt2 = x55.readInt();
                    int i2 = length + 8;
                    if (Arrays.equals(I, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (x55.read(bArr3) == readInt2) {
                            this.o = i2;
                            x(0, bArr3);
                            G(new x55(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + br7.h(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i2 + readInt2;
                    if (length != readInt) {
                        if (length <= readInt) {
                            x55.a(readInt2);
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void r(x55 x55, HashMap hashMap) {
        y55 y55 = (y55) hashMap.get("JPEGInterchangeFormat");
        y55 y552 = (y55) hashMap.get("JPEGInterchangeFormatLength");
        if (y55 != null && y552 != null) {
            int h2 = y55.h(this.g);
            int h3 = y552.h(this.g);
            if (this.d == 7) {
                h2 += this.p;
            }
            if (h2 > 0 && h3 > 0) {
                this.h = true;
                if (this.a == null && this.c == null && this.b == null) {
                    byte[] bArr = new byte[h3];
                    x55.skip((long) h2);
                    x55.read(bArr);
                    this.m = bArr;
                }
                this.k = h2;
                this.l = h3;
            }
        }
    }

    public final boolean s(HashMap hashMap) {
        y55 y55 = (y55) hashMap.get("ImageLength");
        y55 y552 = (y55) hashMap.get("ImageWidth");
        if (y55 == null || y552 == null) {
            return false;
        }
        return y55.h(this.g) <= 512 && y552.h(this.g) <= 512;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(java.io.InputStream r8) {
        /*
            r7 = this;
            boolean r0 = t
            r1 = 0
            r2 = r1
        L_0x0004:
            z55[][] r3 = T     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            int r3 = r3.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            if (r2 >= r3) goto L_0x0018
            java.util.HashMap[] r3 = r7.e     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r4.<init>()     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r3[r2] = r4     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0015:
            r8 = move-exception
            goto L_0x0087
        L_0x0018:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r3 = 5000(0x1388, float:7.006E-42)
            r2.<init>(r8, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            int r8 = r7.i(r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r7.d = r8     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r3 = 14
            r4 = 13
            r5 = 9
            r6 = 4
            if (r8 == r6) goto L_0x0060
            if (r8 == r5) goto L_0x0060
            if (r8 == r4) goto L_0x0060
            if (r8 != r3) goto L_0x0035
            goto L_0x0060
        L_0x0035:
            b65 r8 = new b65     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r8.<init>((java.io.InputStream) r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            int r1 = r7.d     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r2 = 12
            if (r1 != r2) goto L_0x0044
            r7.g(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x0056
        L_0x0044:
            r2 = 7
            if (r1 != r2) goto L_0x004b
            r7.j(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x0056
        L_0x004b:
            r2 = 10
            if (r1 != r2) goto L_0x0053
            r7.n(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x0056
        L_0x0053:
            r7.m(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
        L_0x0056:
            int r1 = r7.o     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            long r1 = (long) r1     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r8.d(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r7.G(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x007e
        L_0x0060:
            x55 r8 = new x55     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r8.<init>((java.io.InputStream) r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            int r2 = r7.d     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            if (r2 != r6) goto L_0x006d
            r7.h(r8, r1, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x007e
        L_0x006d:
            if (r2 != r4) goto L_0x0073
            r7.k(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x007e
        L_0x0073:
            if (r2 != r5) goto L_0x0079
            r7.l(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x007e
        L_0x0079:
            if (r2 != r3) goto L_0x007e
            r7.p(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
        L_0x007e:
            r7.a()
            if (r0 == 0) goto L_0x0096
        L_0x0083:
            r7.v()
            goto L_0x0096
        L_0x0087:
            r7.a()
            if (r0 == 0) goto L_0x008f
            r7.v()
        L_0x008f:
            throw r8
        L_0x0090:
            r7.a()
            if (r0 == 0) goto L_0x0096
            goto L_0x0083
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c65.t(java.io.InputStream):void");
    }

    public final void u(x55 x55) {
        ByteOrder w2 = w(x55);
        this.g = w2;
        x55.b = w2;
        int readUnsignedShort = x55.readUnsignedShort();
        int i2 = this.d;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = x55.readInt();
            if (readInt >= 8) {
                int i3 = readInt - 8;
                if (i3 > 0) {
                    x55.a(i3);
                    return;
                }
                return;
            }
            throw new IOException(zr6.h(readInt, "Invalid first Ifd offset: "));
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    public final void v() {
        int i2 = 0;
        while (true) {
            HashMap[] hashMapArr = this.e;
            if (i2 < hashMapArr.length) {
                hashMapArr[i2].size();
                for (Map.Entry entry : hashMapArr[i2].entrySet()) {
                    y55 y55 = (y55) entry.getValue();
                    String str = (String) entry.getKey();
                    y55.toString();
                    y55.i(this.g);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void x(int i2, byte[] bArr) {
        b65 b65 = new b65(bArr);
        u(b65);
        y(b65, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(defpackage.b65 r27, int r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            int r3 = r1.c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.HashSet r4 = r0.f
            r4.add(r3)
            short r3 = r27.readShort()
            if (r3 > 0) goto L_0x0018
            return
        L_0x0018:
            r6 = 0
        L_0x0019:
            boolean r7 = t
            java.util.HashMap[] r10 = r0.e
            if (r6 >= r3) goto L_0x0235
            int r12 = r27.readUnsignedShort()
            int r13 = r27.readUnsignedShort()
            int r15 = r27.readInt()
            int r14 = r1.c
            r20 = r6
            long r5 = (long) r14
            r16 = 4
            long r5 = r5 + r16
            java.util.HashMap[] r14 = V
            r14 = r14[r2]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            java.lang.Object r8 = r14.get(r8)
            z55 r8 = (defpackage.z55) r8
            if (r7 == 0) goto L_0x0069
            java.lang.Integer r9 = java.lang.Integer.valueOf(r28)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            if (r8 == 0) goto L_0x0053
            java.lang.String r11 = r8.b
        L_0x0050:
            r21 = r3
            goto L_0x0055
        L_0x0053:
            r11 = 0
            goto L_0x0050
        L_0x0055:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r22 = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            java.lang.Object[] r3 = new java.lang.Object[]{r9, r14, r11, r3, r4}
            java.lang.String r4 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String.format(r4, r3)
            goto L_0x006d
        L_0x0069:
            r21 = r3
            r22 = r4
        L_0x006d:
            r9 = 3
            r11 = 7
            if (r8 != 0) goto L_0x0075
        L_0x0071:
            r23 = r10
            goto L_0x00cf
        L_0x0075:
            if (r13 <= 0) goto L_0x0071
            int[] r14 = Q
            int r4 = r14.length
            if (r13 < r4) goto L_0x007d
            goto L_0x0071
        L_0x007d:
            int r4 = r8.c
            if (r4 == r11) goto L_0x0096
            if (r13 != r11) goto L_0x0084
            goto L_0x0096
        L_0x0084:
            if (r4 == r13) goto L_0x0096
            int r11 = r8.d
            if (r11 != r13) goto L_0x008b
            goto L_0x0096
        L_0x008b:
            r3 = 4
            if (r4 == r3) goto L_0x0094
            if (r11 != r3) goto L_0x0091
            goto L_0x0094
        L_0x0091:
            r3 = 9
            goto L_0x0098
        L_0x0094:
            if (r13 != r9) goto L_0x0091
        L_0x0096:
            r3 = 7
            goto L_0x00b3
        L_0x0098:
            if (r4 == r3) goto L_0x009c
            if (r11 != r3) goto L_0x00a1
        L_0x009c:
            r3 = 8
            if (r13 != r3) goto L_0x00a1
            goto L_0x0096
        L_0x00a1:
            r3 = 12
            if (r4 == r3) goto L_0x00a7
            if (r11 != r3) goto L_0x00ac
        L_0x00a7:
            r3 = 11
            if (r13 != r3) goto L_0x00ac
            goto L_0x0096
        L_0x00ac:
            if (r7 == 0) goto L_0x0071
            java.lang.String[] r3 = P
            r3 = r3[r13]
            goto L_0x0071
        L_0x00b3:
            if (r13 != r3) goto L_0x00b6
            r13 = r4
        L_0x00b6:
            long r3 = (long) r15
            r11 = r14[r13]
            r23 = r10
            long r9 = (long) r11
            long r3 = r3 * r9
            r9 = 0
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x00cd
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            r9 = 1
            goto L_0x00d2
        L_0x00cd:
            r9 = 0
            goto L_0x00d2
        L_0x00cf:
            r3 = 0
            goto L_0x00cd
        L_0x00d2:
            if (r9 != 0) goto L_0x00db
            r1.d(r5)
            r9 = r22
            goto L_0x022b
        L_0x00db:
            int r9 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            java.lang.String r10 = "Compression"
            if (r9 <= 0) goto L_0x0142
            int r9 = r27.readInt()
            int r11 = r0.d
            r14 = 7
            if (r11 != r14) goto L_0x00f6
            java.lang.String r11 = r8.b
            java.lang.String r14 = "MakerNote"
            boolean r11 = r14.equals(r11)
            if (r11 == 0) goto L_0x00fb
            r0.p = r9
        L_0x00f6:
            r24 = r3
            r16 = r15
            goto L_0x013d
        L_0x00fb:
            r11 = 6
            if (r2 != r11) goto L_0x00f6
            java.lang.String r14 = "ThumbnailImage"
            java.lang.String r11 = r8.b
            boolean r11 = r14.equals(r11)
            if (r11 == 0) goto L_0x00f6
            r0.q = r9
            r0.r = r15
            java.nio.ByteOrder r11 = r0.g
            r14 = 6
            y55 r11 = defpackage.y55.e(r14, r11)
            int r14 = r0.q
            r16 = r15
            long r14 = (long) r14
            java.nio.ByteOrder r2 = r0.g
            y55 r2 = defpackage.y55.b(r14, r2)
            int r14 = r0.r
            long r14 = (long) r14
            r24 = r3
            java.nio.ByteOrder r3 = r0.g
            y55 r3 = defpackage.y55.b(r14, r3)
            r4 = 4
            r14 = r23[r4]
            r14.put(r10, r11)
            r11 = r23[r4]
            java.lang.String r14 = "JPEGInterchangeFormat"
            r11.put(r14, r2)
            r2 = r23[r4]
            java.lang.String r4 = "JPEGInterchangeFormatLength"
            r2.put(r4, r3)
        L_0x013d:
            long r2 = (long) r9
            r1.d(r2)
            goto L_0x0146
        L_0x0142:
            r24 = r3
            r16 = r15
        L_0x0146:
            java.util.HashMap r2 = Y
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x01bb
            r3 = 3
            if (r13 == r3) goto L_0x0180
            r3 = 4
            if (r13 == r3) goto L_0x0174
            r3 = 8
            if (r13 == r3) goto L_0x016f
            r3 = 9
            if (r13 == r3) goto L_0x0169
            r3 = 13
            if (r13 == r3) goto L_0x0169
            r3 = -1
            goto L_0x0185
        L_0x0169:
            int r3 = r27.readInt()
        L_0x016d:
            long r3 = (long) r3
            goto L_0x0185
        L_0x016f:
            short r3 = r27.readShort()
            goto L_0x016d
        L_0x0174:
            int r3 = r27.readInt()
            long r3 = (long) r3
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r9
            goto L_0x0185
        L_0x0180:
            int r3 = r27.readUnsignedShort()
            goto L_0x016d
        L_0x0185:
            if (r7 == 0) goto L_0x0196
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            java.lang.String r8 = r8.b
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r8}
            java.lang.String r8 = "Offset: %d, tagName: %s"
            java.lang.String.format(r8, r7)
        L_0x0196:
            r7 = 0
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x01b4
            int r7 = (int) r3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = r22
            boolean r7 = r9.contains(r7)
            if (r7 != 0) goto L_0x01b6
            r1.d(r3)
            int r2 = r2.intValue()
            r0.y(r1, r2)
            goto L_0x01b6
        L_0x01b4:
            r9 = r22
        L_0x01b6:
            r1.d(r5)
            goto L_0x022b
        L_0x01bb:
            r9 = r22
            int r2 = r1.c
            int r3 = r0.o
            int r2 = r2 + r3
            r3 = r24
            int r3 = (int) r3
            byte[] r3 = new byte[r3]
            r1.readFully(r3)
            y55 r4 = new y55
            long r11 = (long) r2
            r14 = r4
            r2 = r16
            r15 = r11
            r17 = r3
            r18 = r13
            r19 = r2
            r14.<init>(r15, r17, r18, r19)
            r2 = r23[r28]
            java.lang.String r3 = r8.b
            r2.put(r3, r4)
            java.lang.String r2 = "DNGVersion"
            java.lang.String r3 = r8.b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ee
            r2 = 3
            r0.d = r2
        L_0x01ee:
            java.lang.String r2 = "Make"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x01fe
            java.lang.String r2 = "Model"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x020c
        L_0x01fe:
            java.nio.ByteOrder r2 = r0.g
            java.lang.String r2 = r4.i(r2)
            java.lang.String r7 = "PENTAX"
            boolean r2 = r2.contains(r7)
            if (r2 != 0) goto L_0x021d
        L_0x020c:
            boolean r2 = r10.equals(r3)
            if (r2 == 0) goto L_0x0221
            java.nio.ByteOrder r2 = r0.g
            int r2 = r4.h(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L_0x0221
        L_0x021d:
            r2 = 8
            r0.d = r2
        L_0x0221:
            int r2 = r1.c
            long r2 = (long) r2
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x022b
            r1.d(r5)
        L_0x022b:
            int r6 = r20 + 1
            short r6 = (short) r6
            r2 = r28
            r4 = r9
            r3 = r21
            goto L_0x0019
        L_0x0235:
            r9 = r4
            r23 = r10
            int r2 = r27.readInt()
            if (r7 == 0) goto L_0x024b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "nextIfdOffset: %d"
            java.lang.String.format(r4, r3)
        L_0x024b:
            long r3 = (long) r2
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0278
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r9.contains(r2)
            if (r2 != 0) goto L_0x0278
            r1.d(r3)
            r2 = 4
            r3 = r23[r2]
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x026c
            r0.y(r1, r2)
            goto L_0x0278
        L_0x026c:
            r2 = 5
            r3 = r23[r2]
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0278
            r0.y(r1, r2)
        L_0x0278:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c65.y(b65, int):void");
    }

    public final void z(String str) {
        for (int i2 = 0; i2 < T.length; i2++) {
            this.e[i2].remove(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0052 A[SYNTHETIC, Splitter:B:28:0x0052] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c65(java.io.FileDescriptor r5) {
        /*
            r4 = this;
            r4.<init>()
            z55[][] r0 = T
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r4.e = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r4.f = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r4.g = r0
            if (r5 == 0) goto L_0x0056
            r0 = 0
            r4.c = r0
            r4.a = r0
            int r1 = android.system.OsConstants.SEEK_CUR     // Catch:{ Exception -> 0x0035 }
            r2 = 0
            defpackage.d65.c(r5, r2, r1)     // Catch:{ Exception -> 0x0035 }
            r4.b = r5
            java.io.FileDescriptor r5 = defpackage.d65.b(r5)     // Catch:{ Exception -> 0x002c }
            r1 = 1
            goto L_0x0038
        L_0x002c:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "Failed to duplicate file descriptor"
            r5.<init>(r0, r4)
            throw r5
        L_0x0035:
            r4.b = r0
            r1 = 0
        L_0x0038:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x004c }
            r2.<init>(r5)     // Catch:{ all -> 0x004c }
            r4.t(r2)     // Catch:{ all -> 0x0049 }
            defpackage.br7.i(r2)
            if (r1 == 0) goto L_0x0048
            defpackage.d65.a(r5)     // Catch:{ Exception -> 0x0048 }
        L_0x0048:
            return
        L_0x0049:
            r4 = move-exception
            r0 = r2
            goto L_0x004d
        L_0x004c:
            r4 = move-exception
        L_0x004d:
            defpackage.br7.i(r0)
            if (r1 == 0) goto L_0x0055
            defpackage.d65.a(r5)     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            throw r4
        L_0x0056:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "fileDescriptor cannot be null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c65.<init>(java.io.FileDescriptor):void");
    }

    public c65(InputStream inputStream) {
        z55[][] z55Arr = T;
        this.e = new HashMap[z55Arr.length];
        this.f = new HashSet(z55Arr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        this.a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    d65.c(fileInputStream.getFD(), 0, OsConstants.SEEK_CUR);
                    this.c = null;
                    this.b = fileInputStream.getFD();
                } catch (Exception unused) {
                }
            }
            this.c = null;
            this.b = null;
        }
        t(inputStream);
    }
}
