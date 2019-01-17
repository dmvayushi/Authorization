package Upload.Directory.Service;

import Upload.Directory.Model.ChangeUserDetails;
import Upload.Directory.Model.Users;
import Upload.Directory.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChangeUserDetailsService implements  UserDetailsService {

    @Autowired
    private UsersRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Users> optionalUsers = userRepository.findByName(username);
        optionalUsers.ifPresent(users -> new ChangeUserDetails(users));
        optionalUsers.orElseThrow(() -> new UsernameNotFoundException("user is not found"));
         return optionalUsers.map(ChangeUserDetails::new).get();

    }

}








