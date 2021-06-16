package info.wupeng.drugstore.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 测试控制器
 * @author: wupeng
 * @create: 2021-06-16 18:06
 */
@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/test")
	private String test() {

		return "test";
	}
}
