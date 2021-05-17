package com.edusystem.Controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.fastjson.JSON;
import com.edusystem.entity.Response.MyResponse;
import com.edusystem.entity.Student;
import com.edusystem.service.Impl.ScoreServiceImpl;
import com.edusystem.util.ExcelListener.ScoreData;
import com.edusystem.util.ExcelListener.ScoreListenter;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.util.IOUtils;
import org.apache.tomcat.util.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 花菜
 * @date 2021/5/11 19:58
 */
@Slf4j
@RestController
@RequestMapping("score")
public class ScoreController {

    @Autowired
    ScoreServiceImpl scoreService;

    @Value("${gorit.file.root.path}")
    private String filePath;

    @Value("${gorit.file.root.muban}")
    private String mubanfilePath;

    @PostMapping("/update/hand")
    @ResponseBody
    public MyResponse updateScoreWithHand(
            HttpServletRequest request,
            @RequestParam Map data) {
        log.info("方法：手动更新学生成绩。当前token为{}" , request.getHeader("token"));
        MyResponse result;
        HashMap res = scoreService.updateScoreWithHand(data, request.getHeader("token"));
        result = res.get(20000) != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, "请求成功" , res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String)res.get(18000),null);
        return result;
    }
    @PostMapping("/save/hand")
    @ResponseBody
    public MyResponse saveScoreWithHand(
            HttpServletRequest request,
            @RequestParam Map data) {
        log.info("方法：手动保存学生成绩。当前token为{}" , request.getHeader("token"));
        MyResponse result;
        HashMap res = scoreService.saveScoreWithHand(data, request.getHeader("token"));
        result = res.get(20000) != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, "请求成功" , res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String)res.get(18000),null);
        return result;
    }

    /**
     * 教师获取自己教的某门课的学生成绩列表
     * @param request
     * @param data
     * @return
     */
    @GetMapping("/data")
    @ResponseBody
    public MyResponse getScoreData(
            HttpServletRequest request,
            @RequestParam Map data) {
        log.info("方法：获取学生成绩列表。当前token为{}" , request.getHeader("token"));
        MyResponse result;
        HashMap res = scoreService.getScoreData(data, request.getHeader("token"));
        result = res.get(20000) != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, "请求成功" , res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String)res.get(18000),null);
        return result;
    }

    /**
     * 学生获取自己的成绩列表
     * @param request
     * @param data
     * @return
     */
    @GetMapping("/student/data")
    @ResponseBody
    public MyResponse getStudentScores(
            HttpServletRequest request,
            @RequestParam Map data) {
        log.info("方法：获取学生成绩列表。当前token为{}" , request.getHeader("token"));
        MyResponse result;
        HashMap res = scoreService.getStudentScores(data, request.getHeader("token"));
        result = res.get(20000) != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, "请求成功" , res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String)res.get(18000),null);
        return result;
    }

    /**
     * 学生获取自己的某一门课程的成绩
     * @param request
     * @param data
     * @return
     */
    @GetMapping("/student/data/withteachtaskid")
    @ResponseBody
    public MyResponse getStudentScoreByTeachtaskid(
            HttpServletRequest request,
            @RequestParam Map data) {
        log.info("方法：获取学生某课程的成绩。当前token为{}" , request.getHeader("token"));
        MyResponse result;
        HashMap res = scoreService.getStudentScoreByTeachtaskid(data, request.getHeader("token"));
        result = res.get(20000) != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, "请求成功" , res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String)res.get(18000),null);
        return result;
    }

    /**
     * 可视化学生成绩--管理员或教师获取某一个班 某学年 某学期下的课程列表==》每一门课程的最高最低平均分，每一个分段有多少人
     * @param request
     * @param data
     * @return
     */
    @GetMapping("/data/chart")
    @ResponseBody
    public MyResponse getStudentScoreForChart(
            HttpServletRequest request,
            @RequestParam Map data) {
        log.info("方法：获取某一个班 某学年 某学期下的课程列表以及其成绩。当前token为{}" , request.getHeader("token"));
        MyResponse result;
        HashMap res = scoreService.getStudentScoreForChart(data, request.getHeader("token"));
        result = res.get(20000) != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, "请求成功" , res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String)res.get(18000),null);
        return result;
    }

    /**
     * 可视化学生成绩--学生获取自己 某学年 某学期下的课程列表==》某分段下的课程有几门，每一门课程的分数组成
     * @param request
     * @param data
     * @return
     */
    @GetMapping("/data/own/chart")
    @ResponseBody
    public MyResponse getOwnScoreForChart(
            HttpServletRequest request,
            @RequestParam Map data) {
        log.info("方法：学生获取自己 某学年 某学期下的课程列表以及其成绩。当前token为{}" , request.getHeader("token"));
        MyResponse result;
        HashMap res = scoreService.getOwnScoreForChart(data, request.getHeader("token"));
        result = res.get(20000) != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, "请求成功" , res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String)res.get(18000),null);
        return result;
    }


    @PostMapping("/save/xls")
    @ResponseBody
    public MyResponse upload(
            HttpServletRequest request,
            @RequestParam("file") MultipartFile file) throws IOException {
        log.info("方法：批量录入学生成绩列表。当前token为{}" , request.getHeader("token"));
        MyResponse result = null;
        String fileName = file.getOriginalFilename(); // 获取文件全名
        String templatePath = filePath; //设置文件路径
        File dest0 = new File(templatePath);
        File dest = new File(dest0, fileName);
        //文件上传-覆盖
        try {
            // 检测是否存在目录 检测文件是否存在
            if (!dest0.getParentFile().exists()) {
                dest0.getParentFile().mkdirs();
            }
            if (!dest.exists()) {
                dest.mkdirs();
            }
            file.transferTo(dest);
        } catch (Exception e) {
            e.printStackTrace();
            result = new MyResponse(MyResponse.Fail_CODE, "批量上传成绩失败", null);
            return result;
        }
        String finameUrl = templatePath+fileName;
        ExcelReader excelReader = null;
        try {
            excelReader = EasyExcel.read(finameUrl, ScoreData.class, new ScoreListenter(scoreService,request.getHeader("token"))).build();
            ReadSheet readSheet = EasyExcel.readSheet(0).build();
            excelReader.read(readSheet);

            result = new MyResponse(MyResponse.SUCCESS_CODE, "批量上传成绩成功", null);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result = new MyResponse(MyResponse.Fail_CODE, "批量上传成绩失败", null);
            return result;
        } finally {
            if (excelReader != null) {
                // 这里千万别忘记关闭，读的时候会创建临时文件，到时磁盘会崩的
                excelReader.finish();
            }
        }
//        String tk_id = request.getHeader("tk_id");
//        // 设置固定的日期格式
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        // 得到格式化后的日期
//        String format = sdf.format(new Date());
//        // 获取上传的文件名称
//        String fileName = file.getOriginalFilename();
//        // 时间 和 日期拼接-->   tk_id_2021-01-12_XXX.jpg
//        String newFileName = tk_id + "_" + format + "_" + fileName;
//        // 得到文件保存的位置以及新文件名
//        File dest = new File(filePath + newFileName);
//        try {
//            // 上传的文件被保存了
//            file.transferTo(dest);
//            // 打印日志
//            log.info("上传成功，当前上传的文件保存在 {}", filePath + newFileName);
//            // 自定义返回的统一的 JSON 格式的数据，可以直接返回这个字符串也是可以的。
//            result = new MyResponse(MyResponse.SUCCESS_CODE, "上传文件成功!");
//        } catch (IOException e) {
//            log.error(e.toString());
//        } catch (Exception e) {
//            log.error("方法：批量录入学生成绩。内部错误");
//            result = new MyResponse(MyResponse.Fail_CODE, "上传文件错误！");
//        }
    }
    @GetMapping("/muban/down")
    public MyResponse download( @RequestParam String token, final HttpServletResponse response, final HttpServletRequest request ) throws UnsupportedEncodingException {
        MyResponse result;
        log.info("方法：下载成绩上传模板。当前token为{}", token);

        //文件名 可以通过形参传进来
        String fileName = "student_score.xlsx";
        //要下载的文件地址 可以通过形参传进来

        // 如果文件名不为空，则进行下载
        if (fileName != null) {
            //设置文件路径
             File file = new File(mubanfilePath+fileName);
             System.out.println(mubanfilePath+fileName);
            // 如果文件名存在，则进行下载
            if (file.exists()) {
                // 配置文件下载
                response.setHeader("content-type", "application/octet-stream");
                response.setContentType("application/octet-stream");
                // 下载文件能正常显示中文
                response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));

                // 实现文件下载
                byte[] buffer = new byte[1024];
                FileInputStream fis = null;
                BufferedInputStream bis = null;
                try {
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    OutputStream os = response.getOutputStream();
                    int i = bis.read(buffer);
                    while (i != -1) {
                        os.write(buffer, 0, i);
                        i = bis.read(buffer);
                    }

                    System.out.println("Download the song successfully!");
                } catch (Exception e) {
                    System.out.println("Download the song failed!");
                    result = new MyResponse(MyResponse.Fail_CODE, "下载附件失败", null);
                    return result;
                } finally {
                    if (bis != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return null;
//        result = new MyResponse(MyResponse.SUCCESS_CODE, "下载附件成功", null);
//        return result;
    }
//        OutputStream os = null;
//        InputStream is = null;
//        try {
//            // 取得输出流
//            os = response.getOutputStream();
//            // 清空输出流
//            response.reset();
//            response.setContentType("application/x-download;charset=GBK");
//            response.setHeader("Content-Disposition", "attachment;filename=" + new String(fileName.getBytes("utf-8"), "iso-8859-1"));
//            // 读取流
//            File f = new File(filepath);
//            is = new FileInputStream(f);
//            if (is == null) {
//                result = new MyResponse(MyResponse.Fail_CODE, "下载附件失败 ", null);
//                return result;
//            }
//            // 复制
//            IOUtils.copy(is, response.getOutputStream());
//            response.getOutputStream().flush();
//        } catch (IOException e) {
//            result = new MyResponse(MyResponse.Fail_CODE, "下载附件失败,error:" + e.getMessage(), null);
//            return result;
//        }
//        // 文件的关闭放在finally中
//        finally {
//            try {
//                if (is != null) {
//                    is.close();
//                }
//            } catch (IOException e) {
//                log.error(e.toString());
//            }
//            try {
//                if (os != null) {
//                    os.close();
//                }
//            } catch (IOException e) {
//                log.error(e.toString());
//            }
//        }
//        result =  new MyResponse(MyResponse.SUCCESS_CODE, "下载附件成功"  , null);
//        return result;
//
//    }

//        ===================================

//        OutputStream os = null;
//        InputStream is= null;
//
//        String rootPath = filePath;
//        String fileName = "students_score.xlsx";
//         try {
//            // 取得输出流
//            os = response.getOutputStream();
//            // 清空输出流
//            response.reset();
//            response.setContentType("application/x-download;charset=GBK");
//            response.setHeader("Content-Disposition", "attachment;filename="+ new String(fileName.getBytes("utf-8"), "iso-8859-1"));
//            //读取流
//            File f = new File(rootPath+fileName);
//            is = new FileInputStream(f);
//            if (is == null) {
//                log.error("下载附件失败，请检查文件“" + fileName + "”是否存在");
//                result = new MyResponse(MyResponse.Fail_CODE, "下载附件失败，请检查文件“" + fileName + "”是否存在",null);
//                return result;
//            }
//            //复制
//            IOUtils.copy(is, response.getOutputStream());
//            response.getOutputStream().flush();
//        } catch (IOException e) {
//            result = new MyResponse(MyResponse.Fail_CODE, "下载附件失败,error:"+e.getMessage(),null);
//            return result;
//        }
//        //文件的关闭放在finally中
//        finally
//        {
//            try {
//                if (is != null) {
//                    is.close();
//                }
//            } catch (IOException e) {
//                log.error(String.valueOf(e));
//            }
//            try {
//                if (os != null) {
//                    os.close();
//                }
//            } catch (IOException e) {
//                log.error(String.valueOf(e));
//            }
//        }
//        return null;

//        MyResponse result;
//        HashMap res = scoreService.saveScoreWithHand(data, request.getHeader("token"));
//        result = res.get(20000) != null ?
//                new MyResponse(MyResponse.SUCCESS_CODE, "请求成功" , res.get(20000)) :
//                new MyResponse(MyResponse.Fail_CODE, (String)res.get(18000),null);
//        return result;
//        return null;

}
