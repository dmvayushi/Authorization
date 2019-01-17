package Upload.Directory.Controller;

import Upload.Directory.Model.Users;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/directory")
public class DirController {

    @PreAuthorize("hasRoleof('Admin')")
    @GetMapping("/secured/")
    public String EnterInThePage() {
        return "you are already entered in the home page ";
    }

}